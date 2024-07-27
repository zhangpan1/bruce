package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.zhang.bruce.general.cach.TestDsPayOrder.getValueByIpcountry;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/12 16:56
 * @Description:
 */
public class CachTest {
    public static void main(String[] args) {
        System.out.println(getCurOrgTimesTamp()-1000L);
        Date date = new Date(getCurOrgTimesTamp()-1000L);
        System.out.println(getValueByIpcountry("中国",21000L));


    }
    public static Integer getCacheCollectCount(Object obj, Object transtime, String duration) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            /**
             *获取DistinctedListObject等类型cache中保存的set和list对象
             */
            Set set = new HashSet();
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
            if (o instanceof DistinctedListObject) {
                return ((DistinctedListObject) o).getSet().size();
            }
            if (o instanceof MergeableListObject) {
                return ((MergeableListObject) o).getList().size();
            }
            if (o instanceof MergeableSortedList) {
                return ((MergeableSortedList) o).getList().size();
            }
            return set.size();
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法getCacheCollectCount出现异常", e);
            return 0;
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
                            if (sum instanceof SumNumber) {
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
    public static long getCurOrgTimesTamp (){
        try {
            Date date = new Date();
            long time = date.getTime();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String eight = format.format(date)+" 08:00:00";
            long eightLong = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(eight).getTime();
            long result = 0L;
            if (time >= eightLong){
                //当天早晨8点后
                result = time-time%86400000L-28800000L;
            }else {
                //当天早晨8点前
                result = time-(time%86400000L)+86400000L-28800000L;
            }
            LoggerUtil.getLogger().debug("getCurOrgTimesTampResult == {}", result);
            return result;
        }catch (Exception e) {
            LoggerUtil.getLogger().error("getCurOrgTimesTamp全局方法出现异常:{}", e);
            return 0L;
        }
    }
}
