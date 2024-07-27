package com.zhang.bruce.data.season1;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * @description: 将所有的商户信息进行拆分存储，然后再进行分组
 * @email: pan.zhang@yeepay.com
 * @date: 2024/3/6 7:30 下午
 */
public class NotifiEventGroupDTO {
    // 事件id
    private String eventId;
    // 商编
    private String customernumber;
    // 签约名(合同上）
    private String signedname;
    // 商户等级
    private String customerLevel;

    // 销售名称
    private String salesname;

    // 销售名称--拼音，发送飞书用
    private String salesUserName;

    // 收单金额
    private BigDecimal receiptAmount = new BigDecimal("0");
    // 处置类型，1立即处理，2为延迟处理
    private String handType;

    // 风险处理详情--止收止付止结算等
    private String dealType;

    // 操作人
    private String createUser;
    // 父商户编号
    private String agentcode;
    // 父商户签约名
    private String agentname;
    // 预关闭日期
    private Date delayDate;
    // 自定义关闭产品code
    private String productCategoryCode;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    public String getSignedname() {
        return signedname;
    }

    public void setSignedname(String signedname) {
        this.signedname = signedname;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getSalesname() {
        return salesname;
    }

    public void setSalesname(String salesname) {
        this.salesname = salesname;
    }

    public BigDecimal getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(BigDecimal receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public String getHandType() {
        return handType;
    }

    public void setHandType(String handType) {
        this.handType = handType;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getSalesUserName() {
        return salesUserName;
    }

    public void setSalesUserName(String salesUserName) {
        this.salesUserName = salesUserName;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public Date getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(Date delayDate) {
        this.delayDate = delayDate;
    }

    public String getProductCategoryCode() {
        return productCategoryCode;
    }

    public void setProductCategoryCode(String productCategoryCode) {
        this.productCategoryCode = productCategoryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotifiEventGroupDTO that = (NotifiEventGroupDTO) o;
        return customernumber.equals(that.customernumber) && customerLevel.equals(that.customerLevel) && salesname.equals(that.salesname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customernumber, customerLevel, salesname);
    }
}
