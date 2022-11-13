package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.CountNumber;
import com.tcredit.streaming.core.bean.method.DistinctedListObject;
import com.tcredit.streaming.core.bean.method.MergeableMapObject;
import com.tcredit.streaming.core.bean.method.SumNumber;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;


public class TestEngine {
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();
        DSPayOrder obj = new DSPayOrder();
        obj.setIp("10.7.1.21");
        obj.setColCustUserId("100200300");
        obj.setProduct("FE");
        obj.setContactPhone("123899");
        obj.setPayCustCardNo("8984548545894");
        obj.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-25 19:12:32"));
        obj.setComamt(8900L);
        obj.setStatus("SUCCESS");

        DSPayOrder obj1 = new DSPayOrder();
        obj1.setContactPhone("123899");
        obj1.setPayCustCardNo("8984548545894");
        obj.setIp("10.7.1.21");
        obj.setColCustUserId("100200300");
        obj.setProduct("NOCARDPAY");
        obj1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-04-24 12:12:32"));
        obj1.setComamt(8900L);
        obj1.setStatus("SUCCESS");
        list.add(obj1);
        list.add(obj);
        Map<Class<?>, List<Object>> a = new HashMap<Class<?>, List<Object>>();
        a.put(DSPayOrder.class, list);

        List<Object> list1 = new ArrayList<Object>();
        OfflineDSPayOrder offlineDSPayOrder = new OfflineDSPayOrder();
        offlineDSPayOrder.setCardNo("89845485458943");
        offlineDSPayOrder.setIp("10.7.1.21");
        offlineDSPayOrder.setMerchantId("100200300");
        offlineDSPayOrder.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 09:12:32"));
        offlineDSPayOrder.setTransType("SALE");
        offlineDSPayOrder.setStatus("1");
        offlineDSPayOrder.setProductId("OFFLINE");
        offlineDSPayOrder.setTransAmount(1999L);

        OfflineDSPayOrder offlineDSPayOrder1 = new OfflineDSPayOrder();
        offlineDSPayOrder1.setCardNo("89845485458943");
        offlineDSPayOrder1.setIp("10.7.1.21");
        offlineDSPayOrder1.setMerchantId("100200300");
        offlineDSPayOrder1.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 11:12:32"));
        offlineDSPayOrder1.setTransType("SALE");
        offlineDSPayOrder1.setStatus("1");
        offlineDSPayOrder1.setProductId("OFFLINE");
        offlineDSPayOrder1.setTransAmount(2000L);
        list1.add(offlineDSPayOrder1);

