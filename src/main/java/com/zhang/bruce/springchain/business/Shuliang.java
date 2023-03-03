package com.zhang.bruce.springchain.business;

import com.yeepay.g3.utils.common.encrypt.AES;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/11/8 2:11 下午
 */
public class Shuliang {
    public static void main(String[] args) {
        System.out.println(AES.decryptFromBase64("cmG3zuMnxveL3TJ08SBXQQ==", "I am a fool, OK?"));
        System.out.println(AES.encryptToBase64("123456", "I am a fool, OK?"));
    }
    //System.out.println(AES.decryptFromBase64("cmG3zuMnxveL3TJ08SBXQQ==", "I am a fool, OK?"));
}
