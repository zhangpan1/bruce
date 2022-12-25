package com.zhang.bruce.general.mysql;

import com.zhang.bruce.easyexcel.TDomesticMecReqMonth;

import java.util.List;

/**
 * @author bruce
 * @version 1.0
 * @date 2022/12/21 20:40
 * @Description:
 */
public interface RTDomesticMecReqMonthMapper {
    List<TDomesticMecReqMonth> selectByMecNo(String customernumber);
}
