package com.zhang.bruce.design.factory.simplefactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:00
 * @Describe:
 */
public class ApplePhone implements Phone{
    public ApplePhone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("i make apple phone");
    }
}
