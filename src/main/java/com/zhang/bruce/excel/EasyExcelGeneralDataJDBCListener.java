package com.zhang.bruce.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:30
 * @Description:
 */
public class EasyExcelGeneralDataJDBCListener extends AnalysisEventListener<java.util.Map<Integer,String>> {
    private IActResultLogService actResultLogService;

    /**
     * 用于存储读取的数据
     */
    private List<java.util.Map<Integer, String>> dataList = new ArrayList<>();

    public EasyExcelGeneralDataJDBCListener() {
    }

    public EasyExcelGeneralDataJDBCListener(IActResultLogService actResultLogService) {
        this.actResultLogService = actResultLogService;
    }

    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext context) {
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
        if (dataList.size() > 0) {
            actResultLogService.import2DBFromExcel10wByJDBC(dataList);
            dataList.clear();
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
