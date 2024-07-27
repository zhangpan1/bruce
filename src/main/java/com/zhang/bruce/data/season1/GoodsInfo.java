package com.zhang.bruce.data.season1;

import java.io.Serializable;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2024/4/16 2:52 下午
 */
public class GoodsInfo implements Serializable {
    // 风险处理详情--止收止付止结算等
    private String dealType;

    // 操作人
    private String createUser;
    // 父商户编号
    private String agentcode;

    private String goodInfo;

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
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

    public String getGoodInfo() {
        return goodInfo;
    }

    public void setGoodInfo(String goodInfo) {
        this.goodInfo = goodInfo;
    }
}
