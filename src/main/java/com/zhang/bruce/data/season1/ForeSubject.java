package com.zhang.bruce.data.season1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/31 10:19
 * @Description:
 */
public class ForeSubject {
    /**
     * 两数之和
     * 给定一个数组，找出数组中两数之和
     * 第一种笨方法
     */
    public int[] twoSum(int[] sour, int target) {
        int n = sour.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i + j == target) {
                    return new int[]{i + j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum1(int[] sour, int target) {
        int n = sour.length;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (integerMap.containsKey(target - sour[i])) {
                return new int[]{i, integerMap.get(sour[i])};
            }
            integerMap.put(sour[i], i);
        }
        return new int[0];
    }

    /**
     * 第二题反转链表
     */
    public ListNode reslove(ListNode head) {
        // 反转链表前一个节点
        ListNode pre = null;
        // cur为当前节点
        ListNode cur = head;
        while (cur != null) {
            // 遍历构建新链表
            cur.next = pre;
            pre = cur;
            cur = cur.next;
        }
        return pre;
    }

    /**
     * 第三题 合并两个有序链表
     */
    public ListNode mergeTwoNode(ListNode l1, ListNode l2) {
        // 新链表头结点
        ListNode head = new ListNode(0);
        // 新链表 尾部
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
        if (l1 != null) last.next = l1;
        if (l2 != null) last.next = l2;
        return head.next;
    }

    /**
     * 找出字符串中 最长的连续字符数
     * if (i != 0) {
     * // 左指针向右移动一格，移除一个字符
     * occ.remove(s.charAt(i - 1));
     * }
     * // 不断右移指针，
     * while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
     * occ.add(s.charAt(rk + 1));
     * ++rk;
     * }
     * ans = Math.max(ans,rk - i + 1);
     */
    public int lengthOfSubString(String s) {
        // 定义一个去重的set集合
        Set<Character> characterSet = new HashSet<>();
        // 字符串长度
        int n = s.length();
        // 向右指针  -1 表示还没开始移动
        int rk = -1;
        // 最大长度
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                // 从一开始往后移动
                characterSet.remove(s.charAt(i));
            }
            // 不停的移动右指针
            while (rk + 1 < n && !characterSet.contains(s.charAt(rk + 1))) {
                characterSet.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

}