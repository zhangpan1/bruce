package com.zhang.bruce.springchain.Bula2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:43 下午
 */
@Controller
@RequestMapping("/lsz")
public class OrderTestController {

    @Autowired
    private OrderChainHandler orderChainHandler;


    @ResponseBody
    @RequestMapping("testOrder")
    public Object testOrder(String orderNo){
        return orderChainHandler.executionChain(new OrderDTO()).getMsg();
    }
}
