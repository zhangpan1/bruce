package com.zhang.bruce.base.bru1;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.tcredit.streaming.core.utils.LoggerUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/2/14 6:05 下午
 */
public class Bruc {
    public static void main(String[] args) {
       Map<String, List<Map<String,String>>> map = Maps.newHashMap();

//        List arr = Lists.newArrayList();
//        Map<String,String> tempMap = Maps.newHashMap();
//        tempMap .put("field_1", "测试1");
//        tempMap .put("field_2", "测试二");
//        arr.add(tempMap);
//        map.put("object_list_2",arr);
//        System.out.println(JSON.toJSONString(map));
        String json = "{\"b2b非同名充值\":\"2024-06-30 04:09:05\",\"企业网银支付\":\"2020-08-10 08:14:58\",\"b2c非同名充值\":\"2024-06-30 04:09:05\",\"个人网银支付\":\"2024-06-13 04:09:21\",\"快捷支付\":\"2018-07-06 19:08:50\"}";
        int x = 1;
        String b = "b2b非同名充值";
        System.out.println(withKeySetInTime(json,x,b));
    }

    public static boolean withKeySetInTime(Object json, Object x, Object p) {
        try {
            if (json == null || x == null || p == null) {
                return false;
            }
            int diffTarget = Integer.parseInt(x.toString());
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Calendar calendarNow = Calendar.getInstance();
            calendarNow.set(Calendar.HOUR_OF_DAY,0);
            calendarNow.set(Calendar.MINUTE,0);
            calendarNow.set(Calendar.SECOND,0);
            calendarNow.set(Calendar.MILLISECOND,0);
            long nowDay = calendarNow.getTimeInMillis();

            JSONObject jsonObj = JSON.parseObject(json.toString());
            String[] arr = p.toString().split(",");
            try {
                for (String s : arr) {
                    Object obj = jsonObj.get(s);
                    if (obj != null){
                        Date oneDay = sf.parse(obj.toString());
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(oneDay);
                        calendar.set(Calendar.HOUR_OF_DAY,0);
                        calendar.set(Calendar.MINUTE,0);
                        calendar.set(Calendar.SECOND,0);
                        calendar.set(Calendar.MILLISECOND,0);
                        long oneDayLong = calendar.getTimeInMillis();
                        long days = (nowDay-oneDayLong)/(1000* 60 * 60 * 24);
                        if (days <= diffTarget){
                            return true;
                        }
                    }
                }
            }catch (ParseException e){
                LoggerUtil.getLogger().error("全局方法出现异常  withKeySetInTime", e);
                return false;
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  withKeySetInTime", e);
            return false;
        }
    }
}
