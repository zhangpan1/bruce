package com.zhang.bruce.springchain.Bula;

import java.math.BigDecimal;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:21 下午
 */
public class Filter2 implements PrepareFilter{
    public static final BigDecimal start = new BigDecimal("400");

    public static final BigDecimal end = new BigDecimal("1000");


    @Override
    public Integer getShort() {
        return 2;
    }

    @Override
    public void doFilter(Myparam param, MyFilterChain filterChain, Integer index) {
        System.out.println("Filter2");
        if (param.getAmount().compareTo(start) > -1 && param.getAmount().compareTo(end) < 0) {
            System.out.println("请发生短信验证码");
            return;
        }
        filterChain.doFilter(param, filterChain, index);
    }

}
