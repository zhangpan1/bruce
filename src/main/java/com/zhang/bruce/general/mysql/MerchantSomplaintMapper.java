package com.zhang.bruce.general.mysql;


import com.zhang.bruce.easyexcel.MerchantSomplaint;
import com.zhang.bruce.easyexcel.MerchantSomplaintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MerchantSomplaintMapper {
    int countByExample(MerchantSomplaintExample example);

    int deleteByExample(MerchantSomplaintExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MerchantSomplaint record);

    int insertSelective(MerchantSomplaint record);

    List<MerchantSomplaint> selectByExample(MerchantSomplaintExample example);

    MerchantSomplaint selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MerchantSomplaint record, @Param("example") MerchantSomplaintExample example);

    int updateByExample(@Param("record") MerchantSomplaint record, @Param("example") MerchantSomplaintExample example);

    int updateByPrimaryKeySelective(MerchantSomplaint record);

    int updateByPrimaryKey(MerchantSomplaint record);
}
