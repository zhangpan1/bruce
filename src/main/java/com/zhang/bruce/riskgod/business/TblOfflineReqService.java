package com.zhang.bruce.riskgod.business;

public interface TblOfflineReqService {
	 int deleteByPrimaryKey(Long id);

	    int insert(TblOfflineReq record);

	    int insertSelective(TblOfflineReq record);

	    TblOfflineReq selectByPrimaryKey(Long id);

	    TblOfflineReq selectByReqIdAndMecNo(TblOfflineReq record);

	    int updateByPrimaryKeySelective(TblOfflineReq record);

	    int updateByPrimaryKey(TblOfflineReq record);

}
