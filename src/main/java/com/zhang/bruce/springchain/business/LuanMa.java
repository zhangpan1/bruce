package com.zhang.bruce.springchain.business;

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
        String s = "&&$$$";

        System.out.println(isMessyCode(s));

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
