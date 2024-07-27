package com.zhang.bruce.data.season1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/10 3:33 下午
 */
public class DateTestStart {
    public  static  SimpleDateFormat lastymdsdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static  String[] scopeTypeArray = {"止收", "止付止结算", "止付可结算", "止收+止付止结算", "止收+止付可结算","自定义关闭"};

    public static void main(String[] args) throws Exception {
//        System.out.println("开始时间为"+getLastOneHourStart("2024-04-09 14:32:33"));
//        System.out.println("开始时间为"+getLastOneHourEnd(""));

        List<String> scopeTypeList = Arrays.asList(scopeTypeArray);
        System.out.println(scopeTypeList.contains("自定义关闭、止付可结算"));

    }

}
