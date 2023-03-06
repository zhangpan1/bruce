package com.zhang.bruce.riskgod.business;

import java.util.List;

public interface TblOfflineReqMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblOfflineReq record);

    int insertSelective(TblOfflineReq record);

    TblOfflineReq selectByPrimaryKey(Long id);

    List<TblOfflineReq> selectByReqIdAndMecNo(TblOfflineReq record);

    int updateByPrimaryKeySelective(TblOfflineReq record);

    int updateByPrimaryKey(TblOfflineReq record);
}
