package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/10 10:58
 * 反转链表：
 * 定义两个指针： pre和cur  pre在前 cur在后
 * 每次让pre的next指向cur，实现一次局部反转
 * 局部反转完成之后，pre和cur同事往前移动一个位置
 * 循环上述过程，知道pre到达尾部
 */
public class ResloveSolu {
    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null ) return  head;
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = newHead;
            head = tmp;
        }
        return newHead;
    }
    public ListNode reverseList1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(1,null)))));
        new ResloveSolu().reverseList(head);
        System.out.println(head.val);
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
