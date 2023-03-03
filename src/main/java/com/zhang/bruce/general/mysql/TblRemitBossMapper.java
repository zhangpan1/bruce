package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.TblRemitBoss;
import com.zhang.bruce.easyexcel.TblRemitBossExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblRemitBossMapper {
    int countByExample(TblRemitBossExample example);

    int deleteByExample(TblRemitBossExample example);

    int insert(TblRemitBoss record);

    int insertSelective(TblRemitBoss record);

    List<TblRemitBoss> selectByExample(TblRemitBossExample example);

    int updateByExampleSelective(@Param("record") TblRemitBoss record, @Param("example") TblRemitBossExample example);

    int updateByExample(@Param("record") TblRemitBoss record, @Param("example") TblRemitBossExample example);
}
