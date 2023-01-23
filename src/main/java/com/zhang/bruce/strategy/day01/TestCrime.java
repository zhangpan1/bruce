package com.zhang.bruce.strategy.day01;

import org.apache.commons.compress.utils.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/28 21:47
 * @Description:
 */
public class TestCrime {
    public static void main(String[] args) {
        Map<String, Object> dataMap = new HashMap<>();
        List<String> checkList = Lists.newArrayList();
        checkList.add("其他");
        checkList.add("未定性但交易行为异常");
        for (CrimeTypeEnum crime : CrimeTypeEnum.values()){
            dataMap.put(crime.getCode(), false);
            for (String s : checkList) {
                if (s.equals("其他")) {
                    dataMap.put("checkComment", "我是其他");
                    dataMap.put(CrimeTypeEnum.getCodeByName(s), true);
                }
                dataMap.put(CrimeTypeEnum.getCodeByName(s), true);
            }
        }
        System.out.println(dataMap.size());
    }
}
