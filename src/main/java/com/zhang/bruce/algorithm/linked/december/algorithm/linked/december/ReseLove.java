package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/27 10:15
 * @Description: 反转链表
 */
public class ReseLove {
    public ListNode reverlee(ListNode head){
        // 输入旧的链表和头部，返回新的链表和头部
        ListNode pre = null;
        ListNode curr = head;
        // 遍历新的链表
        while (curr.next != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
