package com.zhang.bruce.springchain.fil;

import org.springframework.stereotype.Component;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:27 上午
 */
@Component
public class TimesFilter implements Filter {
    @Override
    public boolean filter(Task task) {
        System.out.println("次数限制检验");
        return true;
    }
}
