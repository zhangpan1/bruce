package com.zhang.bruce.java8.customer;

import com.github.pagehelper.PageInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.function.Consumer;

/**
 * 流查询模版
 *
 * @author lijunhao
 * @date 2022/1/18 11:30 上午
 */
public abstract class StreamQueryTemplate<T> {

    private static final Log log = LogFactory.getLog(StreamQueryTemplate.class);

    /**
     * 页大小
     */
    private int pageSize = 100;

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 执行结果
     *
     * @param consumer 数据处理
     */
    public void execute(Consumer<List<T>> consumer) {

        boolean hasNext = true;
        int pageNum = 1;

        while (hasNext) {
            if (log.isDebugEnabled()) {
                log.debug("StreamQueryTemplate start query: pageNum=" + pageNum + ", pageSize=" + pageSize);
            }
            PageInfo<T> page = doISelect(pageNum, pageSize);
            if (log.isDebugEnabled()) {
                log.debug("StreamQueryTemplate query: pageNum=" + pageNum + ", pageSize=" + pageSize + ", result pageInfo:getTotal=>" + page.getTotal() + ",pageInfo:getTotal=>" + page.getPages());
            }
            List<T> list = page.getList();
            consumer.accept(list);
            hasNext = list.size() > 0;
            if (hasNext) {
                pageNum = pageNum + 1;
            }
        }
        if (log.isDebugEnabled()) {
            log.debug("StreamQueryTemplate query: pageNum=" + pageNum + ", pageSize=" + pageSize + ", query finish!");
        }
    }

    /**
     * 查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    protected abstract PageInfo<T> doISelect(int pageNum, int pageSize);

}
