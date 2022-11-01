package com.zhang.bruce.springchain.Bula;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:17 下午
 */
public interface PrepareFilter {
    Integer getShort();

    void doFilter(Myparam myparam,MyFilterChain filterChain, Integer index);
}
