package com.zhang.bruce.easyexcel;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/2/15 4:35 下午
 */
public class DivideDetail implements Serializable {
    private static final long serialVersionUID = 9008984743610131440L;
    /**
     * 预分账明细单号（请求代付的商户订单号）
     */
    private String divideRequestId;
    /**
     * 分账金额
     */
    private BigDecimal amount;
    /**
     * 入账方姓名
     */
    private String ledgerName;
    /**
     * 入账方收款账号
     */
    private String ledgerCardNo;
    /**
     * 入账方证件号
     */
    private String ledgerId;
    /**
     * 入账方手机号
     */
    private String ledgerPhone;
    /**
     * 入账方标签（角色）
     */
    private String ledgerRole;
    /**
     * 分账场景（实际对应代付里的出款场景）
     */
    private String scene;

    public String getDivideRequestId() {
        return divideRequestId;
    }

    public void setDivideRequestId(String divideRequestId) {
        this.divideRequestId = divideRequestId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    public String getLedgerCardNo() {
        return ledgerCardNo;
    }

    public void setLedgerCardNo(String ledgerCardNo) {
        this.ledgerCardNo = ledgerCardNo;
    }

    public String getLedgerId() {
        return ledgerId;
    }

    public void setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
    }

    public String getLedgerPhone() {
        return ledgerPhone;
    }

    public void setLedgerPhone(String ledgerPhone) {
        this.ledgerPhone = ledgerPhone;
    }

    public String getLedgerRole() {
        return ledgerRole;
    }

    public void setLedgerRole(String ledgerRole) {
        this.ledgerRole = ledgerRole;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }
}
