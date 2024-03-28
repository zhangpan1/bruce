package com.zhang.bruce.general.cach;

import com.yeepay.g3.utils.common.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/4/13 6:28 下午
 */
public class NoTest {
    public static void main(String[] args) {

        String packageName = "FD[NPHZ2014411000012-20231130-00000015].ZIP";
        String packageTypePrefix = org.apache.commons.lang3.StringUtils.substring(packageName, 0, 3);
        System.out.println(packageTypePrefix);
    }

    public static Map<String, Object> reqinfoParse(String reqInfo) {
        Map<String, Object> result = new HashMap<String, Object>();
        if (StringUtils.isBlank(reqInfo)) {
            return result;
        }
        reqInfo = filterJsonFromReqInfo(reqInfo, "goodsInfo=");
        reqInfo = filterJsonFromReqInfo(reqInfo, "toolsInfo=");
        String[] reqInfoArray = reqInfo.split(",");
        if (reqInfoArray != null && reqInfoArray.length > 0) {
            for (String req : reqInfoArray) {
                String[] reqFactorArray = new String[2];
                if (StringUtils.isNotBlank(req)) {
                    if (req.indexOf("=") > 0) {
                        String str1 = req.substring(0, req.indexOf("="));
                        String str2 = req.substring(req.indexOf("=") + 1, req.length());
                        reqFactorArray[0] = str1;
                        reqFactorArray[1] = str2;
                        if (reqFactorArray != null && reqFactorArray.length > 0) {
                            if (reqFactorArray.length == 2) {
                                result.put(reqFactorArray[0].trim(), reqFactorArray[1].trim());
                            } else {
                                result.put(reqFactorArray[0].trim(), "");
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
    /**
     * @param reqInfo 直传属性
     * @param jsonKey 需要过滤的json的key ",goodsInfo="
     * @return
     */
    private static String filterJsonFromReqInfo(String reqInfo, String jsonKey) {
        String result = "";
        int goodsinfoIdx = reqInfo.indexOf(jsonKey);
        if (goodsinfoIdx > 0) {
            String goodsInfoPrefix = reqInfo.substring(0, goodsinfoIdx);
            String goodsInfoSuffix = reqInfo.substring(goodsinfoIdx + jsonKey.length());
            if (goodsInfoSuffix.length() > 0) {
                if ("{".equals(goodsInfoSuffix.substring(0, 1))) {
                    goodsInfoSuffix = goodsInfoSuffix.substring(1);
                    int goodsinfoEndIdx = goodsInfoSuffix.indexOf("}");
                    if (goodsinfoEndIdx >= 0) {
                        goodsInfoSuffix = goodsInfoSuffix.substring(goodsinfoEndIdx + 1);
                        result = goodsInfoPrefix + goodsInfoSuffix;
                    } else {
                        // 不需要过滤
                        result = reqInfo;
                    }
                } else {
                    // 不需要过滤
                    result = reqInfo;
                }
            } else {
                // 不需要过滤
                result = reqInfo;
            }
        } else {
            // 不需要过滤
            result = reqInfo;
        }
        return result;
    }
}
