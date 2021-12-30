package com.zhang.bruce.general;

import com.zhang.bruce.general.test.SequenceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 使用redis生成自增序列
 */
@RestController
public class TestController {

    @Autowired
    private SequenceFactory sequenceFactory;

    /**
     * 自增序列号
     *

     * @return
     */
    @RequestMapping("/SeqGenerator")
    public String SeqGenerator() {
        String orderId = IdGenerator.getNextId(IdEnum.SHENGYUOMS_ORDERID);
        System.out.println(orderId);
        return orderId;
    }
}


