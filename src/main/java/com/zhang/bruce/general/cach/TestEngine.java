package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.tcredit.streaming.core.api.Mergeable;
import com.tcredit.streaming.core.bean.CachedRecord;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.*;
import com.tcredit.streaming.core.model.DSPayOrder;
import com.tcredit.streaming.core.model.DefaultModel;
import com.tcredit.streaming.core.model.OfflineDSPayOrder;
import com.tcredit.streaming.core.norm.define.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Objects.isNull;


public class TestEngine {
    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>();
        DefaultModel obj = new DefaultModel();
        obj.setTradeTableName("TBL_MERCHANT_CHECKLIST");

        obj.put("TRADETABLENAME","TBL_MERCHANT_CHECKLIST");
        obj.put("merchantNo","10088811547");
        obj.put("occurTime","2023-02-15 18:22:11");
        obj.put("ruleCode","MEC_R_D_021");
        DefaultModel obj1 = new DefaultModel();
        obj1.setTradeTableName("TBL_MERCHANT_CHECKLIST");
        obj1.put("TRADETABLENAME","TBL_MERCHANT_CHECKLIST");
        obj1.put("merchantNo","10088811547");
        obj1.put("occurTime","2023-02-15 20:22:11");
        obj1.put("ruleCode","MEC_R_D_021");
        DefaultModel obj2 = new DefaultModel();
        obj2.setTradeTableName("TBL_MERCHANT_CHECKLIST");
        obj2.put("TRADETABLENAME","TBL_MERCHANT_CHECKLIST");
        obj2.put("merchantNo","10088811547");
        obj2.put("occurTime","2023-02-15 21:22:11");
        obj2.put("ruleCode","MEC_R_D_021");

        List<Object> list1 = new ArrayList<Object>();
        list1.add(obj);
        list1.add(obj1);
        list1.add(obj2);
        Map<Class<?>, List<Object>> a1 = new HashMap<Class<?>, List<Object>>();
        a1.put(DefaultModel.class, list1);
        Set<CachedRecord> calc = task4().calc(a1);
        System.out.println(JSON.toJSONString(calc, SerializerFeature.DisableCircularReferenceDetect));



