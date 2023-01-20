package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.GptTdOrderDetail;
import com.zhang.bruce.easyexcel.GptTdOrderDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GptTdOrderDetailMapper {
    int countByExample(GptTdOrderDetailExample example);

    int deleteByExample(GptTdOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GptTdOrderDetail record);

    int insertSelective(GptTdOrderDetail record);

    List<GptTdOrderDetail> selectByExample(GptTdOrderDetailExample example);

    GptTdOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GptTdOrderDetail record, @Param("example") GptTdOrderDetailExample example);

    int updateByExample(@Param("record") GptTdOrderDetail record, @Param("example") GptTdOrderDetailExample example);

    int updateByPrimaryKeySelective(GptTdOrderDetail record);

    int updateByPrimaryKey(GptTdOrderDetail record);
}
