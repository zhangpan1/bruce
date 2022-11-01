package com.zhang.bruce.springchain.Bula;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:22 下午
 */
@Service("Filter3")
public class Filter3 implements PrepareFilter{
    public static final BigDecimal start = new BigDecimal("1000");

    @Override
    public Integer getShort() {
        return 3;
    }

    @Override
    public void doFilter(Myparam param, MyFilterChain filterChain, Integer index) {
        System.out.println("Filter3");
        if (param.getAmount().compareTo(start) > -1) {
            System.out.println("扫脸");
            return;
        }
        filterChain.doFilter(param, filterChain, index);
    }
}
