package com.zhang.bruce.design.factory.abstructfactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:12
 * @Describe:
 */
public class MiPc implements PC{
    public MiPc(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制造小米电脑");
    }
}
