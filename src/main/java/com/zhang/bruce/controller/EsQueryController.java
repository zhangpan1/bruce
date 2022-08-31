package com.zhang.bruce.controller;

import com.zhang.bruce.service.EsQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/31 3:20 下午
 */
@RestController
@CrossOrigin
public class EsQueryController {

    @Autowired
    private EsQueryService esQueryService;


    // 测试查询
    @GetMapping("/test")
    @ResponseBody
    public String testIndex() throws Exception {
        return esQueryService.queryWithId();
    }
}
