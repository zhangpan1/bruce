package com.zhang.bruce.java8.mituan;

import com.alibaba.fastjson.JSON;

import java.util.Calendar;
import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/17 2:37 下午
 */
public class DateAfter {
    public static void main(String[] args) {
        callBackProcessResult();
    }
    public static Date getLimitData() {
        Calendar nowCalendar = Calendar.getInstance();
        nowCalendar.add(Calendar.DATE,-1);
        nowCalendar.set(Calendar.HOUR_OF_DAY,0);
        nowCalendar.set(Calendar.MINUTE,0);
        nowCalendar.set(Calendar.SECOND,0);
        nowCalendar.set(Calendar.MILLISECOND,0);
        Date limitDate = nowCalendar.getTime();
        return limitDate;
    }
    public static void callBackProcessResult() {
        int maxRetryTimes = 3;
        for (int retry = 1; retry <= maxRetryTimes; retry++) {
            try {
                String a= "0000";
                // 成功响应
                if ("0000".equals(a)) {
                    System.out.println("结束处理");
                    // 结束处理
                    return;
                }
            } catch (Exception e) {

            }
        }
        // 发送通知
        System.out.println("发送通知");
        // 发送飞书通知
    }
}
