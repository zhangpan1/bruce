package com.zhang.bruce.easyexcel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/12/11 6:46 下午
 */
public class DateUtilsTest {
    public static void main(String[] args) throws ParseException {
        // String registDifference = differenceRegist("2021-05-20","2016-05-04");
        // System.out.println(registDifference);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,-1);
        System.out.println(cal.getTime());

    }
    public static String differenceRegist(String createDate, String foundedDate) {
        try {
            LocalDate date1 = LocalDate.parse(createDate);
            LocalDate date2 = LocalDate.parse(foundedDate);

            // 计算日期差
            long daysBetween = ChronoUnit.DAYS.between(date1, date2);
            // 输出相差的天数，由于结果是long类型，需要转换为String
            return String.valueOf(daysBetween);
        } catch (Exception e) {
        }
        return null;
    }
}
