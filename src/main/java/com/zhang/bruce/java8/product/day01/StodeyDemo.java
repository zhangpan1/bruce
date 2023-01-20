package com.zhang.bruce.java8.product.day01;



/**
 * @description: 策略模式
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 8:41 下午
 * 总结常用的六种设计模式：
 * 策略模式
 *
 * 责任链模式
 *
 * 模版方法模式
 *
 * 观察者模式
 *
 * 工厂模式
 *
 * 单例模式
 *
 *
 */
public class StodeyDemo {
    // 业务场景和使用方法


    public void useIf(){
        // 业务类型
        String type = "A";
        if(type=="A"){
            //按照A格式解析

        }else if(type=="B"){
            //按B格式解析
        }else{
            //按照默认格式解析
        }
    }
}
