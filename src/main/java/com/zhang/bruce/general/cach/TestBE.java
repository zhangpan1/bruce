package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSON;
import com.tcredit.streaming.core.bean.ConvenientHashMap;
import com.tcredit.streaming.core.bean.TimeExpireMode;
import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.*;
import com.tcredit.streaming.core.enums.Enums;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.math.BigDecimal;
import java.util.TreeMap;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/12 22:08
 * @Description:
 */
public class TestBE {
    public static void main(String[] args) {
        String treeMap = " \"1668301952000\":Object{...},\n" +
                "                \"1668309152000\":{\n" +
                "                    \"map\":Object{...},\n" +
                "                    \"merged\":true\n" +
                "                }";
        TreeMap treeMap1 = (TreeMap) JSON.parse(treeMap);

        TimeExpireMode timeExpireMode = new TimeExpireMode();
        timeExpireMode.setP(true);
        timeExpireMode.setTimes(73);
        timeExpireMode.setTimeExpireModeEnum(Enums.TimeExpireModeEnum.h);


        String obj = "{\"itemList\":{1668301952000:{\"map\":{\"OFFLINE\":{\"count\":1,\"merged\":false,\"value\":1999}},\"merged\":false},1668309152000:{\"map\":{\"OFFNEW\":{\"count\":2,\"merged\":true,\"value\":6000.0}},\"merged\":true}},\"merged\":false,\"timeExpire\":{\"millis\":259200000,\"p\":true,\"timeExpireModeEnum\":\"小时\",\"times\":72,\"validMillis\":259200000},\"timeExpireModeValidMillis\":259200000,\"validTime\":1676803285416}";
        String transtime = "1668320690";
        String duration = "24ph";

        String p = "OFFLINE";
        String x = "number";


        System.out.println(getMergeMapByKey(obj,transtime,duration,p,x));
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


    static long getCacheValueByBiz(Object obj, Object obj2,Object transtime, String duration,Object biz) {
        try {
            LoggerUtil.getLogger().debug("obj == {}", obj);
            LoggerUtil.getLogger().debug("obj2 == {}", obj2);
            LoggerUtil.getLogger().debug("transtime == {}", transtime);
            LoggerUtil.getLogger().debug("duration == {}", duration);
            LoggerUtil.getLogger().debug("biz == {}", biz);
            /**
             * 获取SumNumber等类型的cache中的值
             */
            TimedItems tt = null;
            if("EPOS".equals(biz.toString())){
                if(obj == null ||!(obj instanceof TimedItems)){
                    return 0;
                }
                tt = (TimedItems) obj;
            }
            else {
                if(obj2 == null ||!(obj2 instanceof TimedItems)){
                    return 0;
                }
                tt = (TimedItems) obj2;
            }
            Object o = null;
            if (transtime == null || duration == null) {
                o = tt.getRaw();
            } else {
                o = tt.getRaw(transtime, duration);
            }
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
            if (o instanceof AvgNumber) {
                return ((AvgNumber) o).longValue();
            }
            if (o instanceof VarsNumber) {
                return ((VarsNumber) o).longValue();
            }
            return 0L;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return 0;
        }
    }
}
