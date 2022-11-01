package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/14 10:07
 */
public class ResloveSolution {
    public ListNode reversList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr.next != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode reversList1(ListNode head){
       ListNode prev = null;
       ListNode curr = head;
       while (curr.next != null) {
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       }
       return prev;
    }

}

