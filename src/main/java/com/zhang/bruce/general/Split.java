package com.zhang.bruce.general;

import com.yeepay.g3.utils.common.DateUtils;

import java.util.Calendar;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/2 17:07
 * @Description:
 */
public class Split {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("startTime" + com.yeepay.g3.utils.common.DateUtils.toString(calendar.getTime(), com.yeepay.g3.utils.common.DateUtils.DATE_FORMAT_DATEONLY));
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        System.out.println("endTime"+ com.yeepay.g3.utils.common.DateUtils.toString(calendar.getTime(), DateUtils.DATE_FORMAT_DATEONLY));

    }
}
