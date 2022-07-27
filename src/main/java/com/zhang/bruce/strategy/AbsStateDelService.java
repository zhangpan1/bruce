package com.zhang.bruce.strategy;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/7/27 4:35 下午
 * 抽象处理
 */
public abstract class AbsStateDelService implements ProcessService{
    /**
     * 注册服务所用并发容器
     */
    private static Map<String, ProcessService> processServiceMap = new ConcurrentHashMap<String, ProcessService>();

    @PostConstruct
    public void register() {
        for (String strategy : getStrategyList()) {
            processServiceMap.put(strategy, this);
        }
    }
    /**
     * 根据"服务编码[链路_状态]"获取注册的服务<br/>
     * 〈功能详细描述〉 <br>
     * 1、首先根据link加“_”加状态寻找服务，找到返回。 2、若1步未找到，直接根据link找整条链路通用服务。 3、以上两步均未找到，抛出“找不到服务”异常。
     *
     * @param link 链路名
     * @param state 状态名
     * @return 被锁定服务
     * @since 2.15.0
     */
    public static ProcessService getInstance(String link, String state) {
        ProcessService ps = processServiceMap.get(link + "_" + state);
        if (null == ps) {
            ps = processServiceMap.get(link);
        }
        if (null != ps) {
            return ps;
        }
       throw new RuntimeException("不存在");
    }

    // 子类继承后填写注册服务编码
    protected abstract List<String> getStrategyList();
}
