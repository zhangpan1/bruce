package com.zhang.bruce.riskgod.online.business;



public interface TblRrsReqService {
	int deleteByPrimaryKey(Long id);

    int insert(TblRrsReq record);

    int insertSelective(TblRrsReq record);

    TblRrsReq selectByPrimaryKey(Long id);

    TblRrsReq selectByReqIdAndMecNo(TblRrsReq record);

    int updateByPrimaryKeySelective(TblRrsReq record);

    int updateByPrimaryKey(TblRrsReq record);

}
