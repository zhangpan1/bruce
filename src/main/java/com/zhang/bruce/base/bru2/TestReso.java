package com.zhang.bruce.base.bru2;

import com.tcredit.streaming.core.utils.LoggerUtil;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/6/28 5:13 下午
 */
public class TestReso {
    public static void main(String[] args) {
        System.out.println(isAllNull("110107196112220626",";"));
    }
    static boolean isAllNull (Object obj, Object splitType){
        try {
            if(obj == null || splitType == null){
                return true;
            }
            String str = obj.toString().trim();
            String splitTypeStr = splitType.toString();
            str = str.replace("null", "");
            str = str.replace(splitTypeStr, "");
            if("".equals(str) || str.length()==0){
                return true;
            }
            return false;
        } catch (Exception e) {
            LoggerUtil.getLogger().error("全局方法出现异常 isAllNull", e);
            return false;
        }
    }
}
