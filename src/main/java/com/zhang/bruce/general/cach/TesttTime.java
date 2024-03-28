package com.zhang.bruce.general.cach;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/11/13 11:51
 * @Description:
 */
public class TesttTime {
    public static void main(String[] args) {
        int i = 2132424;
        int j = 3000000;
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float)i/(float)j*100);
        BigDecimal bigDecimal = new BigDecimal(result);
        BigDecimal decimal70 = new BigDecimal(70);
        BigDecimal decimal80 = new BigDecimal(80);
        BigDecimal decimal90 = new BigDecimal(90);
        BigDecimal decimal100 = new BigDecimal(100);
        System.out.println(result);
        System.out.println(bigDecimal.compareTo(decimal70));
        System.out.println(bigDecimal.compareTo(decimal80));
    }
}

