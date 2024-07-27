package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;
import com.tcredit.streaming.utils.nlp.TextComparator;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.rule.FunctionTest.isNull;


/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/29 10:27 上午
 */
public class TestDsPayOrder {
    public static void main(String[] args) throws ParseException, InterruptedException {
        List<Object> list = new ArrayList<Object>();
        DSPayOrder obj = new DSPayOrder();
        obj.setProduct("FE");
        obj.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
        obj.setColCustUserId("10033534158");
        obj.setPayCustUserId("501815122779");
        obj.setGoodsInfo("{\"payerBankCardId\":\"DG$1$W05lWsIiPF5wNxEwHV2x8g\",\"merchantCreateTime\":\"2022-10-19 09:39:56\",\"blackTime\":\"不超时\",\"parentSignName\":\"\",\"bsTime\":\"不超时\",\"industry\":\"金融行业线\",\"payerBankCode\":\"DG$1$ywbZKYXT-iRYYvTRe8hEXg\",\"legalName\":\"DG$1$OZ4gbr5Efv7cbnRlg87sFg\",\"limitTime\":\"不超时\",\"subBizcatName\":\"小贷/网贷\",\"merchantContactName\":\"傅奎阳\",\"signType\":\"ENTERPRISE\",\"payerName\":\"上海复其投资有限公司\",\"bizcatName\":\"金融\",\"finalResultSub\":\"消费金融\",\"salesType\":\"DIRECT_SALES\",\"merchantRole\":\"ORDINARY_MERCHANT\",\"merchantInfoAddress\":\"莱蒙都会2栋406\",\"signName\":\"南宁市鼎正小额贷款有限公司\",\"systemMerchantNo\":\"\",\"isProxyIp\":false,\"payerBankCardType\":\"PUBLIC_CARD\",\"legalIdNo\":\"DG$1$iFy-_eUue_fbNOwe04nXQsNlJxn53f_FpvSDik7qFYo\",\"accountType\":\"PaymentAccount\",\"signSubject\":\"南宁市鼎正小额贷款有限公司\",\"subBizcatCode\":\"127025\",\"smsNoStatus\":\"1\",\"uniCrdCode\":\"91450100MABYKBUK1F\",\"customerLevel\":\"1\",\"launchMode\":\"mecbackgd\",\"cashierTypeRisk\":\"page\",\"bizcatCode\":\"127\",\"finalResult\":\"金融\",\"secondParentMerchantNo\":\"\"}");
        obj.setBackUp("orderType=MINI_PROGRAM,production=DS,occurTime=2023-05-09 11:27:11,payWay=B2B,sequenceId=2305091127111580893034539978,serverId=,bankMsg=,requestId=105_202305098309154301122460,paymentId=2305091127111580893034539978,bankTradeNo=,synConsumeTime=,appId=wxaf35009675aa0b2a,tradeError=,tradeResult=1,amount=5.00,paySystem=AGGPAY,bankChannelId=UNION_NET_OPEN_YLSJ6067,productId=FE,bizOrder=1013202305090000006239137885,bankError=,bankCardType=CFT,completeTime=2023-05-09 11:27:16,userId=oJJUI0T3REWhZYullVC6Wt3LMoys,synErrorCode=,transactionId=,bankId=CFT,tradeMsg=,bankOrderNo=5051380817230509,userType=MERCHANT,bankTradeId=,rmSequence=320bf5ee-0b95-4589-811a-9bdd347037b8,targetMerchantNo=10033534158");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-01 11:12:32"));
        obj.setTransAmount(786000L);
        obj.setStatus("1");
//
//        DSPayOrder obj1 = new DSPayOrder();
//        obj1.setProduct("FE");
//        obj1.setColCustUserId("10033534158");
//        obj1.setOrderChnl("MEC_BALANCE_PAYMENT_FE");
//        obj1.setGoodsInfo("{\"merchantInfoAddress\":\"海南省三亚市海棠区海棠南路X号\",\"signName\":\"张三\",\"payerName\":\"王五\"}");
//        obj1.setColCustUserId("10033534158");
//        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-01 11:12:32"));
//        obj1.setTransAmount(786000L);
//        obj1.setStatus("1");
//        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(DSPayOrder.class, list);
        Set<CachedRecord> calc = test15().calc(a);

       // System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("A一键同用户ID同商户下近N小时内累积交易成功次数");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            //                  1706703435738
//            String transtime = "1711954755608";
//            String duration = "10pd";
//            System.out.println("二次割线");
//            System.out.println(getValueFromMapByBizAndProd(getCacheMap(timedItems, transtime, duration), "MEC_BALANCE_PAYMENT_TRANSFER,MEC_BALANCE_PAYMENT_FE,OFFLINE"));
//
//
//            System.out.println(operCond(getValueFromMapByBizAndProd(getCacheMap(timedItems, transtime, duration), "MEC_BALANCE_PAYMENT_TRANSFER,MEC_BALANCE_PAYMENT_FE,OFFLINE") + 20000L, ">", 1575 * 1000));
        }

    }

    public static NormDefine test() {
        return NormDefineBuilder.createNorm("单商户近N小时内线上收单入金交易金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        String key;
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        // 接收转账--按照接收方除了nocardPay，都是拼接
                        if (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER")) {
                            key = getBackUpValue(order.getBackUp(), "targetMerchantNo");
                        } else if (biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT") || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT_BOOKPAY")) {
                            key = getBackUpValue(order.getBackUp(), "creditMerchantNo");
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
                        String signName = getMapValue(order.getGoodsInfo(), "signName");
                        boolean filter;
                        if (StringUtils.isNotBlank(signName)){
                            if (biz.equals("MEC_BALANCE_PAYMENT_FE")) {
                                String payerName = getMapValue(order.getGoodsInfo(), "payerName");
                                filter = !signName.equals(payerName);
                            } else if (biz.equals("MEC_BALANCE_PAYMENT_RECHARGE")) {
                                String payerName = getBackUpValue(order.getBackUp(), "payerName");
                                filter = !signName.equals(payerName);
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
                        } else {
                            filter = false;
                        }
                        return notNull(order.getColCustUserId()) && filter &&
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
                        String prod = "";
                        if ("NOCARDPAY".equals(order.getProduct())) {
                            prod = "NOCARDPAY";
                        } else {
                            prod = biz;
                        }
                        return new MergeableMapObject(prod, new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }

    public static NormDefine test4() {
        return NormDefineBuilder.createNorm("同商户过去N小时出款特定出金金额")
                .selectCachedRecord("mchid", "PAY.REMIT")
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
                        if ("WITHDRAW".equals(order.getProd()) || "DFDF".equals(order.getProd()) || "RJT".equals(order.getProd())) {
                            prod = order.getProd();
                        } else if ("S0".equals(order.getProd()) || "D0".equals(order.getProd())) {
                            prod = order.getProd();
                            BigDecimal accountAmount = BigDecimal.ZERO;
                            Map<String, String> prodMsg = backUpToMap(order.getProdMsg());
                            accountAmount = new BigDecimal(prodMsg.get("accountAmount").toString());
                            accountAmount = accountAmount.multiply(new BigDecimal(1000));
                            amt = order.getAmt() - accountAmount.longValue();
                        }
                        return new MergeableMapObject(prod, new SumNumber(amt));
                    }
                }).init();
    }

    public static NormDefine test8() {
        return NormDefineBuilder.createNorm("同商户过去N小时0类结算成功金额")
                .selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                })
                .setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return notNull(order.getMecNo()) && ("S0".equals(order.getProd()) || "D0".equals(order.getProd())) && "1".equals(order.getStatus());
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
                        return new MergeableMapObject(order.getProd(), new SumNumber(order.getAmt()));
                    }
                }).init();
    }

    public static NormDefine test7() {
        return NormDefineBuilder.createNorm("同商户过去N小时转账与账户余额特定出金金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return order.getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        return (biz.equals("MEC_BALANCE_PAYMENT_TRANSFER") || biz.equals("MEC_BALANCE_PAYMENT_ACCOUNT")) && "1".equals(order.getStatus()) && notNull(order.getColCustUserId());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String biz = order.getOrderChnl();
                        return new MergeableMapObject(biz, new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }

    public static NormDefine test1() {
        return NormDefineBuilder.createNorm("单商户近N小时内线下收单入金交易金额").selectCachedRecord("mchid", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return notNull(order.getMerchantId()) && "1".equals(order.getStatus()) && "OFFLINE".equals(order.getProductId());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new MergeableMapObject(order.getProductId(), new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }

    public static NormDefine test2() {
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
                        String launchMode = getMapValue(order.getGoodsInfo(), "launchMode");
                        if (isNull(launchMode)) {
                            launchMode = "OTHER";
                        }
                        return new MergeableMapObject(order.getOrderChnl(), new MergeableMapObject(launchMode, new CountNumber(1L)));
                    }
                }).init();
    }

    public static NormDefine test3() {
        return NormDefineBuilder.createNorm("签约主体近N小时某收单产品P成功金额").selectCachedRecord("signSubject", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String signType = getMapValue(order.getGoodsInfo(), "signType");
                        String signName = getMapValue(order.getGoodsInfo(), "signName");
                        String legalIdNo = getMapValue(order.getGoodsInfo(), "legalIdNo");
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
                        String signType = getMapValue(order.getGoodsInfo(), "signType");
                        String signName = getMapValue(order.getGoodsInfo(), "signName");
                        String legalIdNo = getMapValue(order.getGoodsInfo(), "legalIdNo");
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

    public static NormDefine test9(){
        return NormDefineBuilder.createNorm("同商编近【x】天(包含当天)b2b充值业务方包含【y】非同人的累计全部充值交易笔数-新").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getColCustUserId()) && ("MEC_BALANCE_PAYMENT_RECHARGE".equals(order.getOrderChnl()) || "MEC_BALANCE_PAYMENT_FE".equals(order.getOrderChnl()) || "BAC_LOAD_FE".equals(order.getOrderChnl()));
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String payerName = "";
                        if ("MEC_BALANCE_PAYMENT_RECHARGE".equals(order.getOrderChnl())) {
                            payerName = getBackUpValue(order.getBackUp(),"payerName");
                        } else {
                            payerName = getMapValue(order.getGoodsInfo(),"payerName");
                        }
                        payerName = payerName == null ? "" : payerName.replace("分公司", "")
                                .replace("有限公司","")
                                .replace("测试","")
                                .replace("公司","")
                                .replace("股份","")
                                .replace("(","")
                                .replace(")","")
                                .replace("（","")
                                .replace("）","")
                                .replace("国际","")
                                .replace("责任","");
                        String parentSignName = getMapValue(order.getGoodsInfo(),"parentSignName");
                        parentSignName = parentSignName == null ? "" : parentSignName.replace("分公司", "")
                                .replace("有限公司","")
                                .replace("测试","")
                                .replace("公司","")
                                .replace("股份","")
                                .replace("(","")
                                .replace(")","")
                                .replace("（","")
                                .replace("）","")
                                .replace("国际","")
                                .replace("责任","");
                        String signName = getMapValue(order.getGoodsInfo(),"signName");
                        signName = signName == null ? "" : signName.replace("分公司", "")
                                .replace("有限公司","")
                                .replace("测试","")
                                .replace("公司","")
                                .replace("股份","")
                                .replace("(","")
                                .replace(")","")
                                .replace("（","")
                                .replace("）","")
                                .replace("国际","")
                                .replace("责任","");
                        return TextComparator.getCosineSimilarity(payerName, signName) < 0.7 && TextComparator.getCosineSimilarity(payerName, parentSignName) < 0.7;
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new MergeableMapObject(order.getOrderChnl(),new SumNumber(order.getTransAmount()));

                    }
                }).init();
    }

    public static NormDefine test6() {
        return NormDefineBuilder.createNorm("单商户近72小时内线下收单成功交易金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return notNull(order.getMerchantId())
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

    static String getBackUpValue(Object obj1, Object obj2) {
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if (obj1 == null || obj2 == null) {
                return null;
            }
            String backUp = obj1.toString();
            String key = obj2.toString();
            Map<String, String> map = backUpToMap(backUp);
            if (map.get(key) != null) {
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    static Map<String, String> backUpToMap(String reqInfo) {
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

    static String filterJsonFromReqInfo(String reqInfo, String jsonKey) {
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

    static String getMapValue(Object obj1, Object obj2) {
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            if (obj1 == null || obj2 == null) {
                return null;
            }
            String goodsInfo = obj1.toString();
            String key = obj2.toString();
            Map<String, String> map = transGoodsIfToMap(goodsInfo);
            if (map.get(key) != null) {
                return map.get(key).toString();
            }
            return null;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    static Map<String, String> transGoodsIfToMap(Object obj) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            Map<String, String> res = new HashMap<String, String>();
            if (obj == null || "".equals(obj.toString())) {
                return res;
            }
            String goodsInfo = obj.toString();
            goodsInfo = goodsInfo.trim().substring(1, goodsInfo.length() - 1);
            goodsInfo = goodsInfo.replaceAll("\"", "");
            String[] strings = goodsInfo.split(",");
            for (String s : strings) {
                String[] ss = s.split(":");
                if (ss != null && ss.length > 1 && s.indexOf(":") != -1) {
                    res.put(ss[0], s.substring(s.indexOf(":") + 1));
                }
            }
            return res;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    public static long getValueFromMapByBizAndProd(Object obj, String key) {
        try {
            long value = 0;
            if (StringUtils.isBlank(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String[] keyArray = key.trim().split(",");
                for (String keyStr : keyArray) {
                    // 定制逻辑，填写PROD则包含所有的
                    if (keyStr.equals("FE")) {
                        String[] keyTemp1 = {"MEC_BALANCE_PAYMENT_FE", "BANK_TRANS_PAYMENT_FE", "'EPOS_FE", "DS_FE"};
                        for (String keyStr1 : keyTemp1) {
                            Object o = map.get(keyStr1);
                            if (o != null && o instanceof SumNumber) {
                                value += ((SumNumber) o).longValue();
                            }
                        }
                    } else {
                        Object o = map.get(keyStr);
                        if (o != null && o instanceof SumNumber) {
                            value += ((SumNumber) o).longValue();
                        }
                    }
                }
            }

            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getValueFromMapByBizAndProd 全局方法出现异常", e);
            return 0;
        }
    }

    public static long getTransVolBybiz(Object obj1, Object obj2,Object obj5, Object obj3,Object obj4) {
        long value = 0;
        if (obj1 == null || obj3 == null) {
            return value;
        }
        String prod = obj1.toString();
        String biz = obj5.toString();
        String oldBiz = "";
        if (obj2 != null) {
            oldBiz = obj2.toString();
        }
        try {
            LoggerUtil.getLogger().info("getTransVolBybiz  obj1 == {},obj2 == {},obj3 == {},obj4 == {}", obj1,obj2,obj3,obj4);
            if (prod.equals("DFDF") || prod.equals("RJT") ||  prod.equals("WITHDRAW")) {
                return Long.valueOf(String.valueOf(obj3));
            } else if(prod.equals("S0") || prod.equals("D0")){
                if (obj4 == null){
                    return Long.valueOf(String.valueOf(obj3));
                } else {
                    return  Long.valueOf(String.valueOf(obj3)) - Long.valueOf(String.valueOf(obj4));
                }

            } else if(("TRANSFER".equals(prod) && "MEC_BALANCE_PAYMENT".equals(biz)) || ("ACCOUNT".equals(prod) && "MEC_BALANCE_PAYMENT".equals(biz))){
                return Long.valueOf(String.valueOf(obj3));
            }  else if (oldBiz.equals("MEC_BALANCE_PAYMENT_TRANSFER") || oldBiz.equals("MEC_BALANCE_PAYMENT_ACCOUNT")) {
                return Long.valueOf(String.valueOf(obj3));
            } else {
                return 0;
            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getValueFromMapByBizAndProd 全局方法出现异常", e);
            return 0;
        }
    }



    public static NormDefine test15() {
        return NormDefineBuilder.createNorm("A一键同用户ID同商户下近N小时内累积交易成功次数").selectCachedRecord("mch-user", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;

                        return order.getColCustUserId()+"_"+order.getPayCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return notNull(order.getPayCustUserId()) && "1".equals(order.getStatus()) && notNull(order.getColCustUserId());
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }
    public static NormDefine test16(){
        return NormDefineBuilder.createNorm("同商编近X小时台牌银联境外钱包境外累计成功交易金额").selectCachedRecord("mchid",
                "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String ipAddr = order.getIpAddr();
                        boolean isKjFlag = false;
                        if (StringUtils.isNotBlank(ipAddr) && ipAddr.contains(";")) {
                            // 取国家归属地
                            String[] idAddrs = ipAddr.split(";");
                            // 国家归属地
                            String country = idAddrs[0];
                            if (StringUtils.isNotBlank(country) && !country.equals("中国")) {
                                return true;
                            }
                        }
                        //交易状态的枚举暂未确定
                        return notNull(order.getColCustUserId()) && "1".equals(order.getStatus())
                                && "TAIPAI_FE".equals(order.getOrderChnl()) && isKjFlag;
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new SumNumber(order.getTransAmount());
                    }
                }).init();
    }
    public static long getValueByIpcountry(Object ipcountry, Object amt) {
        try {
            long value = 0;
            if (ipcountry == null || amt == null) {
                return value;
            }
            String county = "";
            if (ipcountry != null) {
                county = ipcountry.toString();
            }
            if (notNull(county) && !county.equals("中国")) {
                return (long) amt;
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getValueByIpcountry 全局方法出现异常", e);
            return 0;
        }
    }


}
