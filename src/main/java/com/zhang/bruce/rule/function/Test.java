package com.zhang.bruce.rule.function;

import java.util.Calendar;
import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/24 7:18 下午
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(getEndData());
    }
    private static Date getEndData(){
        Calendar nowCalendar = Calendar.getInstance();
        nowCalendar.add(Calendar.DATE,-1);
        nowCalendar.set(Calendar.HOUR_OF_DAY,0);
        nowCalendar.set(Calendar.MINUTE,0);
        nowCalendar.set(Calendar.SECOND,0);
        nowCalendar.set(Calendar.MILLISECOND,0);
        Date limitDate = nowCalendar.getTime();
        return limitDate;
    }
}
