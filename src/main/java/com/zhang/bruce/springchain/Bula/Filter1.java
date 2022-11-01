package com.zhang.bruce.springchain.Bula;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:20 下午
 */
@Service("Filter1")
public class Filter1 implements PrepareFilter{
    /**
     * 这些都可以进行数据库配置
     */
    public static final BigDecimal start = new BigDecimal("200");
    /**
     * 这些都可以进行数据库配置
     */
    public static final BigDecimal end = new BigDecimal("400");
    /**
     * 这些都可以进行数据库配置
     */
    @Override
    public Integer getShort() {
        return 1;
    }

    @Override
    public void doFilter(Myparam param, MyFilterChain filterChain, Integer index) {
        System.out.println("Filter1");
        if (param.getAmount().compareTo(start) > -1 && param.getAmount().compareTo(end) < 0) {
            System.out.println("请输入支付密码");
            return;
        }
        filterChain.doFilter(param, filterChain, index);
    }

}
