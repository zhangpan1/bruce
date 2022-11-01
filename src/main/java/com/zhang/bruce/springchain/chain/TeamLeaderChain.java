package com.zhang.bruce.springchain.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:38 上午
 */
public class TeamLeaderChain extends ProcessChain{
    @Override
    public String process() {
        return "项目经历审核通过";
    }
}
