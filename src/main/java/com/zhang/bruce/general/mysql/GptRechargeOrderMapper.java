package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.GptRechargeOrder;
import com.zhang.bruce.easyexcel.GptRechargeOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GptRechargeOrderMapper {
    int countByExample(GptRechargeOrderExample example);

    int deleteByExample(GptRechargeOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GptRechargeOrder record);

    int insertSelective(GptRechargeOrder record);

    List<GptRechargeOrder> selectByExample(GptRechargeOrderExample example);

    GptRechargeOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GptRechargeOrder record, @Param("example") GptRechargeOrderExample example);

    int updateByExample(@Param("record") GptRechargeOrder record, @Param("example") GptRechargeOrderExample example);

    int updateByPrimaryKeySelective(GptRechargeOrder record);

    int updateByPrimaryKey(GptRechargeOrder record);
}
