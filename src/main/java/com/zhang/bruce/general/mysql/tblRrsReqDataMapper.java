package com.zhang.bruce.general.mysql;



import com.zhang.bruce.riskgod.online.fkjs.tblRrsReqData;

import java.util.List;
import java.util.Map;

public interface tblRrsReqDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(tblRrsReqData record);

    int insertSelective(tblRrsReqData record);

    tblRrsReqData selectByPrimaryKey(Long id);

    int queryBankNoCount(Map<String, Object> map);

    List<tblRrsReqData> queryList(Map<String, Object> map);

    int updateByPrimaryKeySelective(tblRrsReqData record);

    int updateByPrimaryKey(tblRrsReqData record);
}
