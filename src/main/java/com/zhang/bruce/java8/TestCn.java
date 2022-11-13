package com.zhang.bruce.java8;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/11 3:42 下午
 */
public class TestCn {
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        Map<String,String> menu = Maps.newHashMap();
        menu.put("lable","GPT名单管理|国家名单");
        menu.put("value","1");

        Map<String,String> menu2 = Maps.newHashMap();
        menu2.put("lable","交易参数管理");
        menu2.put("value","2");
        List<Map<String,String>> m1=Lists.newArrayList();
        m1.add(menu);
        m1.add(menu2);
        menu1.setMenu(m1);


        Map<String,Map<String,String>> m2= Maps.newHashMap();
        m2.put("lable",menu2);






        Map<String, List<GPTSysConfig>> result = new HashMap<>();
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
        List<GPTSysConfig> gptSysConfigs1 = Lists.newArrayList();
        gptSysConfigs1.add(gptSysConfig);
        result.put("1",gptSysConfigs1);
        GPTSysConfig gpt2 = JSON.parseObject(" {\n" +
                "      \"id\": null,\n" +
                "      \"sysType\": 100,\n" +
                "      \"typeName\": null,\n" +
                "      \"sysTypeName\": \"LN核查单状态\",\n" +
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
        GPTSysConfig gpt3 = JSON.parseObject(" {\n" +
                "      \"id\": null,\n" +
                "      \"sysType\": 101,\n" +
                "      \"typeName\": null,\n" +
                "      \"sysTypeName\": \"LN处置结果\",\n" +
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
        GPTSysConfig gpt1 = JSON.parseObject(" {\n" +
                "      \"id\": null,\n" +
                "      \"sysType\": 102,\n" +
                "      \"typeName\": null,\n" +
                "      \"sysTypeName\": \"是否上报\",\n" +
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
        List<GPTSysConfig> gptSysConfigs2 = Lists.newArrayList();
        gptSysConfigs2.add(gpt1);
        gptSysConfigs2.add(gpt2);
        gptSysConfigs2.add(gpt3);
        result.put("2",gptSysConfigs2);
        menu1.setCategory(result);
        System.out.println(JSON.toJSONString(menu1));
    }
}
