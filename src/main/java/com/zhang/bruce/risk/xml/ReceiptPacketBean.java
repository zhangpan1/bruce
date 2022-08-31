package com.zhang.bruce.risk.xml;

import com.google.common.collect.Lists;

import java.time.LocalDate;
import java.util.List;
import java.util.StringJoiner;

/**
 * 回执数据包数据
 *
 * @author lijunhao
 * @date 2021/12/24 4:25 下午
 */
public class ReceiptPacketBean {

    /**
     * 错误总数
     */
    private String errorCount;
    /**
     * 数据包名称
     */
    private String oriPacketName;

    /**
     * 报告时间
     */
    private LocalDate reportDate;

    /**
     * 结果码（SUCC-成功,WARN-警告，ERROR-错误，NMFL-异常包错误回执，OTFL-未知错误回执，CTFL-通用错误）
     */
    private String resultCode;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 错误/警告信息
     */
    private List<ReceiptInfo> receiptInfos = Lists.newArrayList();


    public String getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(String errorCount) {
        this.errorCount = errorCount;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    public List<ReceiptInfo> getReceiptInfos() {
        return receiptInfos;
    }

    public void setReceiptInfos(List<ReceiptInfo> receiptInfos) {
        this.receiptInfos = receiptInfos;
    }

    public String getOriPacketName() {
        return oriPacketName;
    }

    public void setOriPacketName(String oriPacketName) {
        this.oriPacketName = oriPacketName;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", ReceiptPacketBean.class.getSimpleName() + "[", "]")
                .add("errorCount='" + errorCount + "'")
                .add("oriPacketName='" + oriPacketName + "'")
                .add("reportDate=" + reportDate)
                .add("resultCode='" + resultCode + "'")
                .add("errorMsg='" + errorMsg + "'")
                .add("receiptInfos=" + receiptInfos)
                .toString();
    }
}
