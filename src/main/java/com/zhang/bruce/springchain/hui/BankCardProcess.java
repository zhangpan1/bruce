package com.zhang.bruce.springchain.hui;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 4:05 下午
 */
@Service
public class BankCardProcess implements PrepareProcess{
    @Override
    public Integer getShort() {
        return null;
    }

    @Override
    public void doProcess(List<PayBean> payBeanList, MyProcessChain filterChain, Integer index) {
        // 将银行卡号加灰
        System.out.println("加灰银行卡");
    }
}
