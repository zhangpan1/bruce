package com.zhang.bruce.algorithm.linked.december.algorithm.linked;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/22 17:54
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Date d1 = new Date();
        String totay = new SimpleDateFormat("yyyy-MM-dd").format(d1);
        System.out.println(totay);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        String yesToday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
        System.out.println(yesToday);
    }
}
