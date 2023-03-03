package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.TblBossCollectionDetail;
import com.zhang.bruce.easyexcel.TblBossCollectionDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblBossCollectionDetailMapper {
    int countByExample(TblBossCollectionDetailExample example);

    int deleteByExample(TblBossCollectionDetailExample example);

    int insert(TblBossCollectionDetail record);

    int insertSelective(TblBossCollectionDetail record);

    List<TblBossCollectionDetail> selectByExample(TblBossCollectionDetailExample example);

    int updateByExampleSelective(@Param("record") TblBossCollectionDetail record, @Param("example") TblBossCollectionDetailExample example);

    int updateByExample(@Param("record") TblBossCollectionDetail record, @Param("example") TblBossCollectionDetailExample example);
}
