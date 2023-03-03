package com.zhang.bruce.base.bru1;

import com.google.common.collect.Lists;
import com.yeepay.g3.utils.common.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/31 3:45 下午
 */
public class BlackMethodVerify {

    private static List<String> BLACKMETHOD = getMethod();

    private static List<String> BLACKCLASS = getClasss();


    public static boolean mathMethod(String indexCode) {
        boolean flag = false;
        for (final String a : BLACKMETHOD) {
            if (indexCode.contains(a)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean mathClass(String indexCode) {
        boolean flag = false;
        if (StringUtils.isNotBlank(indexCode)) {
            String index = indexCode.toLowerCase();
            for (final String a : BLACKCLASS) {
                if (index.contains(a)) {
                    flag = true;
                    break;
                }
            }
            return flag;
        }
        return false;
    }

    private static List<String> getClasss() {
        BLACKCLASS = Lists.newArrayList();
        // 初始化黑名单类
        BLACKCLASS.add("java.io");
        BLACKCLASS.add("java.nio");
        BLACKCLASS.add("org.apache.commons.io");
        BLACKCLASS.add("javax.xml");
        BLACKCLASS.add("org.dom4j");
        BLACKCLASS.add("org.jdom");
        return BLACKCLASS;
    }

    private static List<String> getMethod() {
        BLACKMETHOD = new ArrayList<>();
        // 初始化黑名单函数
        BLACKMETHOD.add("execute");
        BLACKMETHOD.add("runtime");
        BLACKMETHOD.add("processbuilder");
        BLACKMETHOD.add("processimpl");
        BLACKMETHOD.add("parseexpression");
        BLACKMETHOD.add("freemarker");
        BLACKMETHOD.add("velocity");
        BLACKMETHOD.add("evaluate");
        BLACKMETHOD.add("socket");
        BLACKMETHOD.add("httpclient");
        BLACKMETHOD.add("executemethod");

        BLACKMETHOD.add("urlconnection");
        BLACKMETHOD.add("okhttp");
        BLACKMETHOD.add("exec(");
        return BLACKMETHOD;
    }
}
