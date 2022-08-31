package com.zhang.bruce.java8.product.day02;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Component;

import javax.xml.ws.Response;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:27 下午
 */
@Component
//校验顺序排第4
public class CheckRuleFilterObject extends AbstractHandler {

    @Override
    public void doFilter(Request request, Response response) {
        //check rule
        System.out.println("check rule");
    }
}
