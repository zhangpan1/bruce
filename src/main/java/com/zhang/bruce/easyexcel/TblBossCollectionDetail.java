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
public class TblBossCollectionDetail {
    private Long id;

    private String prod;

    private String biz;

    private String mecNo;

    private String reqId;

    private String seqId;

    private String cooReqId;

    private BigDecimal amt;

    private String prodName;

    private String payWay;

    private String crdNo;

    private String crdType;

    private String bnkId;

    private String usrId;

    private String goodsNm;

    private Date occTm;

    private Date ctTm;

    private Date mfTm;

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

    public String getCooReqId() {
        return cooReqId;
    }

    public void setCooReqId(String cooReqId) {
        this.cooReqId = cooReqId == null ? null : cooReqId.trim();
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public String getCrdNo() {
        return crdNo;
    }

    public void setCrdNo(String crdNo) {
        this.crdNo = crdNo == null ? null : crdNo.trim();
    }

    public String getCrdType() {
        return crdType;
    }

    public void setCrdType(String crdType) {
        this.crdType = crdType == null ? null : crdType.trim();
    }

    public String getBnkId() {
        return bnkId;
    }

    public void setBnkId(String bnkId) {
        this.bnkId = bnkId == null ? null : bnkId.trim();
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId == null ? null : usrId.trim();
    }

    public String getGoodsNm() {
        return goodsNm;
    }

    public void setGoodsNm(String goodsNm) {
        this.goodsNm = goodsNm == null ? null : goodsNm.trim();
    }

    public Date getOccTm() {
        return occTm;
    }

    public void setOccTm(Date occTm) {
        this.occTm = occTm;
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
}
