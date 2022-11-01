package com.zhang.bruce.springchain.fil;

import org.springframework.stereotype.Component;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:24 上午
 */
@Component
public class DurationFIlter implements Filter{
    @Override
    public boolean filter(Task task) {
        System.out.println("时效性检验");
        return true;
    }
}
