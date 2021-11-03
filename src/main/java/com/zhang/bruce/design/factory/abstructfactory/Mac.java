package com.zhang.bruce.design.factory.abstructfactory;

/**
 * @Author: Bruce
 * @Date: 2021/11/3 10:13
 * @Describe:
 */
public class Mac implements PC{
    public Mac(){
        this.make();
    }
    @Override
    public void make() {
        System.out.println("制造苹果电脑");
    }
}
