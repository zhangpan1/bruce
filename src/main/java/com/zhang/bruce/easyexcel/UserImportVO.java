package com.zhang.bruce.easyexcel;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: xueqimiao
 * @Date: 2022/9/28 10:10
 * 导入专用VO 所有数据类型均用String接收 避免用户随便乱输入 接收不同的类型报异常  比如 年龄是int类型  用户输入十三 后台就会报异常
 */
@Data
public class UserImportVO implements Serializable {

    /**
     * @ExcelIgnore 不导出此列
     */
    @ExcelIgnore
    private String id;



    /**
     * 产品编码
     */
    @ExcelProperty(value = "prod")
    private String prod;

    /**
     * 业务方
     */
    @ExcelProperty(value = "biz")
    private String biz;

    /**
     * 支付方式
     */
    @ExcelProperty(value = "payway")
    private String payWay;

    /**
     * 商户编号
     */
    @ExcelProperty(value = "mec_no")
    private String mecNo;

    /**
     * 表名
     */
    @ExcelProperty(value = "table_name")
    private String tableName;

    /**
     * 交易总金额
     */
    @ExcelProperty(value = "amt")
    private String amt;

    /**
     * 总交易笔数
     */
    @ExcelProperty(value = "total_count")
    private String totalCount;

    /**
     * 支付结果
     */
    @ExcelProperty(value = "pay_result")
    private String payResult;

    /**
     * 拼接结果字段
     */
    @ExcelProperty(value = "category_result")
    private String categoryResult;

    /**
     * 月份字段
     */
    @ExcelProperty(value = "month_str")
    private String monthStr;

    /**
     * 交易时间
     */
    @ExcelProperty(value = "occ_tm")
    private String occTm;

    /**
     * 创建时间
     */
    @ExcelProperty(value = "ct_tm")
    private String ctTm;
    /**
     * 创建时间
     */
    @ExcelProperty(value = "dt")
    private String dt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getMecNo() {
        return mecNo;
    }

    public void setMecNo(String mecNo) {
        this.mecNo = mecNo;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getPayResult() {
        return payResult;
    }

    public void setPayResult(String payResult) {
        this.payResult = payResult;
    }

    public String getCategoryResult() {
        return categoryResult;
    }

    public void setCategoryResult(String categoryResult) {
        this.categoryResult = categoryResult;
    }

    public String getMonthStr() {
        return monthStr;
    }

    public void setMonthStr(String monthStr) {
        this.monthStr = monthStr;
    }

    public String getOccTm() {
        return occTm;
    }

    public void setOccTm(String occTm) {
        this.occTm = occTm;
    }

    public String getCtTm() {
        return ctTm;
    }

    public void setCtTm(String ctTm) {
        this.ctTm = ctTm;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }
}
