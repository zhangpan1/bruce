package com.zhang.bruce.java8.merchant;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
import java.util.List;

/**
 *
 *
 * @author jhm
 *
 * @date 2019-07-30
 */
public class MerchantChecklistUpload {
    private Long id;

    private String uploadType;

    private String autoRiskDeal;

    private String merchantId;

    private String remark;

    private String uploadName;

    private String  delayMessage;

    private String  updateKyc;
    private Date createDate;
    private Date updateDate;

    private String uploadMan;

    private String checkId;
    private List<String> uploadList;

    private Integer pageNum;
    private Integer pageSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUploadType() {
        return uploadType;
    }

    public void setUploadType(String uploadType) {
        this.uploadType = uploadType == null ? null : uploadType.trim();
    }

    public String getAutoRiskDeal() {
        return autoRiskDeal;
    }

    public void setAutoRiskDeal(String autoRiskDeal) {
        this.autoRiskDeal = autoRiskDeal == null ? null : autoRiskDeal.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName == null ? null : uploadName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUploadMan() {
        return uploadMan;
    }

    public void setUploadMan(String uploadMan) {
        this.uploadMan = uploadMan == null ? null : uploadMan.trim();
    }
    public List<String> getUploadList() {
		return uploadList;
	}

	public void setUploadList(List<String> uploadList) {
		this.uploadList = uploadList;
	}

	public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

    public String getDelayMessage() {
        return delayMessage;
    }

    public void setDelayMessage(String delayMessage) {
        this.delayMessage = delayMessage;
    }

    public String getUpdateKyc() {
        return updateKyc;
    }

    public void setUpdateKyc(String updateKyc) {
        this.updateKyc = updateKyc;
    }
}
