package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.utils.LoggerUtil;

import static com.zhang.bruce.general.cach.TestEngine.notNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/11/17 5:18 下午
 */
public class TestMain {
    public static void main(String[] args) {
        String finalPrv = "四川省";
        String finalCity = "成都市";
        if (finalPrv.contains("省")) {
            finalPrv = finalPrv.replace("省","");
        }
        System.out.println(finalPrv);
    }

    static Object splitByProduction(Object obj) {
        String result = "";
        try {
            if (!notNull(obj)) {
                return result;
            }
            String[] str = obj.toString().split("_");
            return str[1];
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常  splitByProduction", e);
            return result;
        }
    }
}
