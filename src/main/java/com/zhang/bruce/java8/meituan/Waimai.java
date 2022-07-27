package com.zhang.bruce.java8.meituan;

/**
 * @description: 外卖策略
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/5 5:00 下午
 */
// 外卖策略
class Waimai implements Strategy{

    @Override
    public void issue(Object... params) {

    }
}
// 酒旅策略
class Hotel implements Strategy{

    @Override
    public void issue(Object... params) {

    }
}
// 美食策略
class Food implements Strategy{

    @Override
    public void issue(Object... params) {

    }
}
// 使用分支判断获取的策略上下文
class StrategyContext{
    public static Strategy getStrategy(String rewardType) {
        switch (rewardType) {
            case "Waimai":
                return new Waimai();
            case "Hotel":
                return new Hotel();
            case "Food":
                return new Food();
            default:
                throw new IllegalArgumentException("rewardType error!");
        }
    }
}
// 优化后的策略服务
class RewardService {
    public void issueReward(String rewardType, Object ... params) {
        Strategy strategy = StrategyContext.getStrategy(rewardType);
        strategy.issue(params);
    }
}
