package com.zhang.bruce.general.mysql;



import com.zhang.bruce.riskgod.online.business.TblRrsReq;

import java.util.List;

public interface TblRrsReqMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TblRrsReq record);

    int insertSelective(TblRrsReq record);

    TblRrsReq selectByPrimaryKey(Long id);

    List<TblRrsReq> selectByReqIdAndMecNo(TblRrsReq record);

    int updateByPrimaryKeySelective(TblRrsReq record);

    int updateByPrimaryKey(TblRrsReq record);
}
