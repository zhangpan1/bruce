package com.zhang.bruce.general.cach;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/10 3:26 下午
 */
public class DDSDs {
    public static void main(String[] args) {
        // String syncopen = "fkjs";
        // System.out.println(getWriteSource(syncopen));
        Long id = 1L;
        JSONObject strMap =  JSONObject.parseObject(String.valueOf(id));
        System.out.println(strMap);
    }

    private static List<String> getWriteSource(String syncopen) {
        // 默认走fkjs
        if (StringUtils.isNotEmpty(syncopen)) {
            List<String> arr = Arrays.asList(syncopen.split(","));
            if (arr.contains("business") || arr.contains("fkjs")){
                return Arrays.asList(syncopen.split(","));
            } else {
                return Arrays.asList("fjks");
            }
        } else {
            return Arrays.asList("fjks");
        }

    }
}
