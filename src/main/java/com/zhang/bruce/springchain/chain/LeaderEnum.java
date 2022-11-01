package com.zhang.bruce.springchain.chain;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:41 上午
 */
public enum LeaderEnum {
    TEAM_LEADER(0,"组长"),
    SUPERVISOR_LEADER(1,"主管"),
    BOSS_LEADER(2,"老板");

    LeaderEnum(int code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    private int code;
    private String remark;

    public int getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }
}
