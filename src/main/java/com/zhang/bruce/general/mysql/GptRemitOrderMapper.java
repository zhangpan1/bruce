package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.GptRemitOrder;
import com.zhang.bruce.easyexcel.GptRemitOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GptRemitOrderMapper {
    int countByExample(GptRemitOrderExample example);

    int deleteByExample(GptRemitOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(GptRemitOrder record);

    int insertSelective(GptRemitOrder record);

    List<GptRemitOrder> selectByExample(GptRemitOrderExample example);

    GptRemitOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GptRemitOrder record, @Param("example") GptRemitOrderExample example);

    int updateByExample(@Param("record") GptRemitOrder record, @Param("example") GptRemitOrderExample example);

    int updateByPrimaryKeySelective(GptRemitOrder record);

    int updateByPrimaryKey(GptRemitOrder record);
}
