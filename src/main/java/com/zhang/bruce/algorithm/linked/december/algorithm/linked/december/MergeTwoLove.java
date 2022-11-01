package com.zhang.bruce.algorithm.linked.december.algorithm.linked.december;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/27 18:46
 * @Description:
 */
public class MergeTwoLove {
    /**
     * 反转链表 已经解决
     * 合并两个有序链表
     * @return
     */
    public ListNode mergeTwoList(ListNode l1 ,ListNode l2){
        // 拿到新的链表头
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
