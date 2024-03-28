package com.zhang.bruce.risktest.business;

import org.apache.commons.compress.utils.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/6 6:51 下午
 */
public class AutoJobTest {
    public static void main(String[] args) {
        List<RiskUser> riskUsers = Lists.newArrayList();
        RiskUser vo1 = new RiskUser();
        vo1.setAge("18");
        vo1.setName("张三");
        vo1.setSex("男");
        RiskUser vo2 = new RiskUser();
        vo2.setAge("19");
        vo2.setName("李大嘴");
        vo2.setSex("男");
        RiskUser vo3 = new RiskUser();
        vo3.setAge(null);
        vo3.setName("李大嘴");
        vo3.setSex("男");
        riskUsers.add(vo1);
        riskUsers.add(vo2);
        riskUsers.add(vo3);

        List<RiskUser> topFiveItems = riskUsers.stream()
                .sorted(Comparator.comparing(RiskUser::getAge).reversed())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(topFiveItems.size());

    }
}
