package com.zhang.bruce.data.january;



import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/1/5 10:54
 * @Description: Lru缓存笨方法实现
 */
public class CacheImpl extends LinkedHashMap<Integer,Integer> {
    private int capacity;
    public CacheImpl(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }
    public int get(int key){
        return super.getOrDefault(key,-1);
    }
    // 这个可以不写
    public void put(int key, int value){
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
    /**
     * 两个链表都是逆序存储的位数的，因此，同一个位置的数字可以相加
     *
     */
    public ListNode addTwoNum(ListNode l1,ListNode l2){
        ListNode head = null,tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 !=null ? l1.val : 0 ;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum %10);
                tail = tail.next;
            }
            carry = sum /10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l1 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
