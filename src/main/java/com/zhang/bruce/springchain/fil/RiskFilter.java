package com.zhang.bruce.springchain.fil;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:26 上午
 */
public class RiskFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        System.out.println("风控拦截");
        return true;
    }
}
