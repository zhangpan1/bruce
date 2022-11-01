package com.zhang.bruce.springchain.hui;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 4:01 下午
 */
public interface PrepareProcess {
    Integer getShort();

    void doProcess(List<PayBean> payBeanList, MyProcessChain filterChain, Integer index);
}
