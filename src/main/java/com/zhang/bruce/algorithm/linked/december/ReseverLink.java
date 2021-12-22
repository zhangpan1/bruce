package com.zhang.bruce.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/11/26 18:34
 */
public class ReseverLink {
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

