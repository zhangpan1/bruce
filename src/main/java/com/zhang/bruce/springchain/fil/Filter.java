package com.zhang.bruce.springchain.fil;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:23 上午
 */
public interface Filter {
    /**
     * 用于对各个任务节点进行过滤
     */
    boolean filter(Task task);
}
