package com.zhang.bruce.rule;

import com.yeepay.g3.utils.common.DateUtils;

import java.util.Date;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/21 14:57
 * @Description:
 */
public class TestFunction {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(DateUtils.getDayStart(DateUtils.getDayStart(now)));
        System.out.println(DateUtils.getDayEnd(DateUtils.getDayStart(now)));
    }
}
