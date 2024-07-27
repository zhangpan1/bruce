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
import com.tcredit.streaming.core.model.OrderDivideData;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.zhang.bruce.general.cach.TestEngine.getCacheMap;
import static com.zhang.bruce.general.cach.TestEngine.notNull;
import static com.zhang.bruce.general.cach.TestRemitEngine.getMapValue;
import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/17 6:02 下午
 */
public class TestOrderDivideData {
    public static void main(String[] args) throws ParseException, InterruptedException {
        List<Object> list = new ArrayList<Object>();
        OrderDivideData obj = new OrderDivideData();
        obj.setLedgerNo("211448390740");
        obj.setTradeResult("SUCCESS");
        obj.setReqId("1e2cb310b00547758cd59f49091e2611");
        obj.setDivDetAmt(500000L);
        obj.setOrdAmt(50000000L);
        obj.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 11:12:32"));

        OrderDivideData obj1 = new OrderDivideData();
        obj1.setLedgerNo("211448390740");
        obj1.setTradeResult("SUCCESS");
        obj1.setReqId("1e2cb310b00547758cd59f49091e2610");
        obj1.setDivDetAmt(500000L);
        obj1.setOrdAmt(500000L);
        obj1.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj1.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 10:12:32"));

        OrderDivideData obj2 = new OrderDivideData();
        obj2.setLedgerNo("211448390740");
        obj2.setTradeResult("SUCCESS");
        obj2.setReqId("1e2cb310b00547758cd59f49091e2699");
        obj2.setDivDetAmt(500000L);
        obj2.setOrdAmt(500000L);
        obj2.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj2.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 09:12:32"));

        OrderDivideData obj3 = new OrderDivideData();
        obj3.setLedgerNo("211448390740");
        obj3.setTradeResult("SUCCESS");
        obj3.setReqId("1e2cb310b00547758cd59f49091e2698");
        obj3.setDivDetAmt(500000L);
        obj3.setOrdAmt(500000L);
        obj3.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj3.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 08:12:32"));

        OrderDivideData obj4 = new OrderDivideData();
        obj4.setLedgerNo("211448390740");
        obj4.setTradeResult("SUCCESS");
        obj4.setReqId("1e2cb310b00547758cd59f49091e2697");
        obj4.setDivDetAmt(500000L);
        obj4.setOrdAmt(500000L);
        obj4.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj4.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 07:12:32"));

        OrderDivideData obj5 = new OrderDivideData();
        obj5.setLedgerNo("211448390740");
        obj5.setTradeResult("SUCCESS");
        obj5.setReqId("1e2cb310b00547758cd59f49091e2696");
        obj5.setDivDetAmt(500000L);
        obj5.setOrdAmt(500000L);
        obj5.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj5.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 06:12:32"));

        OrderDivideData obj11 = new OrderDivideData();
        obj11.setLedgerNo("211448390740");
        obj11.setTradeResult("SUCCESS");
        obj11.setReqId("1e2cb310b00547758cd59f49091e2695");
        obj11.setDivDetAmt(500000L);
        obj11.setOrdAmt(500000L);
        obj11.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj11.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 12:12:32"));

        OrderDivideData obj6 = new OrderDivideData();
        obj6.setLedgerNo("211448390740");
        obj6.setTradeResult("SUCCESS");
        obj6.setDivDetAmt(500000L);
        obj6.setOrdAmt(500000L);
        obj6.setReqId("1e2cb310b00547758cd59f49091e2694");
        obj6.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj6.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 12:12:32"));

        OrderDivideData obj7 = new OrderDivideData();
        obj7.setLedgerNo("211448390740");
        obj7.setTradeResult("SUCCESS");
        obj7.setReqId("1e2cb310b00547758cd59f49091e2685");
        obj7.setDivDetAmt(5000000L);
        obj7.setOrdAmt(500000L);
        obj7.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj7.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 12:12:32"));

        OrderDivideData obj8 = new OrderDivideData();
        obj8.setLedgerNo("211448390740");
        obj8.setTradeResult("SUCCESS");
        obj8.setReqId("1e2cb310b00547758cd59f49091e269b");
        obj8.setDivDetAmt(500000L);
        obj8.setOrdAmt(500000L);
        obj8.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj8.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 13:12:32"));

        OrderDivideData obj9 = new OrderDivideData();
        obj9.setLedgerNo("211448390740");
        obj9.setTradeResult("SUCCESS");
        obj9.setReqId("1e2cb310b00547758cd59f49091e2693");
        obj9.setOrdAmt(5000002L);
        obj9.setDivDetAmt(500000L);
        obj9.setGoodsInfo("{\"collectionName\":\"白花蛇·杨春\"}");
        obj9.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 14:12:32"));

        OrderDivideData obj10 = new OrderDivideData();
        obj10.setLedgerNo("211448390740");
        obj10.setTradeResult("SUCCESS");
        obj10.setDivDetAmt(500000L);
        obj10.setOrdAmt(500000L);
        obj10.setReqId("1e2cb310b00547758cd59f49091e2692");
        obj10.setGoodsInfo("{\"collectionName\":\"李白\"}");
        obj10.setOccTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2024-04-17 15:12:32"));


        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.add(obj6);
        list.add(obj7);
        list.add(obj8);
        list.add(obj9);
        list.add(obj10);
        list.add(obj11);
        Map<Class<?>, List<Object>> a1 = new HashMap<Class<?>, List<Object>>();
        a1.put(OrderDivideData.class, list);
        Set<CachedRecord> calc = task().calc(a1);
        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));


        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("同用户id高频卖出同一藏品去重金额和笔数");
            System.out.println("分割线");
            String transtime = "1713356564353";
            String duration = "24ph";
            System.out.println("二次割线");
            System.out.println(getCollectionValue(timedItems,transtime,duration));
        }



    }

    /**
     * 计算单个藏品的金额 和总数以及平均数是否大于某个值
     * @param obj
     * @param transtime
     * @param duration
     * @return
     */
    private static boolean getCollectionValue(Object obj, Object transtime, String duration) {
        try {
            if (obj == null || !(obj instanceof TimedItems)) {
                return false;
            }

            long sumAll = 0;

            TimedItems tt = (TimedItems) obj;
            Object o = null;

            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            boolean avgFlag = false;

            if (o instanceof MergeableMapObject) {
                ConvenientHashMap map = (ConvenientHashMap) ((MergeableMapObject) o).getMap();
                  Iterator entries = map.entrySet().iterator();
                    while (entries.hasNext()) {
                        Set orderCount = new HashSet();
                        long amtSum = 0;
                        Map.Entry entry = (Map.Entry) entries.next();
                        if (entry != null && entry.getValue() != null && entry.getValue() instanceof MergeableMapObject) {
                            // 拿到单一藏品所有的金额和笔数
                            ConvenientHashMap childMap = (ConvenientHashMap)((MergeableMapObject) entry.getValue()).getMap();
                            Iterator entryIterator = childMap.entrySet().iterator();
                            while (entryIterator.hasNext()) {
                                Map.Entry entryChild = (Map.Entry) entryIterator.next();
                                String reqId = (String) entryChild.getKey();
                                orderCount.add(reqId);
                                if (entryChild != null && entryChild.getValue() != null && entryChild.getValue() instanceof Long) {
                                    Long orderAmt = (Long) entryChild.getValue();
                                    amtSum += orderAmt;
                                    sumAll += orderAmt;
                                }
                            }
                            if (orderCount.size() > 10) {
                                BigDecimal threshold = new BigDecimal("500000");
                                BigDecimal result = BigDecimal.valueOf(amtSum).divide(BigDecimal.valueOf(orderCount.size()),BigDecimal.ROUND_CEILING);
                                if (result.compareTo(threshold) > 0) {
                                    avgFlag = true;
                                }
                            }
                        }
                    }
                }
                if (avgFlag) {
                    BigDecimal threshold = new BigDecimal(20000 * 1000);
                    if (BigDecimal.valueOf(sumAll).compareTo(threshold) > 0) {
                        return true;
                    }
                }

        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 getCollectionValue", e);
            return false;
        }
        return false;
    }


    public static NormDefine task(){
        return NormDefineBuilder.createNorm("同用户id高频卖出同一藏品去重金额和笔数").selectCachedRecord("user-all", "PAY.YJZF")
                .setObjectType(OrderDivideData.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OrderDivideData) obj).getLedgerNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OrderDivideData order = (OrderDivideData) obj;
                        String collectionName = getMapValue(order.getGoodsInfo(), "collectionName");
                        String orderId  = ((OrderDivideData) obj).getReqId();
                        return notNull(order.getLedgerNo()) && order.getLedgerNo().startsWith("211") && "SUCCESS".equals(order.getTradeResult())
                                && notNull(collectionName) && notNull(orderId);
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OrderDivideData) obj).getOccTm();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OrderDivideData order = (OrderDivideData) obj;
                        String collectionName = getMapValue(order.getGoodsInfo(), "collectionName");
                        String orderId  = ((OrderDivideData) obj).getReqId();
                        return new MergeableMapObject(collectionName, new MergeableMapObject(orderId,order.getOrdAmt()));
                    }
                }).init();
    }

    public static NormDefine task2(){
        return NormDefineBuilder.createNorm("同用户id高频卖出同一藏品订单笔数").selectCachedRecord("user-all", "PAY.YJZF")
                .setObjectType(OrderDivideData.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OrderDivideData) obj).getLedgerNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OrderDivideData order = (OrderDivideData) obj;
                        String collectionName = getMapValue(order.getGoodsInfo(), "collectionName");
                        return notNull(order.getLedgerNo()) && order.getLedgerNo().startsWith("211")  && notNull(order.getReqId())
                                && "SUCCESS".equals(order.getTradeResult()) && notNull(collectionName);
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OrderDivideData) obj).getOccTm();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OrderDivideData order = (OrderDivideData) obj;
                        String collectionName = getMapValue(order.getGoodsInfo(), "collectionName");
                        return new MergeableMapObject(collectionName, new DistinctedListObject(order.getReqId()));
                    }
                }).init();
    }

    public static NormDefine task3(){
        return NormDefineBuilder.createNorm("同用户id高频卖出同一藏品订单分账金额").selectCachedRecord("user-all", "PAY.YJZF")
                .setObjectType(OrderDivideData.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        return ((OrderDivideData) obj).getLedgerNo();
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        OrderDivideData order = (OrderDivideData) obj;
                        String collectionName = getMapValue(order.getGoodsInfo(), "collectionName");
                        return notNull(order.getLedgerNo()) && order.getLedgerNo().startsWith("211")  && notNull(order.getReqId())
                                && "SUCCESS".equals(order.getTradeResult()) && notNull(collectionName);
                    }
                }).setExpireMode("72ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        return ((OrderDivideData) obj).getOccTm();
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        OrderDivideData order = (OrderDivideData) obj;
                        String collectionName = getMapValue(order.getGoodsInfo(), "collectionName");

                        return new MergeableMapObject(collectionName, new SumNumber(order.getDivDetAmt()));
                    }
                }).init();
    }




    public static long getCacheValueByCacheMap(Object obj, Object transtime, String duration, Object prod, Object type) {
        try{
            if (isNull(prod) || isNull(type)) {
                return 0;
            }
            ConvenientHashMap map = getCacheMap(obj, transtime, duration);
            long rs = 0;
            String prodStr = prod.toString();
            Collection dataList = new ArrayList();
            if ("all".equalsIgnoreCase(prodStr)) {
                dataList = map.values();
            } else {
                String[] prodArray = prodStr.split(",|;");
                for (String key : prodArray) {
                    dataList.add(map.get(key));
                }
            }
            String typeStr = type.toString();
            boolean isAll = "all".equalsIgnoreCase(typeStr);
            Collection itemList = new ArrayList();
            if (null != dataList && !dataList.isEmpty()) {
                Iterator iterator = dataList.iterator();
                while (iterator.hasNext()) {
                    Object o = iterator.next();
                    if (o instanceof MergeableMapObject) {
                        ConvenientHashMap hashMap = (ConvenientHashMap) ((MergeableMapObject) o).getMap();
                        if (isAll) {
                            itemList.addAll(hashMap.values());
                        } else {
                            String[] typeArray = typeStr.split(",|;");
                            for (String key : typeArray) {
                                itemList.add(hashMap.get(key));
                            }
                        }
                    }
                }
            }
            if (null != itemList && !itemList.isEmpty()) {
                Iterator iterator = itemList.iterator();
                while (iterator.hasNext()) {
                    Object o = iterator.next();
                    if (o instanceof SumNumber) {
                        rs += ((SumNumber) o).longValue();
                    } else if (o instanceof CountNumber) {
                        rs += ((CountNumber) o).longValue();
                    }
                }
            }
            return rs;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCacheValueByCacheMap 全局方法出现异常", e);
        }
        return 0;
    }
}


