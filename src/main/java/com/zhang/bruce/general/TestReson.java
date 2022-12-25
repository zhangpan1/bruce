package com.zhang.bruce.general;

import com.tcredit.streaming.core.utils.LoggerUtil;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/2 16:03
 * @Description:
 */
public class TestReson {
    public static void main(String[] args) {
        String source = "192.168.2.1";
        String y = "192.168,193.132";
        System.out.println(isContainSplit(source,"包含",y,2));
    }
    public static boolean isContainSplit(Object a, String x, Object b,Object c) {
        try {
            LoggerUtil.getLogger().debug("a == {}", a);
            LoggerUtil.getLogger().debug("x == {}", x);
            LoggerUtil.getLogger().debug("b == {}", b);
            LoggerUtil.getLogger().debug("c == {}", c);
            if (a == null || b == null || x == null || c == null) {
                return false;
            }
            String bs = (String) b;
            String as = (String) a;
            Integer cs = (Integer) c;
            String[] Arr = bs.split(";");
            String[] aArr = Arr.length == 1 ?bs.split(",") : bs.split(";");
            String[] asArr = as.split("\\.");
            String result = "";
            if (asArr.length >= cs) {
                for (int i = 0; i< cs; i ++) {
                    if (i == (cs - 1)) {
                        result=result+asArr[i];
                    } else {
                        result=result+asArr[i]+".";
                    }

                }
            } else {
                return false;
            }
            int tag = 0;
            for (String temp: aArr) {
                if ("包含".equals(x)) {
                    if (result.equals(temp)) {
                        return true;
                    }
                } else {
                    if (result.equals(temp)) {
                        return false;
                    }
                    tag++;
                }
            }
            if (tag == aArr.length) {
                return true;
            }
            return false;
        } catch (Exception e) {

            LoggerUtil.getLogger().error("全局方法出现异常", e);
            return false;
        }
    }
}
