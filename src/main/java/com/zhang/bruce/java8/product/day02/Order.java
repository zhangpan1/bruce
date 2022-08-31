package com.zhang.bruce.java8.product.day02;

/**
 * @description: 责任链模式使用
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:18 下午
 * 我们来看一个常见的业务场景，
 * 下订单。
 * 下订单接口，
 * 基本的逻辑，
 * 一般有参数非空校验、
 * 安全校验、
 * 黑名单校验、
 * 规则拦截等等。
 * 很多伙伴会使用异常来实现：
 */
public class Order {
    // 这段代码使用了异常来做逻辑条件判断，
    // 如果后续逻辑越来越复杂的话，
    // 会出现一些问题：如异常只能返回异常信息，
    // 不能返回更多的字段，这时候需要自定义异常类。

    public void checkNullParam(Object param){
        //参数非空校验
        throw new RuntimeException();
    }
    public void checkSecurity(){
        //安全校验
        throw new RuntimeException();
    }
    public void checkBackList(){
        //黑名单校验
        throw new RuntimeException();
    }
    public void checkRule(){
        //规则拦截
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Order order= new Order();
        try{
            order.checkNullParam("");
            order.checkSecurity ();
            order.checkBackList();
            order.checkRule();
            System.out.println("order success");
        }catch (RuntimeException e){
            System.out.println("order fail");
        }
    }
    // 阿里【强制】 异常不要用来做流程控制，
    // 条件控制。
    // 说明：异常设计的初衷是解决程序运行中的各种意外情况，且异常的处理效率比条件判断方式要低很多。

}
