package com.zhang.bruce.springchain.chain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:41 上午
 */
public class OaFactory {
    @Autowired
    private List<ProcessChain> processChains;

    public void doProcess(LeaderEnum leaderEnum){
        processChains.get(leaderEnum.getCode()).doProcess();
    }
}
