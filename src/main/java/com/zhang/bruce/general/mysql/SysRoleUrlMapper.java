package com.zhang.bruce.general.mysql;

import com.zhang.bruce.easyexcel.SysRoleUrl;

import java.util.List;

public interface SysRoleUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUrl record);

    int insertSelective(SysRoleUrl record);

    SysRoleUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUrl record);

    int updateByPrimaryKey(SysRoleUrl record);

    int deleteByRoleId(Integer roleId);

    List<Integer> selectUrlIdsByRoleId(Integer roleId);

    List<Integer> selectUrlIdsByRoleIds(List<Integer> roleIds);

    Integer[] selectUrlIdsArrayByRoleId(Integer roleId);

    Integer[] selectUrlIdsArrayByRoleIds(List<Integer> roleIds);

}
