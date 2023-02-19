package com.zhang.bruce.excel;

import java.util.List;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:17
 * @Description:
 */
public interface IActResultLogService extends IService<ActResultLogDO> {
    /**
     * 通过分页参数查询一百w数据
     * @return
     */
    List<ActResultLogDO> findByPage100w(Integer pageNum, Integer pageSize);

    /**
     * 从 Excel 导入数据，批次为 10w，通过 JDBC
     * @param dataList
     * @return
     */
    Map<String, Object> import2DBFromExcel10wByJDBC(List<Map<Integer, String>> dataList);

    /**
     * 从 Excel 导入数据，批次为 10W，通过 MyBatis
     * @param actResultLogList
     */
    void import2DBFromExcel10wByMybatis(List<ActResultLogDO> actResultLogList);
}
