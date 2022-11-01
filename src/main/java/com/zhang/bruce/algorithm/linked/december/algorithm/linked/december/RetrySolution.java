package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/15 19:17
 */
public class RetrySolution {
    // 反转链表
    public ListNode resevleList(ListNode head){
        // 先写思路
        // 将思路转换为代码
        // pre  --- cur  ---- next  ,指针反转 cur指向pre ,next 指向cur ，cur 往下
        ListNode pre = null;
        ListNode curr = head;
        while (curr.next != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
