package com.zhang.bruce.springchain.scbin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:54 上午
 */
@RestController
@RequestMapping("/responsibility")
public class ResponsibilityController {
    /**
     * 登录测试
     */
    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO) throws Exception {
        AbstractLoginHandler.Builder<Object> builder = new AbstractLoginHandler.Builder<>();
        String result = builder.addHandler(new UserExistHandler())
                .addHandler(new UserStatusHandler())
                .addHandler(new UserPasswordHanler())
                .build().doHandler(loginDTO);
        return "登录结果："+result;
    }
}
