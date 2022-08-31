package com.zhang.bruce.java8.product.day02;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Component;

import javax.xml.ws.Response;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:25 下午
 */
@Component
 //顺序排第1，最先校验
public class CheckParamFilterObject extends AbstractHandler {

    @Override
    public void doFilter(Request request, Response response) {
        System.out.println("非空参数检查");
    }
}

