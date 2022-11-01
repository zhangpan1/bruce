package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/2 18:17
 * 给你一个链表，删除链表的倒数第n个结点，并且返回链表的头结点
 */
public class DelKSolution {
    public ListNode removeNthFromEnd(ListNode head , int n){
        ListNode dummy = new ListNode(0,head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1;i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
    public int getLength(ListNode head){
        int length = 0;
        while (head != null) {
            ++ length;
            head = head.next;
        }
        return length;
    }
}
