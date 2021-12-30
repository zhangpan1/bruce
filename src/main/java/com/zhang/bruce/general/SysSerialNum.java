package com.zhang.bruce.general;

import java.util.Date;

/**
 * 流水号表
 * 
 * @author wcyong
 * 
 * @date 2021-12-30
 */
public class SysSerialNum {
    private Long id;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 模块代码
     */
    private String moduleCode;

    /**
     * 序列号模块
     */
    private String configTemplate;

    /**
     * 当前序列号的值
     */
    private Integer currentSerial;

    /**
     * 每次预生产的数量
     */
    private Integer preMaxNum;

    /**
     * 每次增加的数据
     */
    private Integer autoIncrementNum;

    /**
     * 序列号的长度
     */
    private Integer dataWidth;

    private Date inputDate;

    private Date modifyDate;

    private Integer modifyUserId;

    private Long inputUserId;

    /**
     * 数据状态
     */
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public String getConfigTemplate() {
        return configTemplate;
    }

    public void setConfigTemplate(String configTemplate) {
        this.configTemplate = configTemplate == null ? null : configTemplate.trim();
    }

    public Integer getCurrentSerial() {
        return currentSerial;
    }

    public void setCurrentSerial(Integer currentSerial) {
        this.currentSerial = currentSerial;
    }

    public Integer getPreMaxNum() {
        return preMaxNum;
    }

    public void setPreMaxNum(Integer preMaxNum) {
        this.preMaxNum = preMaxNum;
    }

    public Integer getAutoIncrementNum() {
        return autoIncrementNum;
    }

    public void setAutoIncrementNum(Integer autoIncrementNum) {
        this.autoIncrementNum = autoIncrementNum;
    }

    public Integer getDataWidth() {
        return dataWidth;
    }

    public void setDataWidth(Integer dataWidth) {
        this.dataWidth = dataWidth;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Integer modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Long getInputUserId() {
        return inputUserId;
    }

    public void setInputUserId(Long inputUserId) {
        this.inputUserId = inputUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}