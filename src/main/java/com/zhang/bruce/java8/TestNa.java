package com.zhang.bruce.java8;

import com.aerospike.client.admin.User;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.zhang.bruce.java8.mituan.UnionSearch;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/11 10:50 上午
 */
public class TestNa {
    public static void main(String[] args) {
        GPTSysConfig gptSysConfig = JSON.parseObject("{\n" +
                "      \"id\": null,\n" +
                "      \"sysType\": 155,\n" +
                "      \"typeName\": null,\n" +
                "      \"sysTypeName\": \"风险等级\",\n" +
                "      \"sysCode\": null,\n" +
                "      \"sysName\": null,\n" +
                "      \"sysMenu\": null,\n" +
                "      \"sysScope\": null,\n" +
                "      \"indexNo\": null,\n" +
                "      \"sysStatus\": null,\n" +
                "      \"remark\": null,\n" +
                "      \"creator\": null,\n" +
                "      \"modifier\": null,\n" +
                "      \"gmtCreate\": null,\n" +
                "      \"gmtModified\": null\n" +
                "    }",GPTSysConfig.class);

    }
}
