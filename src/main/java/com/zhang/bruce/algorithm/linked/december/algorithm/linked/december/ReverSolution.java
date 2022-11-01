package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/20 19:17
 */
public class ReverSolution {
    public ListNode rever1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            // 思路 ，将链表的next 只想头不，继续往下即可
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            // 一直反转即可
        }
        return pre;
    }
}
