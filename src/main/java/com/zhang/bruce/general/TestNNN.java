package com.zhang.bruce.general;

import java.math.BigDecimal;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/22 20:24
 * @Description:
 */
public class TestNNN {
    public static void main(String[] args) {
        BigDecimal s = new BigDecimal("82.32");
        System.out.println(compareNumber(s));
    }
    public static String compareNumber(BigDecimal number){
        if (!"".equals(number) && number != null){
            if (new BigDecimal(number.intValue()).compareTo(number)==0){
                //整数
                return String.valueOf(number.intValue());
            }else {
                //小数
                return String.valueOf(round(number.toString(), 2));
            }
        }
        return "";
    }
    public static double round(String value, int scale) {
        return new BigDecimal(value).setScale(scale, BigDecimal.ROUND_DOWN).doubleValue();
    }
}
