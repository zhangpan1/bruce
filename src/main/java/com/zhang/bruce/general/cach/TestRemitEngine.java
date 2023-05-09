package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.RemitDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.notNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/15 3:25 下午
 */
public class TestRemitEngine {
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();
        RemitDSPayOrder obj = new RemitDSPayOrder();
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-25 19:12:32"));
        obj.setAmt(8900L);
        obj.setStatus("1");
        obj.setProd("RJT");
        obj.setMecNo("10088830018");
        obj.setProdMsg("\"prodMsg\":\"production=MERCHANTSETTLE,occurTime=2023-03-15 17:21:26,userPhone=DG$1$S3fcu2mvhEgn49zAD0OBWQ,remitDetail=[{\"bankCardNo\":\"11850000001056245\"、\"bankCardName\":\"北京科技有限公司\"、\"remitAmount\":\"21.54\"}]");

        RemitDSPayOrder obj1 = new RemitDSPayOrder();
        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-25 19:12:32"));
        obj1.setAmt(8900L);
        obj1.setStatus("1");
        obj1.setProd("S0");
        obj1.setMecNo("10088830018");
        obj1.setProdMsg("\"prodMsg\":\"production=MERCHANTSETTLE,occurTime=2023-03-15 17:21:26,userPhone=DG$1$S3fcu2mvhEgn49zAD0OBWQ,remitDetail=[{\"bankCardNo\":\"11850000001056245\"、\"bankCardName\":\"北京科技有限公司\"、\"remitAmount\":\"20.00\"}]");
        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(RemitDSPayOrder.class, list);
        Set<CachedRecord> calc = test2().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));
    }

    public static NormDefine test2(){
        return NormDefineBuilder.createNorm("单商户近N小时部分出款产品成功金额").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return notNull(order.getMecNo())
                                && ("RJT".equals(order.getProd()) || ("DFDF".equals(order.getProd()) || "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd()) || "S0".equals(order.getProd()) || "D0".equals(order.getProd()) || "S1".equals(order.getProd()) || "D1".equals(order.getProd()))
                                && "1".equals(order.getStatus()));
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        long amt = 0L;
                        if ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd())|| "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd())){
                            amt = order.getAmt();
                        }else {
                            //结算类：S0、D0、T1、D1、TN：只累计prodMsg中remitDetail有值的交易，其中bankCardNo为卡号，bankCardName为收款人姓名,remitAmount为实际到卡金额；
                            String remitDetail = getBackUpValue(order.getProdMsg(),"remitDetail");
                            if (remitDetail != null){
                                remitDetail = remitDetail.replaceAll("、",",");
                                JSONArray remitDetailArr = JSONObject.parseArray(remitDetail);
                                for (Object o : remitDetailArr) {
                                    String amtStr = getMapValue(o.toString(),"remitAmount");
                                    if(StringUtils.isNotBlank(amtStr)){
                                        BigDecimal tempBD = new BigDecimal(amtStr);
                                        Long tempTmL = tempBD.multiply(new BigDecimal(1000)).longValue();
                                        amt += tempTmL;
                                    }
                                }
                            }
                        }
                        return new SumNumber(amt);
                    }
                }).init();
    }


    public static NormDefine test1(){
        return NormDefineBuilder.createNorm("单商户近N小时部分出款产品成功金额").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(RemitDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((RemitDSPayOrder) obj).getMecNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        return notNull(order.getMecNo())
                                && ("RJT".equals(order.getProd()) || ("DFDF".equals(order.getProd()) || "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd()) || "S0".equals(order.getProd()) || "D0".equals(order.getProd()) || "S1".equals(order.getProd()) || "D1".equals(order.getProd()))
                                && "1".equals(order.getStatus()));
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((RemitDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        RemitDSPayOrder order = (RemitDSPayOrder) obj;
                        long amt = 0L;
                        if ("RJT".equals(order.getProd()) || "DFDF".equals(order.getProd())|| "SUPPLIER".equals(order.getProd()) || "WITHDRAW".equals(order.getProd())){
                            amt = order.getAmt();
                        }else {
                            //结算类：S0、D0、T1、D1、TN：只累计prodMsg中remitDetail有值的交易，其中bankCardNo为卡号，bankCardName为收款人姓名,remitAmount为实际到卡金额；
                            String remitDetail = getBackUpValue(order.getProdMsg(),"remitDetail");
                            if (remitDetail != null){
                                remitDetail = remitDetail.replaceAll("、",",");
                                JSONArray remitDetailArr = JSONObject.parseArray(remitDetail);
                                for (Object o : remitDetailArr) {
                                    String amtStr = getMapValue(o.toString(),"remitAmount");
                                    if(StringUtils.isNotBlank(amtStr)){
                                        BigDecimal tempBD = new BigDecimal(amtStr);
                                        Long tempTmL = tempBD.multiply(new BigDecimal(1000)).longValue();
                                        amt += tempTmL;
                                    }
                                }
                            }
                        }
                        return new SumNumber(amt);
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
