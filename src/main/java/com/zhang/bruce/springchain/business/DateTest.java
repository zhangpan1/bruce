package com.zhang.bruce.springchain.business;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/24 11:58 上午
 */
public class DateTest {

    public static void main(String[] args) {
        long expTm = Long.valueOf("1667989911000").longValue();
       if ((expTm >= System.currentTimeMillis())) {
           System.out.println("你好");
       } else {
           System.out.println("我不好");
       }
    }
}
