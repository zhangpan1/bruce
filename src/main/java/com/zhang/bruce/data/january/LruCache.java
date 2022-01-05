package com.zhang.bruce.data.january;

import java.util.LinkedHashMap;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/1/5 10:16
 * @Description: LRC缓存实现
 * LRU以正整数为容量capacity初始化LRU缓存
 * 如果key存在缓存中，返回，否则返回-1
 * 观察LinkedhashMap源码
 *
 */
public class LruCache {
    /**
     * 作用：访问元素之后，将该元素放到双向链表的尾巴处（这个函数按照读取的顺序的时候会执行）
     * 优美的实现，在双向链表中将制定有uansu放到链尾
     */
    void afterNodeAccess(){}
    /**
     * 作用：删除元素之后，将元素从双向链表中删除，优美的删除节点
     */
    void afterNodeRemoval(){}
    /**
     * 作用：插入元素一周，判断是否需要移除一些一直不用的元素
     */
    void afterNodeInsertion(){}

    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(9);
    }


}
