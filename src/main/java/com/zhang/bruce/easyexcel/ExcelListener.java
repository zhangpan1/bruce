package com.zhang.bruce.easyexcel;

import cn.hutool.json.JSONUtil;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 小布
 * @version 1.0.0
 * @date on  2021/6/17 16:31
 */
@Slf4j
public class ExcelListener<T> extends AnalysisEventListener<T> {
    /**
     * 默认给一万 过大效率会变低
     */
    private static final int BATCH_COUNT = 10000;
    List<T> list = new ArrayList<>();

    List<String> headList = new ArrayList<>();
    private UserService userService;

    public ExcelListener(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void invoke(T data, AnalysisContext context) {
        log.info("解析到一条数据:{}", JSONUtil.toJsonStr(data));
        list.add(data);
        // 把BATCH_COUNT倍数的数据全部save
        if (list.size() >= BATCH_COUNT) {
            saveData();
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

            // 把最后的数据统一保存起来 有可能数据不是BATCH_COUNT的整数倍
            saveData();
    }

    /**
     * 读取表头 考虑表头信息如何处理
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        super.invokeHeadMap(headMap, context);
        for (Map.Entry<Integer, String> entry : headMap.entrySet()) {
            headList.add("item" + (entry.getKey() + 1));
        }
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        userService.saveUsers((List<UserImportVO>) list);
        log.info("存储数据库成功！");
    }

    public List<String> getHeadList() {
        return headList;
    }
}
