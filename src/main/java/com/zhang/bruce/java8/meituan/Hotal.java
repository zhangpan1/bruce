package com.zhang.bruce.java8.meituan;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/5 5:20 下午
 */
// 策略上下文，用于管理策略的注册和获取
class StrategyContext1 {
    private static final Map<String, Strategy> registerMap = new HashMap<>();
    // 注册策略
    public static void registerStrategy(String rewardType, Strategy strategy) {
        registerMap.putIfAbsent(rewardType, strategy);
    }
    // 获取策略
    public static Strategy getStrategy(String rewardType) {
        return registerMap.get(rewardType);
    }
}
// 抽象策略类
abstract class AbstractStrategy implements Strategy {
    // 类注册方法
    public void register() {
        StrategyContext1.registerStrategy(getClass().getSimpleName(), this);
    }
    void handle(String s){
        String[] strings = s.split(",");
        for (String s11 : strings) {
            System.out.println(s11);
        };
    }
}

// 单例外卖策略
class Waimai1 extends AbstractStrategy implements Strategy {
    private static final Waimai instance = new Waimai();
    //private WaimaiService waimaiService;
    Waimai1() {
        register();
    }
    public static Waimai getInstance() {
        return instance;
    }
    @Override
    public void issue(Object... params) {
//        WaimaiRequest request = new WaimaiRequest();
//        // 构建入参
//        request.setWaimaiReq(params);
//        waimaiService.issueWaimai(request)
//  ;
    }
}
// 单例酒旅策略
class Hotel1 extends AbstractStrategy implements Strategy {
    private static final Hotel instance = new Hotel();
    //private HotelService hotelService;
    private Hotel1() {
        register();
    }
    public static Hotel getInstance() {
        return instance;
    }
    @Override
    public void issue(Object... params) {
//        HotelRequest request = new HotelRequest();
//        request.addHotelReq(params);
//        hotelService.sendPrize(request);
    }
}
// 单例美食策略
 class Food1 extends AbstractStrategy implements Strategy {
    private static final Food instance = new Food();
    // private FoodService foodService;
    Food1() {
        register();
    }
    public static Food getInstance() {
        return instance;
    }
    @Override
    public void issue(Object... params) {
//        FoodRequest request = new FoodRequest(params);
//        foodService.payCoupon(request);
        handle((String) params[0]);



    }




}

class Test{
    public static void main(String[] args) {
        Waimai1 waimai = new Waimai1();
        Food1 food1 = new Food1();
        Strategy strategy = StrategyContext1.getStrategy("Food1");

        strategy.issue("nihao,woshi,bengdan");

        System.out.println(strategy.getClass());
    }
}
