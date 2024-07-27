package com.zhang.bruce.general.mysql;



import com.zhang.bruce.easyexcel.TblMecTempBankcardnameSummary;
import com.zhang.bruce.easyexcel.TblMecTempBankcardnameSummaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TblMecTempBankcardnameSummaryMapper {
    int countByExample(TblMecTempBankcardnameSummaryExample example);

    int deleteByExample(TblMecTempBankcardnameSummaryExample example);

    int insert(TblMecTempBankcardnameSummary record);

    int insertSelective(TblMecTempBankcardnameSummary record);

    List<TblMecTempBankcardnameSummary> selectByExample(TblMecTempBankcardnameSummaryExample example);

    int updateByExampleSelective(@Param("record") TblMecTempBankcardnameSummary record, @Param("example") TblMecTempBankcardnameSummaryExample example);

    int updateByExample(@Param("record") TblMecTempBankcardnameSummary record, @Param("example") TblMecTempBankcardnameSummaryExample example);

    /**
     * 根据日期查询总数量
     * @return
     */
    Integer selectBankCardNameCount(Map<String, String> map);

    List<TblMecTempBankcardnameSummary> queryMerchantBankCardNameByPage(Map<String, Object> params);
}
