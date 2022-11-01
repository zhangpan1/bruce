package com.zhang.bruce.springchain.scbin;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:51 上午
 */
public class UserExistHandler extends AbstractLoginHandler{
    @Override
    public String doHandler(LoginDTO loginDTO) throws Exception {

        String username = loginDTO.getUsername();
        //验证逻辑：如果用户不存在
        if(!"test_user".equals(username)){
            return "用户不存在";
        }
        // 判断是否还有下个责任链节点，没有的话，说明已经是最后一个节点
        if (next != null){
            return next.doHandler(loginDTO);
        }
        return "验证均已通过，登录成功";

    }
}
