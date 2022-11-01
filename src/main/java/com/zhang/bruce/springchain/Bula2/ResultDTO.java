package com.zhang.bruce.springchain.Bula2;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:37 下午
 */
public class ResultDTO {
    private String msg;

    public static ResultDTO ok(){
        return new ResultDTO();
    }

    public ResultDTO() {
        msg = "ok";
    }

    public String getMsg() {
        return msg;
    }
}
