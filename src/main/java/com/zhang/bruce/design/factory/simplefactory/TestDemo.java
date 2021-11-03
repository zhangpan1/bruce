package com.zhang.bruce.design.factory.simplefactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:03
 * @Describe:
 */
public class TestDemo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.makePhone("MiPhone");
        phoneFactory.makePhone("iPhone");
    }
}
