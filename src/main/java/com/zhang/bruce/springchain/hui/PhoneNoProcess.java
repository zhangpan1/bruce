package com.zhang.bruce.springchain.hui;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 4:06 下午
 */
public class PhoneNoProcess implements PrepareProcess{
    @Override
    public Integer getShort() {
        return null;
    }

    @Override
    public void doProcess(List<PayBean> payBeanList, MyProcessChain filterChain, Integer index) {

    }
}
