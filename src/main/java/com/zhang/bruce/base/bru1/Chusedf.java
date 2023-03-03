package com.zhang.bruce.base.bru1;

import com.yeepay.g3.utils.gmcrypt.utils.SMUtils;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/1/30 5:20 下午
 */
public class Chusedf {
    public static void main(String[] args) {
        SMUtils.init();
        String s = SMUtils.encrypt("6225880460005534");
        System.out.println(s);
        System.out.println(SMUtils.decrypt(s));

    }
}
