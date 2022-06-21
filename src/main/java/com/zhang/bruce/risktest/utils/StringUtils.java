package com.zhang.bruce.risktest.utils;

import com.google.common.base.Strings;

public class StringUtils {

    private StringUtils() {
    }

    /**
     * 按字节截断
     *
     * @param str
     * @param maxlen
     * @return
     */
    public static String removeOverlap(String str, int maxlen) {
        if (null != str && str != "null" && str != "None") {
            int strLen = str.length();
            if (isAllAscii(str)) {// 全是码
                if (strLen > maxlen) {
                    return str.substring(0, maxlen);
                } else {
                    return str;
                }
            } else {// 有汉字等其它
                for (int i = strLen; i > 0; i--) {
                    String substr = str.substring(0, i);
                    if (substr.getBytes().length <= maxlen) {
                        return substr;
                    }
                }

                return str;
            }
        } else {
            return "";
        }
    }

    public static boolean isAllAscii(String s) {
        return s.getBytes().length == s.length();
    }
    
    /**
	 * 判断字符串不为""/null/"null"/{}
	 * @param str
	 * @return
	 */
	public static boolean getNotNullStr(String str){
		if(!Strings.isNullOrEmpty(str) && !"null".equalsIgnoreCase(str) && !"{}".equals(str)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(getNotNullStr("{}"));
	}
}
