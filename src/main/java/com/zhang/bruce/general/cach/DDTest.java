package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.utils.LoggerUtil;

import static com.zhang.bruce.general.cach.TestEngine.notNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/7/16 11:41 上午
 */
public class DDTest {
    public static void main(String[] args) {
        // eval(notNull(#targetMerchantNo#) && !isInString(#targetMerchantNo#,#x#))
        System.out.println( (notNull("10089050542") && !isInString("10089050542","10089140347,10034222873")) || (notNull(null) && !isInString(null,"10089140347,10034222873")));

    }
    static boolean isInString(Object a, Object b) {
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("b == {}", b);
            if (a == null || b == null) {
                return false;
            }
  /*  String bs = (String) b;
    String as = (String) a;*/
            String bs = b.toString();
            String as = a.toString();
            String[] arr = null;
            if (bs.contains(",")) {
                arr = bs.split(",");
            } else if (bs.contains(";")) {
                arr = bs.split(";");
            } else {
                arr = bs.split(",");
            }
            if (!"CREDIT".equals(as)&&as.contains("CREDIT")) {
                as = as.substring(0, as.length() - 6);
            }
            if (!"DEBIT".equals(as)&&as.contains("DEBIT")) {
                as = as.substring(5, as.length());
            }
            // String[] arr = bs.split(",").length == 0 ? bs.split(";"):bs.split(",");
            for (String temp: arr) {
                if(as.equals(temp)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }
}
