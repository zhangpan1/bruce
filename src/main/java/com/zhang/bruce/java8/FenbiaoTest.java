package com.zhang.bruce.java8;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/11/29 11:58 上午
 */
public class FenbiaoTest {
    public static void main(String[] args) {
         // System.out.println(getIndex(2024,12,29));
        // System.out.println(Math.min(10 / 10, 2));
        int dayOfMonth = 19;
        int value = Math.min(dayOfMonth / 10, 2);
        System.out.println(value);

    }
    protected static int getIndex(int yearValue, int monthValue, int dayOfMonth) {
        int index;
        index = ((Math.abs((yearValue - 2021)) % 2)) * 36 + (monthValue - 1) * 3 + Math.min(dayOfMonth / 10, 2);
        return index;
    }
}
