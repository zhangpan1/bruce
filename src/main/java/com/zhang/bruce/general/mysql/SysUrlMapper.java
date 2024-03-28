package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.SysUrl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUrlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUrl record);

    int insertSelective(SysUrl record);

    SysUrl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUrl record);

    int updateByPrimaryKey(SysUrl record);
    /**
     * 查所有 level 传5
     * 查角色的所有权限 level 传4
     * @param level
     * @return
     */
    List<SysUrl> selectUrlListByLevel(@Param("level")int level);

    //连表查询
    /**
     * 查所有 level 传5
     * 查角色的所有权限 level 传4
     * @param userId
     * @param level
     * @return
     */
    List<SysUrl> selectUrlListByUserIdAndLevel(@Param("userId") int userId, @Param("level")int level);


    //根据3级查询5级
    List<SysUrl> select5By3(@Param("urlId") int urlId, @Param("level")int level);

    List<SysUrl>  selectAllData();
}
