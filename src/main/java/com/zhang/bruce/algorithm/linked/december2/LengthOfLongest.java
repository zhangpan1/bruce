package com.zhang.bruce.algorithm.linked.december2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/28 15:11
 * @Description:
 */
public class LengthOfLongest {
    // abcdabcdsssd ，判断最长无重复字符串的集合
    // 使用滑动窗口来解决这个问题
    public int length1(String s){
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为-1，相当于我们在字符串的左边界的左侧，还没开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n ; i ++) {
            if (i != 0) {
                // 左指针向右移动一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断移动右指针
                occ.add(s.charAt(rk + 1));
                ++ rk;
            }
            // 第i个到rk个字符串是一个机场的无重复字符串
            ans = Math.max(ans,rk - i + 1);
        }
        return ans;
    }
    public int length3(String s){
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i <s.length(); i ++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String ss = "pwwkew";
        System.out.println(ss.charAt(3));
        int x = new LengthOfLongest().length3(ss);
        System.out.println(x);
    }
}
