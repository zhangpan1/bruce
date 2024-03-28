package com.zhang.bruce.rule.parent;

import com.alibaba.fastjson.JSONArray;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/6/1 5:07 下午
 */
public class ReplaceTest {
    public static void main(String[] args) {
        String json = "[{\"settleFlag\":\"unlegalPrivate\"、\"bankCardNo\":\"051016014113200055\"、\"bankCardName\":\"直销银行民生助粒贷还款归集户\"、\"remitAmount\":\"445.52\"}]";
        String var = json.replace("、",",");
        JSONArray jsonArray = JSONArray.parseArray(var);
        System.out.println(jsonArray.size());
    }
}
