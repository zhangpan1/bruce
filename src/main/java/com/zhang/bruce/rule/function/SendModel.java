package com.zhang.bruce.rule.function;

import java.math.BigDecimal;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/2/28 4:50 下午
 */
public class SendModel {
    //应用场景 Routine:常规风控 Special:特定场景
    private String scene;
    /**
     *
     */
    private String riskLimitruleCode;
    /**
     *
     */
    private Long id;

    //常规限额标记 Y:含常规限额 N:不含常规限额
    private String commonFlag;

    //临时限额标记 Y:含临时限额 N:不含临时限额
    private String tempFlag;
    /**
     *
     */
    private BigDecimal singleAmt;

    /**
     *
     */
    private BigDecimal dayAmt;

    /**
     *
     */
    private Long dayCount;

    /**
     *
     */
    private BigDecimal monthAmt;

    /**
     *
     */
    private Long monthCount;


    /**
     * 临时单笔限额
     */
    private BigDecimal tempSingleAmt;

    /**
     * 临时日限额
     */
    private BigDecimal tempDayAmt;

    /**
     * 临时日限次
     */
    private Long tempDayCount;

    /**
     * 临时月限额
     */
    private BigDecimal tempMonthAmt;

    /**
     * 临时月限次
     */
    private Long tempMonthCount;
    /**
     * 是否新增标识
     */
    private int addFlag;

    /**
     * 临时单笔限额
     */
    private BigDecimal afterSingleAmt;

    /**
     * 临时日限额
     */
    private BigDecimal afterDayAmt;

    /**
     * 临时日限次
     */
    private Long afterDayCount;

    /**
     * 临时月限额
     */
    private BigDecimal afterMonthAmt;

    /**
     * 临时月限次
     */
    private Long afterMonthCount;

}
