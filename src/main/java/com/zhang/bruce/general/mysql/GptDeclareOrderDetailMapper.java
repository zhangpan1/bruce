package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.GptDeclareOrderDetail;
import com.zhang.bruce.easyexcel.GptDeclareOrderDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GptDeclareOrderDetailMapper {
    int countByExample(GptDeclareOrderDetailExample example);

    int deleteByExample(GptDeclareOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GptDeclareOrderDetail record);

    int insertSelective(GptDeclareOrderDetail record);

    List<GptDeclareOrderDetail> selectByExample(GptDeclareOrderDetailExample example);

    GptDeclareOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GptDeclareOrderDetail record, @Param("example") GptDeclareOrderDetailExample example);

    int updateByExample(@Param("record") GptDeclareOrderDetail record, @Param("example") GptDeclareOrderDetailExample example);

    int updateByPrimaryKeySelective(GptDeclareOrderDetail record);

    int updateByPrimaryKey(GptDeclareOrderDetail record);
}