        Iterator it = calc.iterator();
        while (it.hasNext()) {
            CachedRecord cachedRecord = (CachedRecord) it.next();
            TimedItems timedItems = (TimedItems) cachedRecord.get("同商户近X小时触发规则次数");
            String transtime = "1676534169437";
            String duration = "24ph";
            System.out.println("二次割线");
            System.out.println(getCacheMap(timedItems,transtime,duration));

            System.out.println(getCountFromMapByKeySplit(getCacheMap(timedItems,transtime,duration),"MEC_R_D_021"));

        }

    }
    public static BigDecimal getMergeMapByKey(Object obj, Object transtime, String duration, Object key1, Object countType) {
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
    public static NormDefine task4(){
        return NormDefineBuilder.createNorm("同商户近X小时触发规则次数").selectCachedRecord("mchid", "PAY.REMIT")
                .setObjectType(DefaultModel.class).setObjectKey(new Key() {
                    public String key(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        return (String)order.get("merchantNo");
                    }
                }).setFilter(new Filter() {
                    public boolean filt(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String merchantno = (String)order.get("merchantNo");
                        String  occurTime = (String)order.get("occurTime");
                        String tradeTableName  = (String)order.get("tradeTableName");
                        return ( notNull(merchantno)  && notNull(occurTime) &&
                                "TBL_MERCHANT_CHECKLIST".equals(tradeTableName)
                        );
                    }
                }).setExpireMode("73ph").setObjectDate(new DateItem() {
                    public Date getDate(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String  occurTime = (String)order.get("occurTime");
                        return parseToDate(occurTime,"yyyy-MM-dd HH:mm:ss");
                    }
                }).setMethod(new Method() {
                    public Mergeable invoke(Object obj) {
                        DefaultModel order = (DefaultModel) obj;
                        String ruleCode = (String)order.get("ruleCode");
                        MergeableMapObject map = new MergeableMapObject();
                        if(notNull(ruleCode)){
                            for(String value : ruleCode.split(",")){
                                map.put(value,new CountNumber(1L));
                            }
                        }
                        return map;
                    }
                }).init();
    }
    static Date parseToDate(Object time,Object formate) {
        try {
            LoggerUtil.getLogger().debug("time == {}", time);
            LoggerUtil.getLogger().debug("formate == {}", formate);

            String timeStr = "";
            if (time instanceof String) {
                timeStr = time.toString();
            }else{
                return null;
            }
            String formateStr = "";
            if (formate instanceof String) {
                formateStr = formate.toString();
            }else{
                return null;
            }


            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formateStr);
            Date date = null;
            date = simpleDateFormat.parse(timeStr);
            return date;


        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    static ConvenientHashMap getCacheMap(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             * 获取MergeableMapObject对象中的ConvenientHashMap
             */
            ConvenientHashMap map = new ConvenientHashMap();
            if (obj == null || !(obj instanceof TimedItems)) {
                return map;
            }
            TimedItems tt = (TimedItems) obj;
            Object o = null;
            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            if (o instanceof MergeableMapObject) {
                return (ConvenientHashMap)((MergeableMapObject) o).getMap();
            }
            return map;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    static long getCountFromMapByKeySplit(Object obj, String key){
        try {
            long value = 0;
            if (isNull(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                if ("all".equalsIgnoreCase(key.trim())) {
                    Iterator entries = map.entrySet().iterator();
                    while (entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) entries.next();
                        if (entry != null && entry.getValue() != null && entry.getValue() instanceof SumNumber) {
                            value += ((SumNumber) entry.getValue()).getCount();
                        } else if (entry != null && entry.getValue() != null && entry.getValue() instanceof CountNumber) {
                            value += ((CountNumber) entry.getValue()).getCount();
                        } else if (entry != null && entry.getValue() != null && entry.getValue() instanceof DistinctedListObject) {
                            value += ((DistinctedListObject) entry.getValue()).getSet().size();
                        }
                    }
                } else {
                    String[] keyArray = key.trim().split(",");
                    for (String keyStr : keyArray) {
                        Object o = map.get(keyStr);
                        if (o != null && o instanceof SumNumber) {
                            value += ((SumNumber) o).getCount();
                        } else if (o != null && o instanceof CountNumber) {
                            value += ((CountNumber) o).getCount();
                        } else if (o != null && o instanceof DistinctedListObject) {
                            value += ((DistinctedListObject) o).getSet().size();
                        }
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountFromMapByKeySplit 全局方法出现异常", e);
            return 0;
        }
    }


    public static Collection getCacheCollect(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             *获取DistinctedListObject等类型cache中保存的set和list对象
             */
            Set set = new HashSet();
            if (obj == null || !(obj instanceof TimedItems)) {
                return set;
            }
            TimedItems tt = (TimedItems) obj;
            Object o = null;
            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            if (o instanceof DistinctedListObject) {
                return ((DistinctedListObject) o).getSet();
            }
            if (o instanceof MergeableListObject) {
                return ((MergeableListObject) o).getList();
            }
            if (o instanceof MergeableSortedList) {
                return ((MergeableSortedList) o).getList();
            }
            return set;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    public static boolean notTriggerRules(Object obj, Object ruleCodeContent){
        boolean  result = true;
        try {

            Set  values = new HashSet();
            if(obj != null){
                values.addAll((Set) obj);
            }
            if("all".equalsIgnoreCase(ruleCodeContent.toString()) && values.size()>0){
                result =false;
            }
            if(!"all".equalsIgnoreCase(ruleCodeContent.toString())){
                List<String>  ruleCodeList = Arrays.asList(ruleCodeContent.toString().split(","));
                for(String ruleCode :ruleCodeList){
                    if(!values.add(ruleCode)){
                        return !result ;
                    }
                }
            }
            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("notTriggerRules 全局方法出现异常", e);
            return !result;
        }
    }


}
