package com.zhang.bruce.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.zhang.bruce.config.DataSourceConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:27
 * @Description:
 */
public class EasyExcelGeneralDataMybatisListenerBat extends AnalysisEventListener<ActResultLogVO> {
    private IActResultLogService actResultLogService;

    /**
     * 用于存储读取的数据
     */
    private List<ActResultLogVO> dataList = new ArrayList<>();

    public EasyExcelGeneralDataMybatisListenerBat() {

    }

    public EasyExcelGeneralDataMybatisListenerBat(IActResultLogService actResultLogService) {
        this.actResultLogService = actResultLogService;
    }

    @Override
    public void invoke(ActResultLogVO data, AnalysisContext context) {
        // 数据add进入集合
        dataList.add(data);
    }

    /**
     * 保存数据到 DB
     */
    private void saveData() {
        try {
            DynamicDataSourceContextHolder.push(DataSourceConstants.LOCAL);
            if (dataList.size() > 0) {
               // List<String> mecNo = dataList.stream().collect(Collectors.toList()).
                //dataList.clear();
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
