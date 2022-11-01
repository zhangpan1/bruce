package com.zhang.bruce.springchain.hui;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 4:02 下午
 */
public class MyProcessChain implements PrepareProcess, ApplicationContextAware {
    private static List<PrepareProcess> prepareFilterList;

    @Override
    public Integer getShort() {
        return 0;
    }

    @Override
    public void doProcess(List<PayBean> payBeans, MyProcessChain processChain, Integer index) {
        index = index + 1;
        if (index < prepareFilterList.size()) {
            prepareFilterList.get(index).doProcess(payBeans, processChain, index);
        } else {
            System.out.println("直接支付");
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PrepareProcess> serviceMap = applicationContext.getBeansOfType(PrepareProcess.class);
        prepareFilterList = new ArrayList<>(serviceMap.values());
        prepareFilterList = prepareFilterList.stream()
                .sorted(Comparator.comparing(PrepareProcess::getShort))
                .collect(Collectors.toList());

    }
}
