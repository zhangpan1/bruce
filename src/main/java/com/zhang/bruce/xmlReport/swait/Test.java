package com.zhang.bruce.xmlReport.swait;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/3/25 5:50 下午
 */
public class Test {
    public static void main(String[] args) {
        // 交易对手数据清理
        String product = "TRANSFER";
        switch (product){
            case "TRANSFER":
            case "G3MEMBER_TRANSFER":
            case "ACCOUNT":
                System.out.println("搞对了");
                break;
            default:
                System.out.println("搞错了");
        }

    }
}
