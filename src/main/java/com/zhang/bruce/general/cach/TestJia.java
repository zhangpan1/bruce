package com.zhang.bruce.general.cach;


/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/2/16 5:56 下午
 */
public class TestJia {
    public static void main(String[] args) {
        // 锁住判断幂等数据
        System.out.println("开始消费");
        System.out.println("加锁");
        System.out.println("判断redis是否有缓存，有就返回不处理，没有就存redids");
        System.out.println("释放锁");
        System.out.println("业务步骤1");
        System.out.println("业务步骤2");
        System.out.println("业务步骤3");
        System.out.println("redis 删除缓存");

        // 锁住业务代码
        System.out.println("开始消费");

        System.out.println("判断是否已经处理（数据库/or 其他标识）");
        System.out.println("业务步骤1");
        System.out.println("业务步骤2");
        System.out.println("业务步骤3");
        System.out.println("redis 删除缓存");


        // 锁住业务代码

        System.out.println("开始消费");
        System.out.println("加锁");
        System.out.println("判断是否已经处理（数据库/or 其他标识）");
        System.out.println("业务步骤1");
        System.out.println("业务步骤2");
        System.out.println("业务步骤3");
        System.out.println("释放锁");



    }

}
