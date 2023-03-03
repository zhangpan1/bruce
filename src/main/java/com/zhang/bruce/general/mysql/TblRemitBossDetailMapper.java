package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.TblRemitBossDetail;
import com.zhang.bruce.easyexcel.TblRemitBossDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblRemitBossDetailMapper {
    int countByExample(TblRemitBossDetailExample example);

    int deleteByExample(TblRemitBossDetailExample example);

    int insert(TblRemitBossDetail record);

    int insertSelective(TblRemitBossDetail record);

    List<TblRemitBossDetail> selectByExample(TblRemitBossDetailExample example);

    int updateByExampleSelective(@Param("record") TblRemitBossDetail record, @Param("example") TblRemitBossDetailExample example);

    int updateByExample(@Param("record") TblRemitBossDetail record, @Param("example") TblRemitBossDetailExample example);
}
