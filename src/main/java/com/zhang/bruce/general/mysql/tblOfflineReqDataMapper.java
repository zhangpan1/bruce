package com.zhang.bruce.general.mysql;



import com.zhang.bruce.riskgod.offline.fkjs.tblOfflineReqData;

import java.util.List;
import java.util.Map;

public interface tblOfflineReqDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tblOfflineReqData record);

    int insertSelective(tblOfflineReqData record);

    tblOfflineReqData selectByPrimaryKey(Long id);

    Integer queryBankNoCount(Map<String,Object> map);

    List<tblOfflineReqData> queryList(Map<String,Object> map);

    int updateByPrimaryKeySelective(tblOfflineReqData record);

    int updateByPrimaryKey(tblOfflineReqData record);
}
