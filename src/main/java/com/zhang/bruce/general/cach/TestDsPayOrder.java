package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.rule.FunctionTest.isNull;


/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/29 10:27 上午
 */
public class TestDsPayOrder {
    public static void main(String[] args) {

    }

    public static NormDefine test() {
        return NormDefineBuilder.createNorm("单商户近N小时内线上收单入金交易金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        String key ;
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        // 接收转账--按照接收方除了nocardPay，都是拼接
                        if (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER")) {
                            key = getBackUpValue(order.getBackUp(),"targetMerchantNo");
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT") || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT_BOOKPAY")) {
                            key = getBackUpValue(order.getBackUp(),"creditMerchantNo");
                        } else {
                            key = order.getColCustUserId();
                        }
                        return key;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String prod = order.getProduct();
                        String biz = order.getOrderChnl();
                        String signName = getMapValue(order.getGoodsInfo(),"signName");
                        boolean filter;
                        if (biz.equals("MEC_BALANCE_PAYMENT_FE")) {
                            String payerName = getMapValue(order.getGoodsInfo(), "payerName");
                            filter = !payerName.equals(signName);
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_RECHARGE")){
                            String payerName = getBackUpValue(order.getBackUp(), "payerName");
                            filter = !payerName.equals(signName);
                        } else if (biz.equals("EPOS_FE") || biz.equals("DS_FE")) {
                            String payWay = getBackUpValue(order.getBackUp(), "payWay");
                            filter = "B2B".equals(payWay) || "B2C".equals(payWay);
                        } else if (prod.equals("NOCARDPAY") || biz.equals("MEC_BALANCE_PAYMENT_TRANSFER")
                                || biz.equals("BANK_TRANS_PAYMENT_FE")
                                || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT") || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT_BOOKPAY")) {
                            filter = true;
                        } else {
                            filter = false;
                        }
                        return notNull(order.getColCustUserId()) && filter  &&
                                "1".equals(order.getStatus());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        String prod = "其他";
                        if ("NOCARDPAY".equals(order.getProduct())) {
                            prod = "无卡支付";
                        } else if (biz.equals("EPOS_FE") || biz.equals("DS_FE")) {
                            prod = "网银支付";
                        } else if (biz.equals("BANK_TRANS_PAYMENT_FE")) {
                            prod = "银行转账支付";
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT_BOOKPAY")) {
                            prod = "记账簿余额支付";
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT")) {
                            prod = "账户余额支付";
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER")) {
                            prod = "接收转账";
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_FE") || biz.equals("MEC_BALANCE_PAYMENT_RECHARGE")) {
                            prod = "网银充值";
                        }
                        return new MergeableMapObject(prod, new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }
    public static NormDefine test4() {
        return NormDefineBuilder.createNorm("同商户过去N小时出款特定出金金额")
                .selectCachedRecord("remit-mch", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                })
                .setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String prod = order.getProd();
                        boolean filter = prod.equals("WITHDRAW") || prod.equals("DFDF") || prod.equals("RJT") || prod.equals("S0") || prod.equals("D0");
                        return notNull(order.getMecNo()) && "1".equals(order.getStatus()) && filter;
                    }
                })
                .setExpireMode("24ph").setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                })
               .setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        String prod = "其他";
                        long amt = order.getAmt();
                        if ("WITHDRAW".equals(order.getProd())) {
                            prod = "提现";
                        } else if("DFDF".equals(order.getProd()) || "RJT".equals(order.getProd())){
                            prod = "代付";
                        } else if("S0".equals(order.getProd()) || "D0".equals(order.getProd())){
                            prod = "0类结算到卡";
                            BigDecimal accountAmount = BigDecimal.ZERO;
                            Map<String,String> prodMsg = backUpToMap(order.getProdMsg());
                            accountAmount = new BigDecimal(prodMsg.get("accountAmount").toString());
                            accountAmount = accountAmount.multiply(new BigDecimal(1000));
                            amt = order.getAmt() - accountAmount.longValue();
                        }
                        return new MergeableMapObject(prod,new SumNumber(amt));
                    }
                }).init();
    }
    public static NormDefine test7() {
        return NormDefineBuilder.createNorm("同商户过去N小时转账账户余额特定出金金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        String key ;
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        // 接收转账--按照接收方除了nocardPay，都是拼接
                        if (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER") || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT")) {
                            key = getBackUpValue(order.getBackUp(),"merchantNo");
                        } else {
                            key = order.getColCustUserId();
                        }
                        return key;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        boolean filter = false;
                        if (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER") || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT")) {
                            String merchantNo = getBackUpValue(order.getBackUp(),"merchantNo");
                            if (!isNull(merchantNo)) {
                                filter = true;
                            }
                        }
                        return  filter && "1".equals(order.getStatus());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        String prod = "其他";
                        if (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER")) {
                            prod = "转账转出方";
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT")) {
                            prod = "账户余额支付转出方";
                        }
                        return new MergeableMapObject(prod, new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }
    public static NormDefine test1() {
        return NormDefineBuilder.createNorm("同商户近N小时的交易金额").selectCachedRecord("offline-mch", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return notNull(order.getMerchantId()) && "1".equals(order.getStatus());
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return  new SumNumber(order.getTransAmount());
                    }
                }).init();
    }
    public static NormDefine test2(){
        return NormDefineBuilder.createNorm("同商编下支付产品和业务方为X充值来源Y近N天累计成功交易次数").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return order.getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getColCustUserId()) && ("MEC_BALANCE_PAYMENT_FE".equals(order.getOrderChnl()) || "ACCOUNT_RECHARGE_FE".equals(order.getOrderChnl())) && "1".equals(order.getStatus());
                    }
                }).setExpireMode("5pd")
                .setObjectDate(new DateItem() {
                    @Override
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    @Override
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String launchMode = getMapValue(order.getGoodsInfo(),"launchMode");
                        if (isNull(launchMode)) {
                            launchMode = "OTHER";
                        }
                        return new MergeableMapObject(order.getOrderChnl(),new MergeableMapObject(launchMode,new CountNumber(1L)));
                    }
                }).init();
    }
    public static NormDefine test3(){
        return NormDefineBuilder.createNorm("签约主体近N小时某收单产品P成功金额").selectCachedRecord("signSubject", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String signType = getMapValue(order.getGoodsInfo(),"signType");
                        String signName = getMapValue(order.getGoodsInfo(),"signName");
                        String legalIdNo = getMapValue(order.getGoodsInfo(),"legalIdNo");
                        String keyStr = "";
                        if ("PERSON".equals(signType)) {
                            keyStr = legalIdNo;
                        } else if (notNull(signType) && !"PERSON".equals(signType)) {
                            keyStr = signName;
                        }
                        return keyStr;
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return ("NOCARDPAY".equals(order.getProduct()) || "FE".equals(order.getProduct()) || "ACCOUNT".equals(order.getProduct())) && "1".equals(order.getStatus());
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String signType = getMapValue(order.getGoodsInfo(),"signType");
                        String signName = getMapValue(order.getGoodsInfo(),"signName");
                        String legalIdNo = getMapValue(order.getGoodsInfo(),"legalIdNo");
                        return ("PERSON".equals(signType) && notNull(legalIdNo)) || (notNull(signType) && !"PERSON".equals(signType) && notNull(signName));
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String prod = "其他";
                        if ("NOCARDPAY".equals(order.getProduct())) {
                            prod = "无卡";
                        } else if ("NETPAY".equals(order.getProduct())) {
                            prod = "网银";
                        } else if ("FE".equals(order.getProduct())) {
                            prod = "聚合";
                        } else if ("ACCOUNT".equals(order.getProduct())) {
                            prod = "账户支付";
                        }
                        return new MergeableMapObject(prod, new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }
    public static NormDefine test6(){
        return NormDefineBuilder.createNorm("单商户近72小时内线下收单成功交易金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return  notNull(order.getMerchantId())
                                && "1".equals(order.getStatus());
                    }
                }).setExpireMode("1ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }

    static String getBackUpValue (Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if(obj1 == null || obj2== null){
                return null;
            }
            String backUp = obj1.toString();
            String key = obj2.toString();
            Map<String,String> map = backUpToMap(backUp);
            if(map.get(key) != null){
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
    static Map<String,String> backUpToMap (String reqInfo){
        try {
            Map<String, String> result = new HashMap<String, String>();
            if (com.yeepay.g3.utils.common.StringUtils.isBlank(reqInfo)) {
                return result;
            }
            reqInfo = filterJsonFromReqInfo(reqInfo, "goodsInfo=");
            reqInfo = filterJsonFromReqInfo(reqInfo, "toolsInfo=");
            String[] reqInfoArray = reqInfo.split(",");
            if (reqInfoArray != null && reqInfoArray.length > 0) {
                for (String req : reqInfoArray) {
                    String[] reqFactorArray = new String[2];
                    if (com.yeepay.g3.utils.common.StringUtils.isNotBlank(req)) {
                        if (req.indexOf("=") > 0) {
                            String str1 = req.substring(0, req.indexOf("="));
                            String str2 = req.substring(req.indexOf("=") + 1, req.length());
                            reqFactorArray[0] = str1;
                            reqFactorArray[1] = str2;
                            if (reqFactorArray != null && reqFactorArray.length > 0) {
                                if (reqFactorArray.length == 2) {
                                    result.put(reqFactorArray[0].trim(), reqFactorArray[1].trim());
                                } else {
                                    result.put(reqFactorArray[0].trim(), "");
                                }
                            }
                        }
                    }
                }
            }
            return result;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
    static String filterJsonFromReqInfo (String reqInfo, String jsonKey){
        try {
            LoggerUtil.getLogger().debug("reqInfo == {}", reqInfo);
            LoggerUtil.getLogger().debug("jsonKey == {}", jsonKey);
            String result = "";
            int goodsinfoIdx = reqInfo.indexOf(jsonKey);
            if (goodsinfoIdx > 0) {
                String goodsInfoPrefix = reqInfo.substring(0, goodsinfoIdx);
                String goodsInfoSuffix = reqInfo.substring(goodsinfoIdx
                        + jsonKey.length());
                if (goodsInfoSuffix.length() > 0) {
                    if ("{".equals(goodsInfoSuffix.substring(0, 1))) {
                        goodsInfoSuffix = goodsInfoSuffix.substring(1);
                        int goodsinfoEndIdx = goodsInfoSuffix.indexOf("}");
                        if (goodsinfoEndIdx >= 0) {
                            goodsInfoSuffix = goodsInfoSuffix
                                    .substring(goodsinfoEndIdx + 1);
                            result = goodsInfoPrefix + goodsInfoSuffix;
                        } else {
                            // 不需要过滤
                            result = reqInfo;
                        }
                    } else {
                        // 不需要过滤
                        result = reqInfo;
                    }
                } else {
                    // 不需要过滤
                    result = reqInfo;
                }
            } else {
                // 不需要过滤
                result = reqInfo;
            }
            return result;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
    static String getMapValue (Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if(obj1 == null || obj2== null){
                return null;
            }
            String goodsInfo = obj1.toString();
            String key = obj2.toString();
            Map<String,String> map = transGoodsIfToMap(goodsInfo);
            if(map.get(key) != null){
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }
    static   Map<String,String>  transGoodsIfToMap(Object obj){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            Map<String,String> res = new HashMap<String, String>();
            if(obj==null||"".equals(obj.toString())){
                return res;
            }
            String goodsInfo = obj.toString();
            goodsInfo = goodsInfo.trim().substring(1,goodsInfo.length()-1);
            goodsInfo = goodsInfo.replaceAll("\"", "");
            String [] strings = goodsInfo.split(",");
            for (String s:strings) {
                String [] ss  = s.split(":");
                if(ss!=null&&ss.length>1 && s.indexOf(":")!=-1){
                    res.put(ss[0], s.substring(s.indexOf(":")+1));
                }
            }
            return res;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }


}
