package com.zhang.bruce.data.season1;

/**
 * @author bruce
 * @version 1.0
 * @date 2021/12/31 11:00
 * @Description: 新开两个算法
 * 先做排序算法
 */
public class NewTwoSubject {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        // 进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);


            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
    public int[] 冒泡排序(int[] array){
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length -1 -i; j ++) {
                if (array[j + 1] < array[j]) {
                    int tem = array[j + 1] ;
                    array[j + 1] = array[j];
                    array[j] = tem;
                }
            }
        }

        return array;
    }
}
