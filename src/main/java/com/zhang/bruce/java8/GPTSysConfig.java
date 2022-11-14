package com.zhang.bruce.java8;

import java.io.Serializable;
import java.util.Date;

public class GPTSysConfig implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 系统配置ID
     */
    private Integer sysType;

    /**
     * 菜单项名称
     */
    private String typeName;

    /**
     * 类型名称
     */
    private String sysTypeName;

    /**
     * 代码
     */
    private String sysCode;

    /**
     * 枚举value
     */
    private String sysName;

    /**
     * 所属菜单
     */
    private String sysMenu;

    /**
     * 参数范围
     */
    private String sysScope;

    /**
     * 排序下标
     */
    private Integer indexNo;

    /**
     * 配置状态 0：停用；1：启用
     */
    private Integer sysStatus;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSysType() {
        return sysType;
    }

    public void setSysType(Integer sysType) {
        this.sysType = sysType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getSysTypeName() {
        return sysTypeName;
    }

    public void setSysTypeName(String sysTypeName) {
        this.sysTypeName = sysTypeName == null ? null : sysTypeName.trim();
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode == null ? null : sysCode.trim();
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName == null ? null : sysName.trim();
    }

    public String getSysMenu() {
        return sysMenu;
    }

    public void setSysMenu(String sysMenu) {
        this.sysMenu = sysMenu == null ? null : sysMenu.trim();
    }

    public String getSysScope() {
        return sysScope;
    }

    public void setSysScope(String sysScope) {
        this.sysScope = sysScope == null ? null : sysScope.trim();
    }

    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public Integer getSysStatus() {
        return sysStatus;
    }

    public void setSysStatus(Integer sysStatus) {
        this.sysStatus = sysStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sysType=").append(sysType);
        sb.append(", typeName=").append(typeName);
        sb.append(", sysTypeName=").append(sysTypeName);
        sb.append(", sysCode=").append(sysCode);
        sb.append(", sysName=").append(sysName);
        sb.append(", sysMenu=").append(sysMenu);
        sb.append(", sysScope=").append(sysScope);
        sb.append(", indexNo=").append(indexNo);
        sb.append(", sysStatus=").append(sysStatus);
        sb.append(", remark=").append(remark);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
