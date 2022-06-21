package com.zhang.bruce.xmlReport;

import com.google.common.collect.Lists;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/4/25 2:42 下午
 */
public class Test {
    public static void main(String[] args) throws Exception {
        List<Long> packetFIS = Lists.newArrayList();
        List<Long> test = new ArrayList<>();
        test.add(1L);
        test.add(2L);
        test.add(3L);
        for (Long reportId : test) {
            if (reportId != 2) {
                throw new Exception();
            }
            packetFIS.add(reportId);
        }
        System.out.println("开始打包");
        System.out.println(packetFIS);
    }
}
