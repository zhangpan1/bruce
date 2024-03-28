package com.zhang.bruce.general.cach;

import com.tcredit.streaming.core.utils.LoggerUtil;
import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.zhang.bruce.rule.FunctionTest.isNull;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/10 3:26 下午
 */
public class DDSDs {
    public static void main(String[] args) {
        // String syncopen = "fkjs";
        // System.out.println(getWriteSource(syncopen));

        System.out.println(isContainsFocusReasonEquals("1#2#3","新业务风险待评估,开通高风险产品"));
    }

    private static List<String> getWriteSource(String syncopen) {
        // 默认走fkjs
        if (StringUtils.isNotEmpty(syncopen)) {
            List<String> arr = Arrays.asList(syncopen.split(","));
            if (arr.contains("business") || arr.contains("fkjs")){
                return Arrays.asList(syncopen.split(","));
            } else {
                return Arrays.asList("fjks");
            }
        } else {
            return Arrays.asList("fjks");
        }
    }

    static boolean isContainorNotBysplitEquals(Object a, String x, Object b) {
        try {
            if (a == null || b == null || x == null) {
                return false;
            }
            String bs = b.toString();
            String as = a.toString();
            String[] Arr = bs.split(";");
            String[] aArr = Arr.length == 1 ?bs.split(",") : bs.split(";");
            int tag = 0;
            for (String temp: aArr) {
                if ("包含".equals(x)) {
                    if (as.equals(temp)) {
                        return true;
                    }
                } else {
                    if(!as.equals(temp)){
                        tag++;
                    }
                }
            }
            if (tag == aArr.length) {
                return true;
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("isContainorNotBysplitEquals全局方法出现异常", e);
            e.printStackTrace();
            return false;
        }
    }

    static boolean isAttentiveEquals(Object a, String x) {
        try {
            if (isNull(a) || isNull(x)) {
                return false;
            }
            String as = a.toString();
            if ("生效中".equals(x)) {
                return "1".equals(as);
            } else if ("已取消".equals(x)) {
                return "0".equals(as);
            } else if ("未关注".equals(x)) {
                return "-2".equals(as);
            } else {
                return "1".equals(as);
            }
        } catch (Exception e) {
            LoggerUtil.getLogger().error("isAttentiveEquals全局方法出现异常", e);
            e.printStackTrace();
            return false;
        }
    }

    static boolean isContainsFocusReasonEquals(Object a, String x) {
        try {
            if (isNull(a) || isNull(x)) {
                return false;
            }
            String as = a.toString();
            Map sourceMap = new HashMap();
            sourceMap.put("新业务风险待评估","1");
            sourceMap.put("上下游提示重点关注","2");
            sourceMap.put("开通高风险产品","3");
            sourceMap.put("可疑商户待观察","4");
            sourceMap.put("风控敏感型客户","5");
            sourceMap.put("近期多发风险","6");
            sourceMap.put("行为异常","7");
            sourceMap.put("其他","8");
            String[] arr = x.split(",");
            if (arr.length > 0) {
                for (String temp: arr) {
                    String value = (String) sourceMap.get(temp);
                    if (isNull(value)) {
                        return false;
                    }
                    if (as.contains(value)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("isContainsFocusReasonEquals全局方法出现异常", e);
            e.printStackTrace();
            return false;
        }
    }

}
