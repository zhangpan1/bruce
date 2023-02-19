package com.zhang.bruce.general.mysql;

import com.zhang.bruce.excel.ActResultLogDO;

import java.util.List;
import java.util.Map;

/**
 * @author bruce
 * @version 1.0
 * @date 2023/2/19 15:26
 * @Description:
 */
public interface ActResultLogMapper {
    void importToDb(List<ActResultLogDO> actResultLogDO);

    List<ActResultLogDO> selectList(Map<String, String> param);
}
