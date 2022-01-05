package com.zhang.bruce.data.january;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/1/5 14:27
 * @Description: 每天复习学过的算法
 * 五个学过的算法
 */
public class ReviewEveryDay {
    // 两数之和
    public int[] twoSum(int[] sour, int target) {
        // 第一种笨方法
        int n = sour.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i + j == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }

    // 聪明的方法，使用map来存储
    public int[] twoSum1(int[] sour, int target) {
        // 第二种方法
        Map<Integer, Integer> map = new HashMap<>();
        int n = sour.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - sour[i])) {
                return new int[]{i, map.get(target - sour[i])};
            }
            map.put(sour[i], i);
        }

        return new int[0];
    }

    // 无重复字符的最长子串
    public int lengthOfLongSubstring(String s) {
        // 滑动窗口
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int ans = 0;
        int rk = -1;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                // 左指针移动一格，移除一个字符
                set.remove(s.charAt(i));
            }
            while (rk + 1 < n && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                // 不听的右移
                ++rk;
            }
            // 第i 到rk个字符是一个及长的 无重复字符串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    // 两数相加
    public ListNode addTwoList(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            // 将两数进行相加
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (carry == 1) {
                cur.next = new ListNode(carry);
            }
        }


        return pre.next;
    }

    public ListNode reslove(ListNode l1) {
        // 反转链表
        ListNode pre = null;
        ListNode cur = l1;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    // 合并两个有序链表
    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
        // 新链表头部
        ListNode head = new ListNode();
        // 待输出链表的last结点
        ListNode last = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                last.next = l2;
                l2 = l2.next;
            } else {
                last.next = l1;
                l1 = l1.next;
            }
            last = last.next;
        }
        // l1 或 l2 可能还有剩余结点没有合并
        // 从循环中推出，至少有一个已经遍历结束
        if (l1 != null) last.next = l1;
        if (l2 != null) last.next = l2;
        return head.next;
    }

}


