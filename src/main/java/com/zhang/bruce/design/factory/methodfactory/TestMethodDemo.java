package com.zhang.bruce.design.factory.methodfactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:07
 * @Describe:
 */
public class TestMethodDemo {
    public static void main(String[] args) {
        AbstructFactory apple = new AppleFactory();
        AbstructFactory xiaomi = new XimiFactory();
        apple.makePhone();
        xiaomi.makePhone();
    }
}
