package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.DefaultModel;
import com.tcredit.streaming.core.model.MerchantSomplaint;
import com.tcredit.streaming.core.norm.define.*;
import com.zhang.bruce.general.DateUtils;

import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.*;
import static com.zhang.bruce.general.cach.TestRemitEngine.getBackUpValue;
import static com.zhang.bruce.rule.FunctionTest.getValueFromMapByAllKeySplit;
import static com.zhang.bruce.rule.FunctionTest.operCond;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/6 6:51 下午
 */
public class TestDefaultMode {
    public static void main(String[] args) throws InterruptedException {
        // 投诉原因=赌博、欺诈、色情、盗卡、传销、非法集资，ALL，支持单选、多选，或者ALL；
        //投诉来源=查单、调单、聚合-普通、聚合-升级、一线、二线、媒体、监管、ALL，支持单选、多选，或者ALL；
        List<Object> list = new ArrayList<Object>();
        MerchantSomplaint obj = new MerchantSomplaint();
        obj.setMerchantNo("1007008000");
        obj.setTransactionAmount(200200L);
        obj.setTradeTableName("MERCHANT_SOMPLAINT");
        obj.setMerchantTypeUpload("SOMPLAINT");
        obj.setSomplaintReason("欺诈");
        obj.setSomplaintSource("一线");
        obj.setCreateTime(DateUtils.getDate(new Date(),-2));


        MerchantSomplaint obj1 = new MerchantSomplaint();
        obj1.setMerchantNo("1007008000");
        obj1.setTransactionAmount(400200L);
        obj1.setTradeTableName("MERCHANT_SOMPLAINT");
        obj1.setMerchantTypeUpload("SOMPLAINT");
        obj1.setSomplaintReason("欺诈");
        obj1.setSomplaintSource("一线");
        obj1.setCreateTime(DateUtils.getDate(new Date(),-2));
        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(MerchantSomplaint.class, list);
        Set<CachedRecord> calc = test2().calc(a);

        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.getRaw("同商户号近N小时内不同投诉原因下累积投诉交易笔数和金额");
            System.out.println(cachedRecord.getRaw("primary_key"));
            System.out.println(cachedRecord.getRaw("primary_tag"));
            System.out.println("分割线");
            System.out.println(timedItems.toString());
            timedItems.fastClone();


            System.out.println("TimedItems");
            String transtime = "1702881282411";
            String duration = "72ph";
            System.out.println("二次割线");
            System.out.println(getValueFromMapByAllKeySplit(getCacheMap(timedItems, transtime, duration), "all", "number"));
            System.out.println(operCond(getValueFromMapByAllKeySplit(getCacheMap(timedItems, transtime, duration), "all", "number"), ">=", 2));
//            System.out.println("三次次割线");
//            System.out.println(getCacheCount(timedItems, transtime, duration));


        }
    }

    public static NormDefine test() {
        return NormDefineBuilder.createNorm("父商户下子商户近180天触发商户账户规则个数").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return (String) order.get("systemMerchantNo");
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String merchantno = (String) order.get("merchantNo");
                        String parentMerchanId = (String) order.get("systemMerchantNo");
                        String occurTime = (String) order.get("occurTime");
                        String tradeTableName = (String) order.get("tradeTableName");
                        return (notNull(merchantno) && notNull(parentMerchanId) && notNull(occurTime) &&
                                "TBL_MERCHANT_CHECKLIST".equals(tradeTableName)
                        );
                    }
                }).setExpireMode("180pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String occurTime = (String) order.get("occurTime");
                        return parseToDate(occurTime, "yyyy-MM-dd HH:mm:ss");
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String ruleCode = (String) order.get("ruleCode");
                        String merchantno = (String) order.get("merchantNo");
                        MergeableMapObject map = new MergeableMapObject();
                        if (notNull(ruleCode)) {
                            for (String value : ruleCode.split(",")) {
                                map.put(value, new DistinctedListObject(merchantno));
                            }
                        }
                        return map;
                    }
                }).init();
    }

    public static NormDefine test1() {
        return NormDefineBuilder.createNorm("同身份证号近72小时内NOCARDPAY交易成功交易金额").selectCachedRecord("idNo-all", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getIdNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;

                        return notNull(order.getIdNo()) &&
                                notNull(order.getProduct()) && "1".equals(order.getStatus()) &&
                                "NOCARDPAY".equals(order.getProduct());
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

    public static NormDefine test11() {
        return NormDefineBuilder.createNorm("FE同IP同商户在不同业务方和paway下近N小时累计成功交易次数和金额").selectCachedRecord("mch-ip", "PAY.EPOS")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId() + "_" + ((DSPayOrder) obj).getIp();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        ArrayList<String> paywayList = new ArrayList<String>();
                        paywayList.add("B2B");
                        paywayList.add("B2C");
                        paywayList.add("WECHAT");
                        paywayList.add("ALIPAY");
                        paywayList.add("OPEN_UPOP");
                        paywayList.add("UNIONPAY");
                        paywayList.add("DCEP");
                        String payWay = getBackUpValue(order.getBackUp(), "payWay");

                        return notNull(order.getIp()) && ("EPOS_FE".equals(order.getOrderChnl()) || "DS_FE".equals(order.getOrderChnl()) || "YJZF_FE".equals(order.getOrderChnl()) || "TEL_FE".equals(order.getOrderChnl())) && paywayList.contains(payWay)
                                && notNull(order.getColCustUserId()) && "1".equals(order.getStatus()) && notNull(order.getTransTime());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;

                        String payWay = getBackUpValue(order.getBackUp(), "payWay");
                        String production_prductId = order.getOrderChnl();

                        String key = production_prductId + "_" + payWay;
                        return new MergeableMapObject(key, new SumNumber(order.getTransAmount()));

                    }
                }).init();
    }

    public static NormDefine test2() {
        return NormDefineBuilder.createNorm("同商户号近N小时内不同投诉原因下累积投诉交易笔数和金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(MerchantSomplaint.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        return order.getMerchantNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        ArrayList<String> reasonList = new ArrayList<String>();
                        reasonList.add("赌博");
                        reasonList.add("欺诈");
                        reasonList.add("色情");
                        reasonList.add("盗卡");
                        reasonList.add("传销");
                        reasonList.add("非法集资");
                        String somplaintReason = order.getSomplaintReason();
                        return notNull(order.getMerchantNo()) && notNull(order.getCreateTime()) && notNull(order.getSomplaintReason()) && reasonList.contains(somplaintReason) && notNull(order.getTransactionAmount());
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        return order.getCreateTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        String SOMPLAINTREASON = order.getSomplaintReason();
                        Long trasnAmount = order.getTransactionAmount();
                        return new MergeableMapObject(SOMPLAINTREASON, new SumNumber(trasnAmount));
                    }
                }).init();
    }

    public static NormDefine test3() {
        return NormDefineBuilder.createNorm("同商户号近N小时内不同投诉来源下累积投诉交易笔数和金额").selectCachedRecord("mchid", "PAY.YJZF")
                .setObjectType(MerchantSomplaint.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        return order.getMerchantNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        ArrayList<String> sourceList = new ArrayList<String>();
                        sourceList.add("查单");
                        sourceList.add("调单");
                        sourceList.add("聚合-普通");
                        sourceList.add("聚合-升级");
                        sourceList.add("一线");
                        sourceList.add("二线");
                        sourceList.add("媒体");
                        sourceList.add("监管");
                        String somplaintSource = order.getSomplaintSource();
                        return notNull(order.getMerchantNo()) && notNull(order.getCreateTime()) && notNull(order.getSomplaintSource())  && sourceList.contains(somplaintSource) && notNull(order.getTransactionAmount());
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        return order.getCreateTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        MerchantSomplaint order = (MerchantSomplaint) obj;
                        String somplaintSource = order.getSomplaintSource();
                        Long trasnAmount = order.getTransactionAmount();
                        return new MergeableMapObject(somplaintSource, new SumNumber(trasnAmount));
                    }
                }).init();
    }
    public static NormDefine test4(){
        return NormDefineBuilder.createNorm("提现会员近24小时高频卖出同一藏品且分账接收金额大于2w").selectCachedRecord("user-all","PAY.REMIT")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return order.get("LEDGERNO").toString();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String tradeTableName  = (String)order.get("TRADETABLENAME");
                        return notNull(order.get("LEDGERNO")) && "TBL_FREQUENCY_WITHDRAWAL".equals(tradeTableName);
                    }
                }).setExpireMode("13ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String  createTime = (String)order.get("CREATETIME");
                        return parseToDate(createTime,"yyyy-MM-dd HH:mm:ss");
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1L);
                    }
                }).init();
    }

}
