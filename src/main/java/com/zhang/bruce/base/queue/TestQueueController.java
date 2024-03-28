package com.zhang.bruce.base.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/7/3 11:49 上午
 */
@Controller
@RequestMapping("/zp")
public class TestQueueController {
    // 这里注入队列服务
    @Autowired
    private QueueGenerationService queueGenerationService;

    @ResponseBody
    @RequestMapping("/startQueue")
    public void addData(){
        for (int i = 0 ; i < 50 ; i ++) {
            String name = "小明"+i;
            // 在方法中调用与传参的方式
            queueGenerationService.addData(new TestServiceHandler(name,"fsfs"));
        }
    }
}
