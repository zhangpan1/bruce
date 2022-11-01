package com.zhang.bruce.springchain.fil;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:28 上午
 */
public class AppService {
    @Autowired
    private List<Filter> filterList;
    public void mockedClient() {
        Task task = new Task(){}; // 这里task一般是通过数据库查询得到的
        for (Filter filter : filterList) {
            if (!filter.filter(task)) {
                return;
            }
        }

        // 过滤完成，后续是执行任务的逻辑
    }
}
