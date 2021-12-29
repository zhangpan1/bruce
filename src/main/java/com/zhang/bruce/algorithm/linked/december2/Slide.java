package com.zhang.bruce.algorithm.linked.december2;

import java.util.*;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/29 10:27
 * @Description: 找一个字符串 最大的长度
 * 笨方法 背下来
 */
public class Slide {
    public int lengthOfSubstring(String s){
        // 先用一个哈希集合，记录每个字符串是否出现过
        Set<Character> occ = new HashSet<>();
        int n = s.length();
        // 定义一个右指针 ，初始值为-1,相当于在字符串左边界的左侧，还没开始移动
        int rk = -1;
        int ans = 0;
        for (int i = 0; i < n; i ++) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            // 不断右移指针，
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans,rk - i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(new Slide().lengthOfSubstring(s));
    }
    // 两数之和
    public int[] twoSum(int[] args , int target){
        Map<Integer,Integer> map = new HashMap<>();
        int n = args.length;
        for (int i = 0; i < n ; i ++) {
            if (map.containsKey(target - args[i])) {
                return new int[]{target - args[i],i};
            }
            map.put(args[i],i);
        }
        return new int[0];
    }
    // 反转链表
    public ListNode reslove(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        // 反转链表
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    // 合并两个有序链表
    public ListNode mergeLink(ListNode l1,ListNode l2){
        // 定义新链表头结点
        ListNode head = new ListNode();
        // 尾结点
        ListNode last = head;
        if (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                last.next = l1;
                l1 = l1.next;
            } else {
                last.next = l2;
                l2 = l2.next;
            }
            last = last.next;
        }
        if (l1 != null) last.next = l1;
        if (l2 != null) last.next = l2;
        return last;
    }

}
