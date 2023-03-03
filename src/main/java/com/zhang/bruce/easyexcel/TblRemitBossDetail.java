package com.zhang.bruce.easyexcel;

import java.math.BigDecimal;
import java.util.Date;

/**
 * null
 *
 * @author wcyong
 *
 * @date 2023-02-28
 */
public class TblRemitBossDetail {
    private Long id;

    private String prod;

    private String biz;

    private String mecNo;

    private String reqId;

    private String seqId;

    private Date occTm;

    private String dvdreqId;

    private BigDecimal ordAmt;

    private String ledgerName;

    private String ledgerCrdNo;

    private String ledgerIdNo;

    private String ledgerPhone;

    private String ledgerRole;

    private String scene;

    private String sta;

    private Integer version;

    private Date ctTm;

    private Date mfTm;

    private String ledgerNameDigest;

    private String ledgerCrdNoDigest;

    private String ledgerIdNoDigest;

    private String ledgerPhoneDigest;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod == null ? null : prod.trim();
    }

    public String getBiz() {
        return biz;
    }

    public void setBiz(String biz) {
        this.biz = biz == null ? null : biz.trim();
    }

    public String getMecNo() {
        return mecNo;
    }

    public void setMecNo(String mecNo) {
        this.mecNo = mecNo == null ? null : mecNo.trim();
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId == null ? null : reqId.trim();
    }

    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId == null ? null : seqId.trim();
    }

    public Date getOccTm() {
        return occTm;
    }

    public void setOccTm(Date occTm) {
        this.occTm = occTm;
    }

    public String getDvdreqId() {
        return dvdreqId;
    }

    public void setDvdreqId(String dvdreqId) {
        this.dvdreqId = dvdreqId == null ? null : dvdreqId.trim();
    }

    public BigDecimal getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(BigDecimal ordAmt) {
        this.ordAmt = ordAmt;
    }

    public String getLedgerName() {
        return ledgerName;
    }

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName == null ? null : ledgerName.trim();
    }

    public String getLedgerCrdNo() {
        return ledgerCrdNo;
    }

    public void setLedgerCrdNo(String ledgerCrdNo) {
        this.ledgerCrdNo = ledgerCrdNo == null ? null : ledgerCrdNo.trim();
    }

    public String getLedgerIdNo() {
        return ledgerIdNo;
    }

    public void setLedgerIdNo(String ledgerIdNo) {
        this.ledgerIdNo = ledgerIdNo == null ? null : ledgerIdNo.trim();
    }

    public String getLedgerPhone() {
        return ledgerPhone;
    }

    public void setLedgerPhone(String ledgerPhone) {
        this.ledgerPhone = ledgerPhone == null ? null : ledgerPhone.trim();
    }

    public String getLedgerRole() {
        return ledgerRole;
    }

    public void setLedgerRole(String ledgerRole) {
        this.ledgerRole = ledgerRole == null ? null : ledgerRole.trim();
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene == null ? null : scene.trim();
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta == null ? null : sta.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCtTm() {
        return ctTm;
    }

    public void setCtTm(Date ctTm) {
        this.ctTm = ctTm;
    }

    public Date getMfTm() {
        return mfTm;
    }

    public void setMfTm(Date mfTm) {
        this.mfTm = mfTm;
    }

    public String getLedgerNameDigest() {
        return ledgerNameDigest;
    }

    public void setLedgerNameDigest(String ledgerNameDigest) {
        this.ledgerNameDigest = ledgerNameDigest == null ? null : ledgerNameDigest.trim();
    }

    public String getLedgerCrdNoDigest() {
        return ledgerCrdNoDigest;
    }

    public void setLedgerCrdNoDigest(String ledgerCrdNoDigest) {
        this.ledgerCrdNoDigest = ledgerCrdNoDigest == null ? null : ledgerCrdNoDigest.trim();
    }

    public String getLedgerIdNoDigest() {
        return ledgerIdNoDigest;
    }

    public void setLedgerIdNoDigest(String ledgerIdNoDigest) {
        this.ledgerIdNoDigest = ledgerIdNoDigest == null ? null : ledgerIdNoDigest.trim();
    }

    public String getLedgerPhoneDigest() {
        return ledgerPhoneDigest;
    }

    public void setLedgerPhoneDigest(String ledgerPhoneDigest) {
        this.ledgerPhoneDigest = ledgerPhoneDigest == null ? null : ledgerPhoneDigest.trim();
    }
}
