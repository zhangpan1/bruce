package com.zhang.bruce.design.factory.simplefactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 9:57
 */
public class Miphone implements Phone{
    public Miphone(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("i make xiaomi phone");
    }
}
