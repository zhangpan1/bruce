package com.zhang.bruce.java8.product.day02;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 9:25 下午
 */

import org.omg.CORBA.Request;
import org.springframework.stereotype.Component;

import javax.xml.ws.Response;

/**
 *  安全校验对象
 */
@Component
public class CheckSecurityFilterObject extends AbstractHandler {

    @Override
    public void doFilter(Request request, Response response) {
        //invoke Security check
        System.out.println("安全调用校验");
    }

}
