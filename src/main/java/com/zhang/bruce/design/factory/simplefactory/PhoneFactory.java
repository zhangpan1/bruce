package com.zhang.bruce.design.factory.simplefactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:01
 * @Describe: 简单工厂模式
 */
public class PhoneFactory {
    public Phone makePhone(String phoneType){
        if(phoneType.equalsIgnoreCase("MiPhone")){
            return new Miphone();
        }
        else if(phoneType.equalsIgnoreCase("iPhone")) {
            return new ApplePhone();
        }
        return null;
    }
}
