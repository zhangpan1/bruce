package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;

/**
 * null
 *
 * @author wcyong
 *
 * @date 2024-07-27
 */
public class TblMecTempBankcardnameSummary {
    private Long id;

    private String mecNo;

    private String bankCardName;

    private BigDecimal bankCardBookAdvanceCusamt;

    private BigDecimal bankCardDfdfCusamt;

    private String createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMecNo() {
        return mecNo;
    }

    public void setMecNo(String mecNo) {
        this.mecNo = mecNo == null ? null : mecNo.trim();
    }

    public String getBankCardName() {
        return bankCardName;
    }

    public void setBankCardName(String bankCardName) {
        this.bankCardName = bankCardName == null ? null : bankCardName.trim();
    }

    public BigDecimal getBankCardBookAdvanceCusamt() {
        return bankCardBookAdvanceCusamt;
    }

    public void setBankCardBookAdvanceCusamt(BigDecimal bankCardBookAdvanceCusamt) {
        this.bankCardBookAdvanceCusamt = bankCardBookAdvanceCusamt;
    }

    public BigDecimal getBankCardDfdfCusamt() {
        return bankCardDfdfCusamt;
    }

    public void setBankCardDfdfCusamt(BigDecimal bankCardDfdfCusamt) {
        this.bankCardDfdfCusamt = bankCardDfdfCusamt;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }
}
