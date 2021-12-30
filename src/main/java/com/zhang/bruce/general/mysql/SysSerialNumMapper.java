package com.zhang.bruce.general.mysql;

import com.zhang.bruce.general.SysSerialNum;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysSerialNumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysSerialNum record);

    int insertSelective(SysSerialNum record);

    SysSerialNum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysSerialNum record);

    int updateByPrimaryKey(SysSerialNum record);
}