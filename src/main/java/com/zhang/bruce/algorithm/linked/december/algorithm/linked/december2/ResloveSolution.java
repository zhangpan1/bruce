package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december2;


/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/28 11:06
 * @Description: 反转链表
 * 给定一个链表，返回新链表的头部
 */
public class ResloveSolution {
    public ListNode reslove(ListNode head) {
        // 链表反转，传入一个链表的头部，返回有一个新链表的头部
        ListNode pre = null;
        ListNode cur = head;
        // 遍历 反转链表
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }

    // 合并两个有序链表
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode last = head;
        while (l1 != null && l2 != null) {
            // 进行比较
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

    public static void main(String[] args) {
        // 测试链表反转是否正确
        ListNode head = new ListNode(1);
        ListNode va1 = new ListNode(2);
        ListNode va2 = new ListNode(3);
        ListNode va3 = new ListNode(4);
        ListNode va4 = new ListNode(5);
        head.next = va1;
        va1.next = va2;
        va2.next = va3;
        va3.next = va4;
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            ListNode next = cur.next;
            cur = next;
        }
        ListNode newhead = new ResloveSolution().reslove(head);
        System.out.println(newhead);
        ListNode cur1 = newhead;
        while (cur1 != null) {
            System.out.println(cur1.val);
            ListNode next = cur1.next;
            cur1 = next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
