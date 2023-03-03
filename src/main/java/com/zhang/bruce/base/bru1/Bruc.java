package com.zhang.bruce.base.bru1;

import com.zhang.bruce.general.DateUtils;

import java.util.Date;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/2/14 6:05 下午
 */
public class Bruc {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(Integer.parseInt(DateUtils.getDateStringByFormat(DateUtils.getDate(date, -1), "yyyyMM")));
        System.out.println(Integer.parseInt(DateUtils.getDateStringByFormat(DateUtils.getDate(date, -1), "yyyyMMdd")));

    }
}
