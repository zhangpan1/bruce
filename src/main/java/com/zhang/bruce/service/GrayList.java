package com.zhang.bruce.service;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/7/12 11:36 上午
 */
public class GrayList {
    public static void main(String[] args) {

        String bankCardName = "菲璐娅·外力哈";

        if (bankCardName.endsWith("公司")) {
            System.out.println("unlegalPublic");
        } else if (bankCardName.contains("·")) {
            // 包含点时，认为是新疆人
            System.out.println("unlegalPrivate");
        } else if (bankCardName.length() > 5) {
            System.out.println("unlegalPublic");

        } else {
            System.out.println("unlegalPrivate");
        }
    }


}
