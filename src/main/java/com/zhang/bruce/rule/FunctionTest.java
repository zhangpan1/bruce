package com.zhang.bruce.rule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.*;
import com.tcredit.streaming.core.utils.LoggerUtil;
import com.yeepay.g3.utils.common.encrypt.AES;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by gengshunli ON 2019-03-31.<br>
 */
public class FunctionTest {

    public void testOperCond() {
        System.out.println(operCondNan("232","<=","+∞"));
    }

    public static boolean operCond(Object obj, String x, Object obj2) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            Set<String> set = new HashSet<String>();
            set.add(">");
            set.add("<");
            set.add(">=");
            set.add("<=");
            set.add("==");
            set.add("!=");
            set.add("包含");
            set.add("不包含");
            if(obj != null&&obj2 != null&&!"null".equals(obj)&&!"null".equals(obj2)&&set.contains(x)&&!"NaN".equals(obj)){
                if(obj instanceof String|| obj2 instanceof String ){
                    String s1 = obj.toString();
                    String s2 = obj2.toString();
                    if(s1.equals(s2)&&"==".equals(x)){
                        return true;
                    }
                    if(!s1.equals(s2)&&"!=".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&s1.contains(s2)&&"包含".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&!s1.contains(s2)&&"不包含".equals(x)){
                        return true;
                    }if(!("包含".equals(x)||"不包含".equals(x)||"==".equals(x)||"!=".equals(x))){
                        BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                        BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                        int a = leftDecimal.compareTo(rightDecimal);
                        if(">".equals(x) && a>0){
                            return true;
                        }
                        if("<".equals(x) && a<0){
                            return true;
                        }
                        if(">=".equals(x) && a>=0){
                            return true;
                        }
                        if("<=".equals(x) && a<=0){
                            return true;
                        }
                    }
                    return false;
                }

                BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                int a = leftDecimal.compareTo(rightDecimal);
                if(">".equals(x) && a>0){
                    return true;
                }
                if("<".equals(x) && a<0){
                    return true;
                }
                if(">=".equals(x) && a>=0){
                    return true;
                }
                if("<=".equals(x) && a<=0){
                    return true;
                }
                if("==".equals(x) && a==0){
                    return true;
                }
                if("!=".equals(x) && a!=0){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }
    public static boolean operCondNan(Object obj,String x,Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            Set<String> set = new HashSet<String>();
            set.add(">");
            set.add("<");
            set.add(">=");
            set.add("<=");
            set.add("==");
            set.add("!=");
            set.add("包含");
            set.add("不包含");
            if(obj != null&&obj2 != null&&set.contains(x)&&!"NaN".equals(obj)){
                if(obj instanceof String|| obj2 instanceof String ){
                    if (x.equals("<=") && obj2.toString().trim().equals("+∞")) {
                        return true;
                    }
                    String s1 = obj.toString();
                    String s2 = obj2.toString();
                    if(s1.equals(s2)&&"==".equals(x)){
                        return true;
                    }
                    if(!s1.equals(s2)&&"!=".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&s1.contains(s2)&&"包含".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&!s1.contains(s2)&&"不包含".equals(x)){
                        return true;
                    }if(!("包含".equals(x)||"不包含".equals(x)||"==".equals(x)||"!=".equals(x))){
                        BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                        BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                        int a = leftDecimal.compareTo(rightDecimal);
                        if(">".equals(x) && a>0){
                            return true;
                        }
                        if("<".equals(x) && a<0){
                            return true;
                        }
                        if(">=".equals(x) && a>=0){
                            return true;
                        }
                        if("<=".equals(x) && a<=0){
                            return true;
                        }
                    }
                    return false;
                }

                BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                int a = leftDecimal.compareTo(rightDecimal);
                if(">".equals(x) && a>0){
                    return true;
                }
                if("<".equals(x) && a<0){
                    return true;
                }
                if(">=".equals(x) && a>=0){
                    return true;
                }
                if("<=".equals(x) && a<=0){
                    return true;
                }
                if("==".equals(x) && a==0){
                    return true;
                }
                if("!=".equals(x) && a!=0){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static boolean operCond2 (Object obj,String x,Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            Set<String> set = new HashSet<String>();
            set.add(">");
            set.add("<");
            set.add(">=");
            set.add("<=");
            set.add("==");
            set.add("!=");
            set.add("包含");
            set.add("不包含");
            if(obj != null&&obj2 != null&&!"null".equals(obj)&&!"null".equals(obj2)&&set.contains(x)){
                if(obj instanceof String|| obj2 instanceof String ){
                    String s1 = obj.toString();
                    String s2 = obj2.toString();
                    if(s1.equals(s2)&&"==".equals(x)){
                        return true;
                    }
                    if(!s1.equals(s2)&&"!=".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&s1.contains(s2)&&"包含".equals(x)){
                        return true;
                    }
                    if(!"".equals(s1)&&!s1.contains(s2)&&"不包含".equals(x)){
                        return true;
                    }
                    if(!("包含".equals(x)||"不包含".equals(x)||"==".equals(x)||"!=".equals(x))){
                        if(!(isNumeric(obj)&&isNumeric(obj2))){
                            return false;
                        }
                        BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                        BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                        int a = leftDecimal.compareTo(rightDecimal);
                        if(">".equals(x) && a>0){
                            return true;
                        }
                        if("<".equals(x) && a<0){
                            return true;
                        }
                        if(">=".equals(x) && a>=0){
                            return true;
                        }
                        if("<=".equals(x) && a<=0){
                            return true;
                        }
                    }
                    return false;
                }

                if(!(isNumeric(obj)&&isNumeric(obj2))){
                    return false;
                }
                BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                int a = leftDecimal.compareTo(rightDecimal);
                if(">".equals(x) && a>0){
                    return true;
                }
                if("<".equals(x) && a<0){
                    return true;
                }
                if(">=".equals(x) && a>=0){
                    return true;
                }
                if("<=".equals(x) && a<=0){
                    return true;
                }
                if("==".equals(x) && a==0){
                    return true;
                }
                if("!=".equals(x) && a!=0){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常!obj:"+obj+", x:"+x+", obj2:"+obj2, e);
            return false;
        }
    }

    public static int getCacheCollectSize(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             *获取DistinctedListObject等类型cache中保存的set和list对象的大小
             */
            if (obj == null || !(obj instanceof TimedItems)) {
                return 0;
            }
            TimedItems tt = (TimedItems) obj;
            Object o = null;
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1 = new Date();
            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else if (transtime instanceof Date) {
                date1 = (Date) transtime;
            } else if (transtime instanceof Long) {
                date1 = new Date((Long) transtime);
            } else {
                try {
                    date1 = formatter.parse(transtime.toString());
                } catch (ParseException e) {
                    LoggerUtil.getLogger().error("全局方法出现异常", e);
                }
            }
            o = tt.getRaw(date1, duration);
            if (o instanceof DistinctedListObject) {
                return ((DistinctedListObject) o).getSet().size();
            }
            if (o instanceof MergeableListObject) {
                return ((MergeableListObject) o).getList().size();
            }
            if (o instanceof MergeableSortedList) {
                return ((MergeableSortedList) o).getList().size();
            }
            if (o instanceof DistinctedCountNumber) {
                return ((DistinctedCountNumber) o).value();
            }
            System.out.println("heheheehee");
            return 0;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }
    public static double getCacheVarpValue(Object obj, Object transtime, String duration) {
        /**
         * 获取VarpNumber类型的cache中的值
         */
        try {
            LoggerUtil.getLogger().info("getCacheValue obj:" + obj);
            if (obj == null || !(obj instanceof TimedItems)) {
                return 0;
            }

            TimedItems tt = (TimedItems) obj;
            Object o = null;

            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            LoggerUtil.getLogger().info("getCacheValue o:" + o);
            if(o instanceof VarpNumber){
                return ((VarpNumber) o).doubleValue();
            }
            return 0;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static String getValueFromGoodsIf (Object obj1,Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            //obj1-----goodsInfo
            //obj2-----key,use it to get value in goodsInfo
            //obj3----- a value that going to compare with the value in goodsInfo
            if(obj1==null||obj2==null){
                return "";
            }
            String goodsInfo = obj1.toString();
            String key = obj2.toString();

            if("".equals(goodsInfo.trim())||"".equals(key.trim())){
                return "";
            }
            Map<String,String> map = transGoodsIfToMap(goodsInfo);
            String value = map.get(key)==null?null:map.get(key).toString();
            return value;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return "";
        }
    }

    public static   Map<String,String>  transGoodsIfToMap(Object obj){
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
                if(ss!=null&&ss.length>1){
                    res.put(ss[0], ss[1]);
                }
            }
            return res;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    public static long getCountFromMapByKey(Object obj, String key){
        try {
            long count = 0;
            if (StringUtils.isBlank(key)) return count;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String[] keyArray = key.trim().split(",");
                for (String keyStr : keyArray) {
                    if ("余额支付".equals(keyStr)) {
                        for (Object realKey : map.keySet()) {
                            if (realKey != null && !realKey.toString().contains("NOCARDPAY")) {
                                Object o = map.get(realKey);
                                if (o instanceof SumNumber) {
                                    count += ((SumNumber) o).getCount();
                                }
                            }
                        }
                    } else if ("银行卡支付".equals(keyStr)) {
                        for (Object realKey : map.keySet()) {
                            if (realKey != null && realKey.toString().contains("NOCARDPAY")) {
                                Object o = map.get(realKey);
                                if (o instanceof SumNumber) {
                                    count += ((SumNumber) o).getCount();
                                }
                            }
                        }
                    }
                }
            }
            return count;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static long getValueFromMapByKey(Object obj, String key){
        try {
            long value = 0;
            if (StringUtils.isBlank(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String[] keyArray = key.trim().split(",");
                for (String keyStr : keyArray) {
                    if ("余额支付".equals(keyStr)) {
                        for (Object realKey : map.keySet()) {
                            if (realKey != null && !realKey.toString().contains("NOCARDPAY")) {
                                Object o = map.get(realKey);
                                if (o instanceof SumNumber) {
                                    value += ((SumNumber) o).longValue();
                                }
                            }
                        }
                    } else if ("银行卡支付".equals(keyStr)) {
                        for (Object realKey : map.keySet()) {
                            if (realKey != null && realKey.toString().contains("NOCARDPAY")) {
                                Object o = map.get(realKey);
                                if (o instanceof SumNumber) {
                                    value += ((SumNumber) o).longValue();
                                }
                            }
                        }
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static long getCountFromMapByKeySplit(Object obj, String key){
        try {
            long value = 0;
            if (StringUtils.isBlank(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String[] keyArray = key.trim().split(",");
                for (String keyStr : keyArray) {
                    Object o = map.get(keyStr);
                    if (o != null && o instanceof SumNumber) {
                        value += ((SumNumber) o).getCount();
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountFromMapByKeySplit 全局方法出现异常", e);
            return 0;
        }
    }



    public static BigDecimal getMergeMapByKeys(Object obj, Object transtime, String duration, Object key1, Object key2, Object countType) {
        BigDecimal result = new BigDecimal(0);
        try {
            if (obj == null || !(obj instanceof TimedItems) || key1 == null || key2 == null || countType == null) {
                return new BigDecimal("0");
            }
            TimedItems tt = (TimedItems) obj;
            Object o = null;

            String[] key1Array = key1.toString().split(",");
            String[] key2Array = key2.toString().split(",");
            Set<String> keySet = new HashSet<String>();
            for (String s : key1Array) {
                for (String s2 : key2Array) {
                    String newStr = s + "_" + s2;
                    keySet.add(newStr);
                }
            }
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
                    for (String key : keySet) {
                        if (map.containsKey(key)){
                            Object sum = map.get(key);
                            if (sum instanceof SumNumber  ) {
                                BigDecimal bigDecimal1 = new BigDecimal(((SumNumber) sum).longValue());
                                result = result.add(bigDecimal1);
                            }
                        }

                    }
                } else if ("number".equalsIgnoreCase(countTypeStr)) {
                    for (String key : keySet) {
                        if (map.containsKey(key)){
                            Object sum = map.get(key);
                            if (sum instanceof SumNumber  ) {
                                BigDecimal bigDecimal1 = new BigDecimal(((SumNumber) sum).getCount());
                                result = result.add(bigDecimal1);
                            }
                        }
                    }
                }
                LoggerUtil.getLogger().info("getMergeMapByKeys result:{}",result);

            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 getMergeMapByKeys", e);
            return result;
        }
        return result;
    }
    public BigDecimal getMergeMapByKey(Object obj, Object transtime, String duration, Object key1, Object countType) {
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

    public static BigDecimal getValueFromMapByAllKeySplit(Object obj, Object key,Object countType){
        BigDecimal value = new BigDecimal(0);
        try {
            LoggerUtil.getLogger().info("getValueFromMapByAllKeySplit,obj == {}", JSONObject.toJSONString(obj));
            LoggerUtil.getLogger().info("getValueFromMapByAllKeySplit,key == {}", JSONObject.toJSONString(key));

            if (obj == null || isNull(key) || countType == null) return value;
            //统计金额或者次数 "amount" or "number"
            String countTypeStr = countType.toString();

            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String keyStr = key.toString();
                if ("all".equalsIgnoreCase(keyStr)) {
                    for (Object o : map.values()) {
                        if ( o != null && o instanceof SumNumber ) {
                            if ("amount".equalsIgnoreCase(countTypeStr)) {
                                value = value.add(new BigDecimal(((SumNumber) o).longValue()));
                            } else if ("number".equalsIgnoreCase(countTypeStr)) {
                                value = value.add(new BigDecimal(((SumNumber) o).getCount()));
                            }
                        }
                    }
                } else {
                    String[] keyArray = keyStr.trim().split(",|;");
                    for (String keyItme : keyArray) {
                        Object o = map.get(keyItme);
                        if (o != null && o instanceof SumNumber) {
                            if ("amount".equalsIgnoreCase(countTypeStr)) {
                                value = value.add(new BigDecimal(((SumNumber) o).longValue()));
                            } else if ("number".equalsIgnoreCase(countTypeStr)) {
                                value = value.add(new BigDecimal(((SumNumber) o).getCount()));
                            }
                        }
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getValueFromMapByAllKeySplit 全局方法出现异常", e);
            return value;
        }
    }


    public static long getMergeMapObjectValue(Object obj,Object transtime, String duration, String key){
        try {
            long value = 0;
            if (StringUtils.isBlank(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                String[] keyArray = key.trim().split(",");
                for (String keyStr : keyArray) {
                    if ("余额支付".equals(keyStr)) {
                        for (Object realKey : map.keySet()) {
                            if (realKey != null && !realKey.toString().contains("NOCARDPAY")) {
                                Object o = map.get(realKey);
                                if (o instanceof SumNumber) {
                                    value += ((SumNumber) o).longValue();
                                }
                            }
                        }
                    } else if ("银行卡支付".equals(keyStr)) {
                        for (Object realKey : map.keySet()) {
                            if (realKey != null && realKey.toString().contains("NOCARDPAY")) {
                                Object o = map.get(realKey);
                                if (o instanceof SumNumber) {
                                    value += ((SumNumber) o).longValue();
                                }
                            }
                        }
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static ConvenientHashMap getCacheMap(Object obj, Object transtime, String duration) {
        /**
         * 获取MergeableMapObject对象中的ConvenientHashMap
         */
        LoggerUtil.getLogger().debug("getCacheMap obj:"+obj);
        ConvenientHashMap map = new ConvenientHashMap();
        try{
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
            LoggerUtil.getLogger().debug("getCacheMap Object:"+o);
            if (o instanceof MergeableMapObject) {
                return (ConvenientHashMap)((MergeableMapObject) o).getMap();
            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error(e.getMessage(),e);
        }
        return map;
    }

    public static int getMergeMapObjectMerchantCount(Object obj, Object transtime, String duration){

        if (obj == null || !(obj instanceof TimedItems)) {
            return 0;
        }
        TimedItems tt = (TimedItems) obj;
        Object o = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        if (transtime == null || duration == null) {
            o = tt.getRaw();
        } else if (transtime instanceof Date) {
            date1 = (Date) transtime;
        } else if (transtime instanceof Long) {
            date1 = new Date((Long) transtime);
        } else {
            try {
                date1 = formatter.parse(transtime.toString());
            } catch (ParseException e) {
                LoggerUtil.getLogger().error("全局方法出现异常", e);
            }
        }
        o = tt.getRaw(date1, duration);
        if (o instanceof MergeableMapObject){
            MergeableMapObject m = (MergeableMapObject) o;
            Map<Object, Object> map = m.getMap();
            return map.size();
        }
        return 0;
    }

    public static boolean isDifferenceByMerchantUseCode(Object obj, Object transtime, String duration, int merSize){

        if (obj == null || !(obj instanceof TimedItems)) {
            return false;
        }
        TimedItems tt = (TimedItems) obj;
        Object o = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();
        if (transtime == null || duration == null) {
            o = tt.getRaw();
        } else if (transtime instanceof Date) {
            date1 = (Date) transtime;
        } else if (transtime instanceof Long) {
            date1 = new Date((Long) transtime);
        } else {
            try {
                date1 = formatter.parse(transtime.toString());
            } catch (ParseException e) {
                LoggerUtil.getLogger().error("全局方法出现异常", e);
            }
        }
        o = tt.getRaw(date1, duration);
        if (o instanceof MergeableMapObject){
            MergeableMapObject m = (MergeableMapObject) o;
            Map<Object, Object> map = m.getMap();
            if (map.size() >= merSize) {
                Set<Object> tempSet = null;
                int count = 0;
                for (Object value : map.values()) {
                    if (((DistinctedCountNumber) value).getSet().size() > 2) return false;
                    if (count > 0) {
                        if (!tempSet.equals(((DistinctedCountNumber) value).getSet())) {
                            return true;
                        }
                    }
                    count++;
                    tempSet = ((DistinctedCountNumber) value).getSet();
                }
            }
        }
        return false;
    }

    public double division (Object fenziObj, Object fenmuObj){
        try {
            LoggerUtil.getLogger().debug("fenziObj == {}", fenziObj);
            LoggerUtil.getLogger().debug("fenmuObj == {}", fenmuObj);
            //两个数字相除
            if(fenziObj==null || fenmuObj==null)
                return -1;
            long fenzi = Long.valueOf(fenziObj.toString());
            long fenmu = Long.valueOf(fenmuObj.toString());
            if(fenmu==0)
                return -1;
            double result = (double)fenzi/fenmu;
            return result;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public double divisionByDecimalPro (Object fenziObj, Object fenmuObj){
        try {
            LoggerUtil.getLogger().debug("fenziObj == {}", fenziObj);
            LoggerUtil.getLogger().debug("fenmuObj == {}", fenmuObj);
            //两个数字相除
            if(fenziObj==null || fenmuObj==null)
                return -1;

            BigDecimal fenzi = new BigDecimal(fenziObj.toString());
            BigDecimal fenmu = new BigDecimal(fenmuObj.toString());
            if(fenmu.compareTo(BigDecimal.ZERO) == 0)
                return 0;
            BigDecimal result = fenzi.divide(fenmu, 2,BigDecimal.ROUND_HALF_UP);
            return result.doubleValue();
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static double divisionByDecimal (Object fenziObj, Object fenmuObj){
        try {
            LoggerUtil.getLogger().debug("fenziObj == {}", fenziObj);
            LoggerUtil.getLogger().debug("fenmuObj == {}", fenmuObj);
            //两个数字相除
            if(fenziObj==null || fenmuObj==null)
                return -1;
            BigDecimal fenzi = new BigDecimal(fenziObj.toString());
            BigDecimal fenmu = new BigDecimal(fenmuObj.toString());
            if(fenmu.compareTo(BigDecimal.ZERO)==0)
                return -1;
            BigDecimal result = fenzi.multiply(new BigDecimal(100)).divide(fenmu,2,BigDecimal.ROUND_HALF_UP);
            return result.doubleValue();
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return -1;
        }
    }

    public static long addDay(Object time,int obj) {
        try {
            LoggerUtil.getLogger().debug("time == {}", time);
            LoggerUtil.getLogger().debug("obj == {}", obj);
            //获取指定时间
            Date date = new Date();
            if (time instanceof Date) {
                date = (Date) time;
            }
            if (time instanceof Long) {
                date = new Date((Long) time);
            }
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE,obj);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            return cal.getTimeInMillis();
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static long getLastDateOfPrevMonth(Object time,int obj) {
        try {
            LoggerUtil.getLogger().debug("time == {}", time);
            LoggerUtil.getLogger().debug("obj == {}", obj);
            //获取指定时间
            Date date = new Date();
            if (time instanceof Date) {
                date = (Date) time;
            }
            if (time instanceof Long) {
                date = new Date((Long) time);
            }
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.MONTH, obj);
            cal.set(Calendar.MINUTE, 59);
            cal.set(Calendar.SECOND, 59);
            cal.set(Calendar.MILLISECOND, 59);
            cal.set(Calendar.HOUR_OF_DAY, 23);
            //指定日期月份减去一后的 最大天数
            cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
            return cal.getTimeInMillis();
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static long getCacheCount(Object obj, Object transtime, String duration) {
        /**
         * 获取SumNumber等类型的cache中的值
         */
        if (obj == null || !(obj instanceof TimedItems)) {
            return 0;
        }
        TimedItems tt = (TimedItems) obj;
        Object o = null;
        if (transtime == null || duration == null) {
            o = tt.getRaw();
        } else {
            o = tt.getRaw(transtime, duration);
        }
        if (o instanceof CountNumber) {
            return ((CountNumber) o).getCount();
        }
        if (o instanceof SumNumber) {
            return ((SumNumber) o).getCount();
        }
        if (o instanceof MaxNumber) {
            return ((MaxNumber) o).getCount();
        }
        if (o instanceof AvgNumber) {
            return ((AvgNumber) o).getCount();
        }
        if (o instanceof VarsNumber) {
            return ((VarsNumber) o).getCount();
        }
        return 0L;
    }

    public static long getCacheValue(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().info("getCacheValue obj:"+obj);
            System.out.println("heheheehee222");
            if (obj == null || !(obj instanceof TimedItems) ) {
                return 0;
            }

            TimedItems tt = (TimedItems) obj;
            Object o = null;

            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
            LoggerUtil.getLogger().info("getCacheValue o:"+o);
            if (o instanceof CountNumber) {
                return ((CountNumber) o).longValue();
            }
            if (o instanceof ReplacedObject) {
                Object value = ((ReplacedObject) o).getObject();
                return Long.parseLong(value.toString());
            }
            if (o instanceof SumNumber) {
                return ((SumNumber) o).longValue();
            }
            if (o instanceof MaxNumber) {
                return ((MaxNumber) o).longValue();
            }
            if (o instanceof MinNumber) {
                return ((MinNumber) o).longValue();
            }
            if (o instanceof AvgNumber) {
                return ((AvgNumber) o).longValue();
            }
            if (o instanceof MaxContinuousCountNumber) {
                return ((MaxContinuousCountNumber) o).longValue();
            }
            if (o instanceof VarsNumber) {
                return ((VarsNumber) o).longValue();
            }
            if (o instanceof DistinctedListObject) {
                int size = ((DistinctedListObject)o).getSet().size();
                return size;
            }
            if (o instanceof MergeableListObject) {
                List list = ((MergeableListObject)o).getList();
                return 0L;
            }

            return 0L;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public boolean operCondCacheLoop(Object obj, Object transtime,Object fraNumStr,String fragment,Object amt,String x,Object obj2){
        try {
            if (obj == null || transtime == null || fraNumStr == null || fragment == null || amt==null || x == null || obj2 == null){
                return false;
            }
            int fraNum = Integer.parseInt(fraNumStr.toString());
            for (int i=0; i <fraNum; i++) {
                if (i==0) {
                    long thisamt = Long.parseLong(amt.toString());
                    boolean result = operCond(getCacheValue(obj, transtime, 1+i+fragment)+thisamt, x, obj2);
                    if (!result) return false;
                } else {
                    boolean result = operCond(getCacheValue(obj, transtime, i+1+fragment)-getCacheValue(obj, transtime, i+fragment), x, obj2);
                    if (!result) return false;
                }

            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
        return true;
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

    public static double getQuantile(Object dataList, double p) {
        try {
            if (dataList == null)
                return 0;
            List<Number> list = (List<Number>) dataList;
            if (list.isEmpty()) {
                return 0;
            }
            double res = 0;
            double x = (list.size() - 1) * p;
            int i = (int) x; // 取出整数部分
            double j = x - i; // 还没找到最精确的取double数的小数部分的方法，有可能会有误差
            Long n1 = (Long) list.get(i);
            Long n2 = null;
            if (j !=0) {
                n2 = (Long) list.get(i + 1);
            }
            res = (1 - j) * n1 + (j ==0 ? 0 : j * n2);
            return res;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getQuantile 全局方法出现异常", e);
            return 0;
        }
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

    public static double getMecTransferOutOrInByJsonArray(String jsonArrayStr, String fromtype, String totype, String flagType, String keyStr) {
        try {
            if (jsonArrayStr == null || fromtype == null || totype == null || flagType == null) {
                return 0;
            }
            Set<String> flagTypeSet = new HashSet<String>();
            flagTypeSet.add("等于");
            flagTypeSet.add("不等于");
            flagTypeSet.add("ALL");
            flagType = flagType.trim().toUpperCase();
            if (!flagTypeSet.contains(flagType)) {
                return 0;
            }
            String [] fromtypeArr = fromtype.trim().toUpperCase().split(",");
            Set<String> fromtypeSet = new HashSet<String>();
            for (String str : fromtypeArr) {
                if (notNull(str)) {
                    fromtypeSet.add(str);
                }
            }
            String [] totypeArr = totype.trim().toUpperCase().split(",");
            Set<String> totypeSet = new HashSet<String>();
            for (String str : totypeArr) {
                if (notNull(str)) {
                    totypeSet.add(str);
                }
            }

            String jsonStr = jsonArrayStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");
            String [] jsonArray = jsonStr.split("&");
            BigDecimal result = new BigDecimal(0);
            for (String obj : jsonArray) {
                JSONObject jsonObject = JSONObject.parseObject(obj);
                String flag = jsonObject.getString("flag");
                String fromtypeValue = fromtypeSet.contains("ALL") ? "ALL" : jsonObject.getString("fromtype");
                String totypeValue = totypeSet.contains("ALL") ? "ALL" : jsonObject.getString("totype");
                String valueStr = jsonObject.getString(keyStr);
                if ("等于".equals(flagType) && "1".equals(flag) && fromtypeSet.contains(fromtypeValue) && totypeSet.contains(totypeValue)) {
                    BigDecimal valueBig = new BigDecimal(valueStr);
                    result = result.add(valueBig);
                } else if ("不等于".equals(flagType) && "0".equals(flag) && fromtypeSet.contains(fromtypeValue) && totypeSet.contains(totypeValue)) {
                    BigDecimal valueBig = new BigDecimal(valueStr);
                    result = result.add(valueBig);
                } else if ("ALL".equals(flagType) && fromtypeSet.contains(fromtypeValue) && totypeSet.contains(totypeValue)) {
                    BigDecimal valueBig = new BigDecimal(valueStr);
                    result = result.add(valueBig);
                }
            }
            return result.doubleValue();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getMecTransferOutOrInByJsonArray 全局方法出现异常", e);
            return 0;
        }
    }

    private static Object getMchControlValueByKey(Object jsonData,String key){
        try {
            LoggerUtil.getLogger().debug("jsonData == {}", jsonData);
            LoggerUtil.getLogger().debug("day == {}", key);
            if(jsonData == null || key== null){
                return null;
            }
            String jsonStr = jsonData.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return null;
            }
            jsonStr = jsonStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");

            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            BigDecimal result = new BigDecimal(0);
            if (jsonObj != null && jsonObj.containsKey(key)) {
                if(jsonObj.getBigDecimal(key)!=null){
                    result = jsonObj.getBigDecimal(key);
                }
            }
            return result.doubleValue();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getMchControlValueByKey全局方法出现异常", e);
            return null;
        }
    }

    private static   String getIpProOrCity(Object ipArea, Object areaType){
        try{
            LoggerUtil.getLogger().debug("ipArea == {}", ipArea);
            LoggerUtil.getLogger().debug("areaType == {}", areaType);
            if (ipArea == null||areaType == null){
                return null;
            }
            String area = "";
            String[] ipAreaArr = ipArea.toString().split(";");
            if (ipAreaArr.length > 2&&"省".equalsIgnoreCase(areaType.toString())){
                area = ipAreaArr[1];
            }else if(ipAreaArr.length > 2&&"市".equalsIgnoreCase(areaType.toString())){
                area = ipAreaArr[2];
            }
            if (null != area&&area.isEmpty())
                return null;

            return area;

        }catch (Exception e){
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return null;
        }
    }

    public static boolean isInDistintedList(Object obj, Object transtime, String duration,Object current) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            LoggerUtil.getLogger().debug("current == {}", current);
            /**
             *获取DistinctedListObject等类型cache中保存的set和list对象的大小
             */
            if (obj == null || !(obj instanceof TimedItems)) {
                return false;
            }
            if(current == null)
                current = "";
            TimedItems tt = (TimedItems) obj;
            Object o = null;
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1 = new Date();
            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else if (transtime instanceof Date) {
                date1 = (Date) transtime;
            } else if (transtime instanceof Long) {
                date1 = new Date((Long) transtime);
            } else {
                try {
                    date1 = formatter.parse(transtime.toString());
                } catch (ParseException e) {
                    LoggerUtil.getLogger().error("全局方法出现异常", e);
                }
            }
            o = tt.getRaw(date1, duration);
            if (o instanceof DistinctedListObject) {
                return ((DistinctedListObject) o).getSet().contains(current.toString());
            }
            if (o instanceof MergeableListObject) {
                return ((MergeableListObject) o).getList().contains(current.toString());
            }
            if (o instanceof MergeableSortedList) {
                return ((MergeableSortedList) o).getList().contains(current.toString());
            }

            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;

        }
    }

    public static double getHoursNull(Object time1, Object time2) {
        try {
            LoggerUtil.getLogger().debug("time1 == {}", time1);
            LoggerUtil.getLogger().debug("time2 == {}", time2);
            //获取两个时间的相差天数 time1 表示过去的一次交易时间，time2 表示的是当前的一次交易时间
            if (time1 !=null) {
                Date date1 = new Date();
                if (time1 instanceof Date) {
                    date1 = (Date) time1;
                } else if (time1 instanceof Long) {
                    date1 = new Date((Long) time1);
                } else {
                    return -1;
                }
                long a1 = date1.getTime();

                if(time2==null){
                    time2 = new Date();
                }
                Date date2 = new Date();
                if (time2 instanceof Date) {
                    date2 = (Date) time2;
                }
                else if (time2 instanceof Long) {
                    date2 = new Date((Long) time2);
                } else {
                    return -1;
                }
                long a2 = date2.getTime();

                return Math.abs((a2 - a1) / (60 * 60 * 1000.0));
            }
            return -1;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static boolean isNumeric(Object obj) {
        try {
            if(obj==null) {
                return false;
            }
            String str = obj.toString();
            Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
            Matcher isNum = pattern.matcher(str);
            if (!isNum.matches()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static long formateDate(Object time,Object formate) {
        try {
            LoggerUtil.getLogger().debug("time == {}", time);
            LoggerUtil.getLogger().debug("formate == {}", formate);

            String timeStr = "";
            if (time instanceof String) {
                timeStr = time.toString();
            }else{
                return 0L;
            }
            String formateStr = "";
            if (formate instanceof String) {
                formateStr = formate.toString();
            }else{
                return 0L;
            }


            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formateStr);
            Date date = null;
            date = simpleDateFormat.parse(timeStr);
            return date.getTime();


        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static boolean isNull (Object obj){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            if(obj == null){
                return true;
            }
            if("".equals(obj.toString().trim()) || "null".equals(obj.toString().trim())){
                return true;
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static long calRemainder(Object obj1, Object obj2) {
        try {
            if (isNull(obj1) || isNull(obj2)) {
                return -1L;
            }
            long num2 = Long.parseLong(obj2.toString());
            if (num2 == 0) {
                return 0L;
            }
            long num1 = Long.parseLong(obj1.toString());
            long rs = num1%num2;
            return rs;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("calRemainder 全局方法出现异常", e);
            return -1L;
        }
    }

    public static double timeDiffHourToDouble(Object time1, Object time2) {
        try {
            if (isNull(time1) || isNull(time2)) {
                return -1;
            }
            long ltime1 = 0;
            if (time1 instanceof Date) {
                ltime1 = ((Date) time1).getTime();
            } else if (time1 instanceof Long) {
                ltime1 = Long.parseLong(time1.toString());
            } else {
                return -1;
            }
            long ltime2 = 0;
            if (time2 instanceof Date) {
                ltime2 = ((Date) time2).getTime();
            } else if (time2 instanceof Long) {
                ltime2 = Long.parseLong(time2.toString());
            } else {
                return -1;
            }
            System.out.println(ltime2-ltime1);
            double hours = new BigDecimal(ltime2-ltime1).divide(new BigDecimal(1000* 60 * 60), 16,BigDecimal.ROUND_HALF_UP).doubleValue();
            return hours;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("timeDiffHourToDouble 全局方法出现异常", e);
            return -1;
        }
    }

    public static int getDayByStrPlus(Object dateStr, String format) {
        try {
            LoggerUtil.getLogger().debug("dateStr == {}", dateStr);
            //获取日期dateStr的相差和今天相隔的天数
            if (notNull(dateStr) && notNull(format)) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                Date now = simpleDateFormat.parse(simpleDateFormat.format(new Date()));
                Date date = simpleDateFormat.parse(dateStr.toString());
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(now);
                long time1 = calendar.getTimeInMillis();
                calendar.setTime(date);
                long time2 = calendar.getTimeInMillis();
                long between_days=(time1-time2)/(1000*3600*24);
                return Integer.parseInt(String.valueOf(between_days));
            }
            return -1;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }

    public static boolean isNotInOtherIdAddr (Object a, Object b,Object c, Object d){
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("b == {}", b);
            LoggerUtil.getLogger().debug("c == {}", c);
            LoggerUtil.getLogger().debug("d == {}", d);
            if (a == null || b == null || c == null || d == null) {
                return false;
            }
            String bs = (String) b;
            String as = (String) a;
            String cs = (String) c;
            String ds = (String) d;
            String[] arr = bs.split(";");
            String[] arr2 = ds.split(";");
            boolean flag = false;
            for (String temp: arr) {
                if (as.equals(temp)) {
                    flag = true;
                }
            }
            int count = 0;
            if(flag){
                for (String temp: arr2) {
                    if (cs.equals(temp)) {
                        count++;
                    }
                }
                if(count<=1){
                    return true;
                }else{
                    return false;
                }
            }else{
                for (String temp: arr2) {
                    if (cs.equals(temp)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static boolean isNotInStringSemicolon (Object a, Object b){
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("b == {}", b);
            if (a == null || b == null) {
                return false;
            }
            String bs = (String) b;
            String as = (String) a;
            if("".equals(as)||"".equals(bs)){
                return false;
            }
            String[] arr = bs.split(";");
            for (String temp: arr) {
                if (as.equals(temp)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static String replaceAll (String a, String b){
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("b == {}", b);
            if (a == null || b == null) {
                return "";
            }
            return a.replaceAll(b, "");
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return "";
        }
    }

    public static Object getListFromMapByKeySplit(Object obj, String key){
        try {
            Set value = new HashSet();
            if (isNull(key)) return value;
            if (obj instanceof ConvenientHashMap) {
                ConvenientHashMap map = (ConvenientHashMap) obj;
                if ("all".equalsIgnoreCase(key.trim())) {
                    Iterator entries = map.entrySet().iterator();
                    while (entries.hasNext()) {
                        Map.Entry entry = (Map.Entry) entries.next();
                        if (entry != null && entry.getValue() != null && entry.getValue() instanceof DistinctedListObject) {
                           value.addAll(((DistinctedListObject) entry.getValue()).getSet());
                        }
                    }
                } else {
                    String[] keyArray = key.trim().split(",");
                    for (String keyStr : keyArray) {
                        Object o = map.get(keyStr);
                        if (o != null && o instanceof DistinctedListObject) {
                            value.addAll(((DistinctedListObject) o).getSet());
                        }
                    }
                }
            }
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getListFromMapByKeySplit 全局方法出现异常", e);
            return new HashSet();
        }
    }

    public static int getListSize(Object obj){
        try {
            if (obj == null || !(obj instanceof Collection)) {
                return 0;
            }
            Collection list = (Collection) obj;
            return list.size();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getListSize 全局方法出现异常", e);
            return 0;
        }
    }

    public static boolean notOnlyContainsThisValue(Object obj, Object setObj) {
        try {
            if (setObj == null || !(setObj instanceof Set)) {
                return false;
            }
            Set set = (Set) setObj;
            if (!notNull(obj)) {
                return false;
            }
            String val = obj.toString();
            return set.contains(val) && set.size()>1;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  notOnlyContainsThisValue", e);
            return false;
        }
    }

    public static boolean isOnlyContainsThisValue(Object obj, Object setObj) {
        try {
            if (setObj == null || !(setObj instanceof Set)) {
                return false;
            }
            Set set = (Set) setObj;
            if (!notNull(obj)) {
                return false;
            }
            String val = obj.toString();
            return set.contains(val) && set.size()==1;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  isOnlyContainsThisValue", e);
            return false;
        }
    }

    public static String getReplacedValueForStr(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             * 获取SumNumber等类型的cache中的值
             */
            if (obj == null || !(obj instanceof TimedItems) ) {
                return "";
            }

            TimedItems tt = (TimedItems) obj;
            Object o = null;

            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }

            if (o instanceof ReplacedObject) {
                Object value = ((ReplacedObject) o).getObject();
                return value.toString();
            } else if (o instanceof OccupiedObject){
                Object value = ((OccupiedObject) o).getObject();
                return value.toString();
            }

            return "";
        } catch (Exception e) {

            LoggerUtil.getLogger().error("getReplacedValueForStr 全局方法出现异常", e);
            return "";
        }
    }

    public static long parseLong(Object obj) {
        try {
            if (isNull(obj)) {
                return -1L;
            }
            String val = obj.toString();
            return Long.parseLong(val);
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  parseLong", e);
            return -1L;
        }
    }

    public static boolean operConds (Object obj,String x,Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            Set<String> set = new HashSet<String>();
            set.add(">");
            set.add("<");
            set.add(">=");
            set.add("<=");
            set.add("==");
            set.add("!=");
            set.add("包含");
            set.add("不包含");
            if(obj != null&&obj2 != null&&!"null".equals(obj)&&!"null".equals(obj2)&&set.contains(x)){
                if(obj instanceof String|| obj2 instanceof String ){
                    String s1 = obj.toString().trim();
                    String s2 = obj2.toString().trim();
                    if(s1.equals(s2)&&"==".equals(x)){
                        return true;
                    }
                    if(!s1.equals(s2)&&"!=".equals(x)){
                        return true;
                    }
                    String[] s3 = null;
                    if(s2 != null){
                        s3 = s2.split(",");
                    }
                    for(int i = 0;i<s3.length;i++){

                        if(!"".equals(s1)&&s1.contains(s3[i])&&"包含".equals(x)){
                            return true;
                        }else if(!"".equals(s1)&&!s1.contains(s3[i])&&"不包含".equals(x)){
                            return true;
                        }
                    }
                    if("包含".equals(x)||"不包含".equals(x)){
                        return false;
                    }
                    if(!(isNumeric(obj)&&isNumeric(obj2))){
                        return false;
                    }
                    BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                    BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                    int a = leftDecimal.compareTo(rightDecimal);
                    if(">".equals(x) && a>0){
                        return true;
                    }
                    if("<".equals(x) && a<0){
                        return true;
                    }
                    if(">=".equals(x) && a>=0){
                        return true;
                    }
                    if("<=".equals(x) && a<=0){
                        return true;
                    }

                    return false;
                }
                if(!(isNumeric(obj)&&isNumeric(obj2))){
                    return false;
                }
                BigDecimal leftDecimal = new BigDecimal(obj.toString().trim());
                BigDecimal rightDecimal = new BigDecimal(obj2.toString().trim());
                int a = leftDecimal.compareTo(rightDecimal);
                if(">".equals(x) && a>0){
                    return true;
                }
                if("<".equals(x) && a<0){
                    return true;
                }
                if(">=".equals(x) && a>=0){
                    return true;
                }
                if("<=".equals(x) && a<=0){
                    return true;
                }
                if("==".equals(x) && a==0){
                    return true;
                }
                if("!=".equals(x) && a!=0){
                    return true;
                }
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常!obj:"+obj+", x:"+x+", obj2:"+obj2, e);
            return false;
        }
    }

    private static long timeDiffMinute(Object time1, Object time2) {
        try {
            if (isNull(time1) || isNull(time2)) {
                return -1L;
            }
            long ltime1 = 0;
            if (time1 instanceof Date) {
                ltime1 = ((Date) time1).getTime();
            } else if (time1 instanceof Long) {
                ltime1 = Long.parseLong(time1.toString());
            } else {
                return -1L;
            }
            long ltime2 = 0;
            if (time2 instanceof Date) {
                ltime2 = ((Date) time2).getTime();
            } else if (time2 instanceof Long) {
                ltime2 = Long.parseLong(time2.toString());
            } else {
                return -1L;
            }
            long minute = (ltime2-ltime1)/(1000* 60);
            return minute;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("timeDiffMinute 全局方法出现异常", e);
            return -1L;
        }
    }

    public static String concatStringBySep(Object obj1, Object obj2, Object sep) {
        try {
            if (isNull(obj1)) {
                return "";
            }
            String str1 = obj1.toString();
            if (isNull(obj2)) {
                return str1;
            }
            String str2 = obj2.toString();
            String sepStr = isNull(sep)? "" : sep.toString();
            return str1+sepStr+str2;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("concatStringBySep 全局方法出现异常", e);
            return "";
        }
    }

    // 用JAVA程序写出当你在超市购物花费1.1元时，你给收银员2元钱，收银员找你0.9元的过程；
    //　　当时一看题目，好简单啊！迅速写出：
    public static void shell(){
        double total = 2.0;
        double used = 1.1;
        double result = total - used;
        System.out.println("result : " + result);
    }

    public static boolean merchantNotTriggerRules(Object jsonArrayObj, Object numDays, Object ruleCodes) {
        boolean  result = true;
        try {
            if (jsonArrayObj == null || numDays==null || ruleCodes==null) {
                return result;
            }
            String jsonArrayStr = jsonArrayObj.toString();
            if (!(jsonArrayStr.contains("{")&&jsonArrayStr.contains("}"))) {
                return result;
            }
            String jsonStr = jsonArrayStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");
            jsonStr = "["+jsonStr+"]";
            JSONArray jsonArray = JSON.parseArray(jsonStr);
            BigDecimal num = new BigDecimal(numDays.toString().trim());
            List<String>  ruleCodeList = Arrays.asList(ruleCodes.toString().split(","));
            boolean  ruleTag = "all".equalsIgnoreCase(ruleCodes.toString())? true:false;
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                BigDecimal diffNum  = jsonObject.getBigDecimal("diff");
                int a = num.compareTo(diffNum);
                if(a>=0){
                    if(ruleTag){
                        return !result;
                    }
                    for(String ruleCode : jsonObject.getString("rules").split(",")){
                        if(ruleCodeList.contains(ruleCode)){
                            return !result;
                        }
                    }
                }
            }
            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getMerchantTriggerRulesResult 全局方法出现异常", e);
            return !result;
        }
    }

    private static boolean operBlackDiffByJsonArray(Object jsonArrayObj, Object types, Object sources, String oper, Object inputDate) {
        try {
            if (jsonArrayObj == null || types==null || sources==null || oper == null || inputDate == null) {
                return false;
            }
            String jsonArrayStr = jsonArrayObj.toString();
            if (!(jsonArrayStr.contains("{")&&jsonArrayStr.contains("}"))) {
                return false;
            }
            String jsonStr = jsonArrayStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");
            jsonStr = "["+jsonStr+"]";
            JSONArray jsonArray = JSON.parseArray(jsonStr);
            Set typeSet = (Set) splitToList(types);
            Set sourceSet = (Set) splitToList(sources);
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                boolean flag = ((typeSet.contains("all") && sourceSet.contains("all"))
                        || (typeSet.contains("all") && sourceSet.contains(jsonObject.get("source")))
                        || (typeSet.contains(jsonObject.get("type")) && sourceSet.contains("all"))
                        || (typeSet.contains(jsonObject.get("type")) && sourceSet.contains(jsonObject.get("source"))))
                        && operCond(jsonObject.get("ct_diff"), oper, inputDate);
                if (flag) {
                    return true;
                } else {
                    continue;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("operBlackDiffByJsonArray 全局方法出现异常", e);
            return false;
        }
    }

    private static Object splitToList(Object obj) {
        Set resultSet = new HashSet();
        try {
            if (!notNull(obj)) {
                return resultSet;
            }
            String str = obj.toString();
            if ("all".equalsIgnoreCase(str)) {
                resultSet.add("all");
                return resultSet;
            }
            List list = Arrays.asList(str.split(",|;"));
            resultSet.addAll(list);
            return resultSet;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  splitToList", e);
            return resultSet;
        }
    }

    public static Object prodDictMap(Object prod) {
        try {
            if (isNull(prod)) {
                return "";
            }
            String prodStr = prod.toString();
            //NOCARDPAY->无卡,FE->聚合,NET->网银收单,TRANSFER->转账,ACCOUNT->账户支付,DFDF->代付,RJT->日结通
            Map prodMap = new HashMap();
            prodMap.put("无卡","NOCARDPAY");
            prodMap.put("聚合","FE");
            prodMap.put("网银收单","NET");
            prodMap.put("转账","TRANSFER");
            prodMap.put("账户支付","ACCOUNT");
            prodMap.put("代付","DFDF");
            prodMap.put("日结通","RJT");
            return prodMap.get(prodStr);
        } catch (Exception e) {
            LoggerUtil.getLogger().error("prodDictMap 全局方法出现异常", e);
            return "";
        }
    }

    public static Object mecPropertyDictMap(Object property) {
        try {
            if (isNull(property)) {
                return "";
            }
            String prodStr = property.toString();
            //签约名->transfer_signed_name_list,商编->transfer_mec_no_list,客户编号->transfer_merchantno_list,法人证件号->transfer_legal_license_list
            Map prodMap = new HashMap();
            prodMap.put("签约名","transfer_signed_name_list");
            prodMap.put("商编","transfer_mec_no_list");
            prodMap.put("客户编号","transfer_merchantno_list");
            prodMap.put("法人证件号","transfer_legal_license_list");
            return prodMap.get(prodStr);
        } catch (Exception e) {
            LoggerUtil.getLogger().error("mecPropertyDictMap 全局方法出现异常", e);
            return "";
        }
    }

    public static String getStringByJson(Object jsonArrayObj, Object key) {
        try {
            if (isNull(jsonArrayObj) || isNull(key)) {
                return "";
            }
            String jsonArrayStr = jsonArrayObj.toString();
            String jsonStr = jsonArrayStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");
            String keyStr = key.toString();
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            if (jsonObj != null && jsonObj.containsKey(keyStr)) {
                return jsonObj.getString(keyStr);
            }
            return "";
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getStringByJsonArray 全局方法出现异常", e);
            return "";
        }
    }

    public static String decryptFromBase64(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            String objStr = obj.toString();
            return AES.decryptFromBase64(objStr,"BiRw.mhv4Eq^E6We");
        } catch (Exception e) {
            LoggerUtil.getLogger().error("decryptFromBase64 全局方法出现异常", e);
        }
        return "";
    }

    public static Object decryptList(Object obj) {
        Set rSet = new HashSet();
        if (obj == null || !(obj instanceof Set)) {
            return rSet;
        }
        try {
            Set set = (Set) obj;
            for (Object item : set) {
                rSet.add(decryptFromBase64(item));
            }
            return rSet;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("decryptList 全局方法出现异常", e);
        }
        return rSet;
    }

    public static boolean containsAnyValue(Object obj, Object setObj) {
        try {
            if (setObj == null || !(setObj instanceof Set)) {
                return false;
            }
            Set set = (Set) setObj;
            if (set.contains("all")) {
                return true;
            }
            if (!notNull(obj)) {
                return false;
            }
            String val = obj.toString();
            return set.contains(val);
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  containsAnyValue", e);
            return false;
        }
    }

    public static boolean exitsIntersection(Object setObj1, Object setObj2) {
        if (isNull(setObj1) || isNull(setObj2) || !(setObj1 instanceof Set) || !(setObj2 instanceof Set)) {
           return false;
        }
        try {
            Set set1 = (Set) setObj1;
            Set set2 = (Set) setObj2;
            set1.retainAll(set2);
            return set1.size()>0;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  exitsIntersection", e);
            return false;
        }
    }

    public static Object containsSubSetAnyValue() {
            Set<String> result = new HashSet<String>();
            Set<String> set1 = new HashSet<String>() {
            {
                add("王者荣耀");
                add("英雄联盟");
                add("穿越火线");
                add("地下城与勇士");
            }
            };
            Set<String> set2 = new HashSet<String>() {
            {
                add("王者荣耀");
                add("地下城与勇士");
                add("魔兽世界");
            }
            };
            result.clear();
            result.addAll(set1);
            result.retainAll(set2);
            System.out.println("交集：" + result);
            result.clear();
            result.addAll(set1);
            result.removeAll(set2);
            System.out.println("差集：" + result);
            result.clear();
            result.addAll(set1);
            result.addAll(set2);
            System.out.println("并集：" + result);
            return null;
    }

    public static long getCountFromMap(Object obj,Object ruleCodesContent){
        try {
            long value = 0;
            String ruleCodes = ruleCodesContent.toString();
            ConvenientHashMap map = (ConvenientHashMap) obj;
            DistinctedListObject valueList = new DistinctedListObject();
            for(String ruleCode : ruleCodes.split(",")){
                if(map != null && map.get(ruleCode) != null){
                    valueList.merge((DistinctedListObject)map.get(ruleCode));
                }

            }
            value = valueList.getSet().size();
            return value;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getCountFromMap 全局方法出现异常", e);
            return 0;
        }
    }

    public static boolean isEquals(Object obj1, Object obj2, boolean casesensitive) {
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            LoggerUtil.getLogger().debug("casesensitive == {}", casesensitive);
            //判断传人的两个参数是否相等,根据casesensitive选择是否区分大小写
            if (notNull(obj1) && notNull(obj2)) {
                String a = casesensitive ? String.valueOf(obj1) : String.valueOf(obj1).toUpperCase();
                String b = casesensitive ? String.valueOf(obj2) : String.valueOf(obj2).toUpperCase();
                if (a.equals(b))
                    return true;
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static boolean isContainOrNotNoSplit(Object a, String x, Object b) {
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("b == {}", b);
            if (a == null || b == null || x == null) {
                return false;
            }
            String bs = b.toString();
            String as = a.toString();
            String[] Arr = bs.split(";");
            String[] aArr = Arr.length == 1 ?bs.split(",") : bs.split(";");
            int tag = 0;
            for (String temp: aArr) {
                if ("包含".equals(x)) {
                    if (as.equals(temp)) {
                        return true;
                    }
                } else {
                    if (as.equals(temp)) {
                        return false;
                    }
                    tag++;
                }
            }
            if (tag == aArr.length) {
                return true;
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    public static double subtractByDecimal(Object obj1, Object obj2){
        try {
            LoggerUtil.getLogger().debug("obj1 == {}", obj1);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            //两个数字相除
            if(isNull(obj1) || isNull(obj2))
                return 0;
            BigDecimal fenzi = new BigDecimal(obj1.toString());
            BigDecimal fenmu = new BigDecimal(obj2.toString());
            BigDecimal result = fenzi.subtract(fenmu);
            return result.doubleValue();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 subtractByDecimal", e);
            return 0;
        }
    }

    public static Object arrayStrToList(Object obj){
        try {
            //两个数字相除
            if(isNull(obj))
                return null;
            String str = obj.toString().replace("#", ",");
            List<String> jsonArray = JSON.parseArray(str, String.class);
            return jsonArray;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 arrayStrToArray", e);
            return null;
        }
    }

    public static Object getListValue(Object obj1, Object obj2){
        try {
            //两个数字相除
            if(isNull(obj1) || !(obj1 instanceof List) || isNull(obj2))
                return null;
            List list = (List) obj1;
            int  index = Integer.parseInt(obj2.toString());
            return list.get(index);
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 getListValue", e);
            return null;
        }
    }

    public static boolean operCondLoopListRatio(Object obj, Object indxObj, String x, Object obj2) {
        try {
            //两个数字相除
            if(isNull(obj) || !(obj instanceof List) || isNull(indxObj) || isNull(x) || isNull(obj2))
                return false;
            int  index = Integer.parseInt(indxObj.toString());
            for (int i = 0; i < index; i++) {
                if (!operCond(divisionByDecimal(getListValue(obj, i), 1), x, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 operCondLoopListRatio", e);
            return false;
        }
    }

    public static boolean operCondLoopListNumber(Object obj, Object indxObj, String x, Object obj2) {
        try {
            //两个数字相除
            if(isNull(obj) || !(obj instanceof List) || isNull(indxObj) || isNull(x) || isNull(obj2))
                return false;
            int  index = Integer.parseInt(indxObj.toString());
            for (int i = 0; i < index; i++) {
                if (!operCond(getListValue(obj, i), x, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 operCondLoopListNumber", e);
            return false;
        }
    }

    public static boolean isPhone(Object obj){
        try{
            if (isNull(obj)) {
                return false;
            }
            String str = (String)obj;
            String reg="^1([\\d]{10})$";
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(str);
            return m.matches();

        }catch(Exception e){
            LoggerUtil.getLogger().error("isPhone全局方法出现异常", e);
            return false;
        }
    }


    public static String strToBase64(Object obj){
        if(obj == null){
            return "";
        }
        try {
            String currentstr = obj.toString();
            final byte[] data = currentstr.getBytes("UTF-8");
            String base64Str = Base64.getEncoder().encodeToString(data);
            return base64Str;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("strToBase64", e);
            return "";
        }
    }

    public static BigDecimal getBigDecimalByDivideJson(Object jsonArrayObj, Object key, Object key2) {
        BigDecimal result = new BigDecimal(0);
        try {
            if (isNull(jsonArrayObj) || isNull(key) || isNull(key)) {
                return result;
            }

            String jsonStr = jsonArrayObj.toString();
            if (!(jsonStr.contains("{") && jsonStr.contains("}"))) {
                return result;
            }
            jsonStr = jsonStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");
            String daysStr = key.toString();
            Integer days = Integer.parseInt(daysStr);
            String key2Str = key2.toString();
            JSONObject jsonObj =  JSON.parseObject(jsonStr);
            BigDecimal sunReceiveCnt = new BigDecimal(0);
            BigDecimal percentReceiveCnt = new BigDecimal(0);
            if (jsonObj != null && jsonObj.containsKey(daysStr)) {
                Set<String> keySet = jsonObj.keySet();
                for (String day : keySet) {
                    int numDay = Integer.parseInt(day);
                    if (numDay <= days){
                        JSONObject jsonObj2 = jsonObj.getJSONObject(day);
                        if (jsonObj2 != null && jsonObj2.size() > 0){
                            //总分账订单数量
                            String receiveCnt = jsonObj2.getString("receive_cnt");
                            if (notNull(receiveCnt)) {
                                sunReceiveCnt = sunReceiveCnt.add(jsonObj2.getBigDecimal("receive_cnt"));
                            }
                            Set<String> keySet1 = jsonObj2.keySet();
                            for (String str : keySet1) {
                                if (str.contains(key2Str)){
                                    //大于百分比的分账订单数量
                                    String receiveLarge = jsonObj2.getString(str);
                                    if (notNull(receiveLarge)) {
                                        percentReceiveCnt = percentReceiveCnt.add(jsonObj2.getBigDecimal(str));
                                    }
                                }
                            }
                        }
                    }
                }

            }
            if(sunReceiveCnt.compareTo(BigDecimal.ZERO) == 0){
                return result;
            }
            result = percentReceiveCnt.divide(sunReceiveCnt, 3,BigDecimal.ROUND_HALF_UP);

            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getBigDecimalByDivideJson 全局方法出现异常", e);
            return result;
        }
    }

    public static BigDecimal getJsonValueByCardType(Object jsonArrayObj, Object keyObj, Object cardType, Object KeyObj3) {
        BigDecimal result = new BigDecimal(0);
        try {
            if (jsonArrayObj == null || keyObj == null || cardType == null || KeyObj3 == null) {
                return result;
            }
            Map<String, Object> map = new HashMap<String, Object>();

            String jsonArrayStr = jsonArrayObj.toString();
            if (!(jsonArrayStr.contains("{") && jsonArrayStr.contains("}"))) {
                return result;
            }
            String jsonStr = jsonArrayStr.replace("#", ",").replace("\"\"", "\"").replace("\"{", "{").replace("}\"", "}");

            String keyStr = keyObj.toString();
            String cardTypeStr = cardType.toString();
            String cardTypeArr[] = cardTypeStr.split(",");
            String keyStr3 = KeyObj3.toString();
            JSONObject jsonObj = JSON.parseObject(jsonStr);
            if (jsonObj != null && jsonObj.size() > 0){
                JSONObject jsonObject3 = jsonObj.getJSONObject(keyStr);
                if (jsonObject3 != null && jsonObject3.size() > 0) {
                    Set<String> keySet = jsonObject3.keySet();
                    for (String s : keySet) {
                        JSONObject jsonObject1 = jsonObject3.getJSONObject(s);
                        if (jsonObject1 == null) {
                            continue;
                        }
                        map.put(s, jsonObject1.get(keyStr3));
                    }
                }
            }
            for (String ctyp : cardTypeArr) {
                if (map.get(ctyp) != null) {
                    result = result.add(new BigDecimal(map.get(ctyp).toString()));
                }
            }
            return result;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("getJsonValueByCardType 全局方法出现异常", e);
            return result;
        }
    }

    public static String getBizCode(Object prod, Object biz){
        try{
            String productid = (String) prod;
            String production = (String) biz;
            LoggerUtil.getLogger().debug("getBizCode() prod == {}", prod);
            LoggerUtil.getLogger().debug("getBizCode() biz == {}", biz);
            if ("nocardpay".equalsIgnoreCase(productid)){
                productid = "";
            }else {
                productid = "_"+productid;
            }

            LoggerUtil.getLogger().debug("getBizCode() result == {}", prod);
            return production+productid;
        }catch (Exception e){
            LoggerUtil.getLogger().error("全局方法执行错误 getBizCode", e);
        }
        return null;

    }

    public static String toLowerCase(Object obj){
        try {
            if (isNull(obj)) {
                return "";
            }
            String currentstr = obj.toString();
            return currentstr.toLowerCase();
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return "";
        }
    }

    public static boolean isInString(Object a, Object b) {
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("b == {}", b);
            if (a == null || b == null) {
                return false;
            }
  /*  String bs = (String) b;
    String as = (String) a;*/
            String bs = b.toString();
            String as = a.toString();
            String[] arr = null;
            if (bs.contains(",")) {
                arr = bs.split(",");
            } else if (bs.contains(";")) {
                arr = bs.split(";");
            } else {
                arr = bs.split(",");
            }
            if (!"CREDIT".equals(as)&&as.contains("CREDIT")) {
                as = as.substring(0, as.length() - 6);
            }
            if (!"DEBIT".equals(as)&&as.contains("DEBIT")) {
                as = as.substring(5, as.length());
            }
            // String[] arr = bs.split(",").length == 0 ? bs.split(";"):bs.split(",");
            for (String temp: arr) {
                if(as.equals(temp)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }

    // 处理json字符串中value多余的双引号， 将多余的双引号替换为中文双引号
    private static String toJsonString(String s) {
        char[] tempArr = s.toCharArray();
        int tempLength = tempArr.length;
        for (int i = 0; i < tempLength; i++) {
            if (tempArr[i] == ':' && tempArr[i + 1] == '"') {
                for (int j = i + 2; j < tempLength; j++) {
                    if (tempArr[j] == '"') {
                        if (tempArr[j + 1] != ',' && tempArr[j + 1] != '}') {
                            tempArr[j] = '”'; // 将value中的 双引号替换为中文双引号
                        } else if (tempArr[j + 1] == ',' || tempArr[j + 1] == '}') {
                            break;
                        }
                    }
                }
            }
        }
        return new String(tempArr);
    }


    public static void main(String[] args) {
        System.out.println(isEquals("","1", true));

    }
}


