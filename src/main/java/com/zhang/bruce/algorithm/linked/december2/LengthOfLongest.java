package com.zhang.bruce.algorithm.linked.december2;

import java.util.HashMap;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/28 15:11
 * @Description:
 */
public class LengthOfLongest {
    // abcdabcdsssd ，判断最长无重复字符串的集合
    // 使用滑动窗口来解决这个问题
    public int length(String s){
        if (s.length() == 0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left,map.get(s.charAt(i) + 1)) ;
            }
            map.put(s.charAt(i), i);
            max = Math.max(max,i-left+ 1);
        }
        return 0;
    }
}
