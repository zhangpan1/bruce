package com.zhang.bruce.java8.product.day02;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Component;

import javax.xml.ws.Response;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:26 下午
 */

@Component
public class CheckBlackFilterObject extends AbstractHandler {

    @Override
    public void doFilter(Request request, Response response) {
        //invoke black list check
        System.out.println("校验黑名单");
    }

}
