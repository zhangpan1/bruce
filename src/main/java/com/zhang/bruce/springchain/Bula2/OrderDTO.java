package com.zhang.bruce.springchain.Bula2;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:37 下午
 */
import java.io.Serializable;


/**
 * @author lishuzhen
 * @createTime 2022年06月19日 22:15:00
 */
public class OrderDTO implements Serializable{
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
