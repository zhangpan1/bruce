package com.zhang.bruce.springchain.business;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static cn.hutool.extra.pinyin.PinyinUtil.isChinese;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/26 10:06 上午
 */
public class LuanMa {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j < 100; j++) {
                int a = i * j + 10000;
                set.add(a);
            }
        }
        System.out.println(set.size());
    }

    public static boolean isMessyCode(String strName) {
        Pattern p = Pattern.compile("\\s*|t*|r*|n*");
        Matcher m = p.matcher(strName);
        String after = m.replaceAll("");
        String temp = after.replaceAll("\\p{P}", "");
        char[] ch = temp.trim().toCharArray();
        float chLength = ch.length;
        float count = 0;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (!Character.isLetterOrDigit(c)) {
                if (!isChinese(c)) {
                    count = count + 1;
                }
            }
        }
        float result = count / chLength;
        if (result > 0.4) {
            return true;
        } else {
            return false;
        }

    }
}
