package com.zhang.bruce.java8.day02.chap4;

import com.beust.jcommander.internal.Lists;
import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/8/4 3:58 下午
 */
public class StringTest {
    public static void main(String[] args) {
        List<String> fileName = Lists.newArrayList();
        fileName.add("test.txt");
        fileName.add("ni.txt");
        String str = StringUtils.join(fileName, ";");
        System.out.println(str);
    }
}
