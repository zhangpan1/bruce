package com.zhang.bruce.springchain.hui;

import lombok.Data;

/**
 * @description: 定时加灰捞取的实体
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 3:35 下午
 */
@Data
public class PayBean {
    // 纬度 -- 银行卡号，身份证
    private String biz;
    // 卡号
    private String no;
    // 灰名单种类
    private String type;
}
