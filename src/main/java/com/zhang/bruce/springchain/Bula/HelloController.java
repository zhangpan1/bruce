package com.zhang.bruce.springchain.Bula;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:23 下午
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    MyFilterChain myFilterChain;

    @GetMapping("/hello")
    public String hello(Myparam param) {
        myFilterChain.doFilter(param,myFilterChain,0);
        log.info("1111111111111");
        return "hello word update!";
    }
}