        OfflineDSPayOrder offlineDSPayOrder3 = new OfflineDSPayOrder();
        offlineDSPayOrder3.setCardNo("89845485458943");
        offlineDSPayOrder3.setIp("10.7.1.21");
        offlineDSPayOrder3.setMerchantId("100200300");
        offlineDSPayOrder3.setTransTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-11-13 10:12:32"));
        offlineDSPayOrder3.setTransType("SALE");
        offlineDSPayOrder3.setStatus("1");
        offlineDSPayOrder1.setProductId("OFFNEW");
        offlineDSPayOrder1.setTransAmount(3000L);
        list1.add(offlineDSPayOrder3);
        list1.add(offlineDSPayOrder);
        list1.add(offlineDSPayOrder1);
        Map<Class<?>, List<Object>> a1 = new HashMap<Class<?>, List<Object>>();
        a1.put(OfflineDSPayOrder.class, list1);
        Set<CachedRecord> calc = task3().calc(a1);
        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));

        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("同卡近【72】小时内在【OFFLINE|OFFNEW|OFFPAY】下累积线下成功交易金额");
            System.out.println("分割线");
            System.out.println(JSON.toJSONString(timedItems, SerializerFeature.DisableCircularReferenceDetect));
            String transtime = "1668357028000";
            String duration = "72ph";
            String p = "OFFLINE";
            String x = "amount";
            System.out.println("二次割线");
            System.out.println(getMergeMapByKey(timedItems,transtime,duration,p,x));

        }

    }
    static BigDecimal getMergeMapByKey(Object obj, Object transtime, String duration, Object key1, Object countType) {
        BigDecimal result = new BigDecimal(0);
        try {
            if (obj == null || !(obj instanceof TimedItems) || key1 == null || countType == null) {
                return new BigDecimal("0");
            }
            TimedItems tt = (TimedItems) obj;
            Object o = null;

            String[] key1Array = key1.toString().split(",|;");

            //统计金额或者次数 "amount" or "number"
            String countTypeStr = countType.toString();

            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            if (o instanceof MergeableMapObject) {
                ConvenientHashMap map = (ConvenientHashMap) ((MergeableMapObject) o).getMap();

                if ("amount".equalsIgnoreCase(countTypeStr)) {
                    for (String key : key1Array) {
                        if (map.containsKey(key)){
                            Object sum = map.get(key);
                            if (sum instanceof SumNumber  ) {
                                BigDecimal bigDecimal1 = new BigDecimal(((SumNumber) sum).longValue());
                                result = result.add(bigDecimal1);
                            }
                        }

                    }
                } else if ("number".equalsIgnoreCase(countTypeStr)) {
                    for (String key : key1Array) {
                        if (map.containsKey(key)){
                            Object sum = map.get(key);
                            if (sum instanceof SumNumber  ) {
                                BigDecimal bigDecimal1 = new BigDecimal(((SumNumber) sum).getCount());
                                result = result.add(bigDecimal1);
                            }
                        }
                    }
                }
                LoggerUtil.getLogger().info("getMergeMapByKey result:{}",result);

            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 getMergeMapByKey", e);
            return result;
        }
        return result;
    }
    public static NormDefine task() {
        return NormDefineBuilder.createNorm("同手机号在24小时内累积交易成功次数").selectCachedRecord("phone", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getContactPhone();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return "SUCCESS".equals(order.getStatus());
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        return new CountNumber(1L);
                    }
                }).init();
    }

    public static List<NormDefine> getAllTasks() {
        ArrayList<NormDefine> tasks = new ArrayList<NormDefine>(2);
        tasks.add(task());
        return tasks;
    }
    public static NormDefine task1() {
        return NormDefineBuilder.createNorm("同商户同IP在(N)小时内产品【NOCARDPAY,FE】累积交易次数(含当笔)").selectCachedRecord("mch-ip", "PAY.YJZF")
                .setObjectType(DSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((DSPayOrder) obj).getColCustUserId()+"_"+((DSPayOrder) obj).getIp();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        String userIp = order.getIp();
                        String colCustUserId = order.getColCustUserId();
                        String productId = order.getProduct();
                        return notNull(userIp) && notNull(colCustUserId) && ("FE".equals(productId) || "NOCARDPAY".equals(productId));
                    }
                }).setExpireMode("24ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((DSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DSPayOrder order = (DSPayOrder) obj;
                        return new MergeableMapObject(order.getProduct(),new CountNumber(1));
                    }
                }).init();
    }
    public static boolean notNull (Object obj){
        try {
//            LoggerUtil.getLogger().debug("obj == {}", obj);
            if(obj == null){
                return false;
            }
            if("".equals(obj.toString().trim()) || "null".equals(obj.toString().trim())||"127.0.0.1".equals(obj.toString().trim())|| obj.toString().trim().contains("default") || "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_2)".equals(obj.toString())||"123456789012345".equals(obj.toString()) || "null;".equals(obj.toString().trim())){
                return false;
            }

            return true;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }
    public static NormDefine task2() {
        return NormDefineBuilder.createNorm("同商户N天累计成功交易卡数量").selectCachedRecord("offline-mch", "PAY.OFFLINE")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getMerchantId();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return notNull(order.getMerchantId()) && ("SALE".equals(order.getTransType()) || "PREAUTH_CM".equals(order.getTransType())) && "1".equals(order.getStatus());
                    }
                }).setExpireMode("30pd").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new DistinctedListObject(order.getCardNo());
                    }
                }).init();
    }
    public static NormDefine task3(){
        return NormDefineBuilder.createNorm("同卡近【72】小时内在【OFFLINE|OFFNEW|OFFPAY】下累积线下成功交易金额").selectCachedRecord("card-all", "PAY.YJZF")
                .setObjectType(OfflineDSPayOrder.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OfflineDSPayOrder) obj).getCardNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        //交易状态的枚举暂未确定
                        return notNull(order.getCardNo()) && "1".equals(order.getStatus()) && ("OFFLINE".equals(order.getProductId()) || "OFFNEW".equals(order.getProductId()) || "OFFPAY".equals(order.getProductId()));
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OfflineDSPayOrder) obj).getTransTime();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OfflineDSPayOrder order = (OfflineDSPayOrder) obj;
                        return new MergeableMapObject(order.getProductId(),new SumNumber(order.getTransAmount()));
                    }
                }).init();
    }
}
