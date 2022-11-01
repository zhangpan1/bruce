package com.zhang.bruce.springchain.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:42 上午
 */
public class ProcessController {
    @Autowired
    private OaFactory oaFactory;

    @GetMapping("/process")
    public void process(){
        oaFactory.doProcess(LeaderEnum.TEAM_LEADER);
    }
}
