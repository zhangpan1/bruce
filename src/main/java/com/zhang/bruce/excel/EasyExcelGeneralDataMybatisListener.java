package com.zhang.bruce.excel;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.zhang.bruce.config.DataSourceConstants;
import com.zhang.bruce.easyexcel.TblGptExchangeOrder;


import java.util.ArrayList;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:27
 * @Description:
 */
public class EasyExcelGeneralDataMybatisListener extends AnalysisEventListener<ActResultLogVO> {
    private IActResultLogService actResultLogService;

    /**
     * 用于存储读取的数据
     */
    private List<ActResultLogVO> dataList = new ArrayList<>();

    public EasyExcelGeneralDataMybatisListener() {

    }

    public EasyExcelGeneralDataMybatisListener(IActResultLogService actResultLogService) {
        this.actResultLogService = actResultLogService;
    }

    @Override
    public void invoke(ActResultLogVO data, AnalysisContext context) {
        // 数据add进入集合
        dataList.add(data);
        // size是否为100000条:这里其实就是分批.当数据等于10w的时候执行一次插入
        if (dataList.size() >= ExcelConstants.GENERAL_ONCE_SAVE_TO_DB_ROWS_JDBC) {
            // 存入数据库:数据小于 1w 条使用 Mybatis 批量插入即可
            saveData();
            // 清理集合便于GC回收
            dataList.clear();
        }
    }

    /**
     * 保存数据到 DB
     */
    private void saveData() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.LOCAL);
            if (dataList.size() > 0) {
                actResultLogService.import2DBFromExcel10wByMybatis(BeanUtil.copyToList(dataList, ActResultLogDO.class));
                dataList.clear();
            }
        } finally {
            DynamicDataSourceContextHolder.poll();
        }

    }

    /**
     * Excel 中所有数据解析完毕会调用此方法
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        saveData();
        dataList.clear();
    }
}
