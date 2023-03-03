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
public class TblRemitBoss {
    private Long id;

    private String prod;

    private String biz;

    private String mecNo;

    private String reqId;

    private String seqId;

    private String fileUrl;

    private Date occTm;

    private BigDecimal ordAmt;

    private BigDecimal refAmt;

    private BigDecimal dvdAmt;

    private String dvdDetail;

    private String dealStatus;

    private String parseInfo;

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

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public Date getOccTm() {
        return occTm;
    }

    public void setOccTm(Date occTm) {
        this.occTm = occTm;
    }

    public BigDecimal getOrdAmt() {
        return ordAmt;
    }

    public void setOrdAmt(BigDecimal ordAmt) {
        this.ordAmt = ordAmt;
    }

    public BigDecimal getRefAmt() {
        return refAmt;
    }

    public void setRefAmt(BigDecimal refAmt) {
        this.refAmt = refAmt;
    }

    public BigDecimal getDvdAmt() {
        return dvdAmt;
    }

    public void setDvdAmt(BigDecimal dvdAmt) {
        this.dvdAmt = dvdAmt;
    }

    public String getDvdDetail() {
        return dvdDetail;
    }

    public void setDvdDetail(String dvdDetail) {
        this.dvdDetail = dvdDetail == null ? null : dvdDetail.trim();
    }

    public String getDealStatus() {
        return dealStatus;
    }

    public void setDealStatus(String dealStatus) {
        this.dealStatus = dealStatus == null ? null : dealStatus.trim();
    }

    public String getParseInfo() {
        return parseInfo;
    }

    public void setParseInfo(String parseInfo) {
        this.parseInfo = parseInfo == null ? null : parseInfo.trim();
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
