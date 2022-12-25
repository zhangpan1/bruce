package com.zhang.bruce.general;

import com.zhang.bruce.general.DateUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/25 17:44
 * @Description:
 */
public class TestNi {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //起始时间
        Calendar currentDateStart = new GregorianCalendar();

        currentDateStart.set(Calendar.HOUR_OF_DAY, 0);
        currentDateStart.set(Calendar.MINUTE, 0);
        currentDateStart.set(Calendar.SECOND, 0);
        System.out.println("startTime" + format.format(currentDateStart.getTime()));
        //结束时间
        Calendar currentDateEnd = new GregorianCalendar();
        currentDateEnd.set(Calendar.HOUR_OF_DAY, 23);
        currentDateEnd.set(Calendar.MINUTE, 59);
        currentDateEnd.set(Calendar.SECOND, 59);

        System.out.println("end" + format.format(currentDateEnd.getTime()));
        Date now = new Date();

        String s1 = DateUtils.formateyyyyMMddHHmmss(com.yeepay.g3.utils.common.DateUtils.getDayStart(now));
        String s2 = DateUtils.formateyyyyMMddHHmmss(com.yeepay.g3.utils.common.DateUtils.getDayEnd(now));

        System.out.println(s1 + "-----" + s2);
    }
}
