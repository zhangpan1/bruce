package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.bean.TimedItems;
import com.tcredit.streaming.core.bean.method.*;
import com.tcredit.streaming.core.utils.LoggerUtil;

import static com.zhang.bruce.general.cach.TestEngine.getMergeMapByKey;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/12 22:08
 * @Description:
 */
public class TestBE {
    public static void main(String[] args) {
        String obj = "{\"itemList\":{1668301952000:{\"map\":{\"OFFLINE\":{\"count\":1,\"merged\":false,\"value\":1999}},\"merged\":false},1668309152000:{\"map\":{\"OFFNEW\":{\"count\":2,\"merged\":true,\"value\":6000.0}},\"merged\":true}},\"merged\":false,\"raw\":{\"map\":{\"OFFNEW\":{\"count\":2,\"merged\":true,\"value\":6000.0},\"OFFLINE\":{\"count\":1,\"merged\":false,\"value\":1999.0}},\"merged\":true},\"timeExpire\":{\"millis\":259200000,\"p\":true,\"timeExpireModeEnum\":\"小时\",\"times\":72,\"validMillis\":259200000},\"timeExpireModeValidMillis\":259200000,\"validTime\":1668572132437}";
        String transtime = "1668320690";
        String duration = "24ph";
        String p = "OFFLINE";
        String x = "number";


        System.out.println(getMergeMapByKey(obj,transtime,duration,p,x));
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
