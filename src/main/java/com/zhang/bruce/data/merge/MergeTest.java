package com.zhang.bruce.data.merge;

import com.google.common.collect.Lists;
import com.yeepay.g3.utils.common.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/12 8:46 下午
 */
public class MergeTest {
    public static void main(String[] args) {
        String s1 = "商户基本信息异常:工商状态已注销/s销,商户基本信息异常:工商状态已注销/已吊销,存在司法协查,支付场景异常:支付场景入口为风险网站";
        String s2 = "商户基本信息异常:工商状态已注销/s销";

        String newSuspicous = process(s1, s2);
        System.out.println(newSuspicous);
    }
    public static String process(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        List<String> str = Lists.newArrayList();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && StringUtils.isNotBlank(strArr[i].trim())) {
                List<String> s = Arrays.asList(strArr[i].split(";"));
                if (CollectionUtils.isNotEmpty(s)) {
                    s.stream().forEach(test->{
                        List<String> b = Arrays.asList(test.split(","));
                        if (CollectionUtils.isNotEmpty(b)) {
                            b.stream().forEach(test1 -> {
                                str.add(test1);
                            });
                        }
                    });
                }
            }
        }
        if (CollectionUtils.isEmpty(str)) {
            return null;
        }
        return Arrays.stream(String.join(",", str).split(",")).distinct().sorted().collect(Collectors.joining(","));
    }
}
