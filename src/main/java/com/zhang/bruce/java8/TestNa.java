package com.zhang.bruce.java8;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/11 10:50 上午
 */
public class TestNa {
    public static void main(String[] args) {
        List<String> products = Lists.newArrayList();
        products.add("FE");
        products.add("RECHARGE");
        products.add("NOCARDPAY");
        products.add("ACCOUNT");
        products.add("G3MEMBER_PAYMENT");
        products.add("G3MEMBER_TRANSFER");
        products.add("TRANSFER");

        for (int i = 0 ;i < 20 ;i ++) {
            Random r = new Random();
            int data = r.nextInt(7);
            System.out.println(products.get(data));
            System.out.println(data);
        }
    }
}
