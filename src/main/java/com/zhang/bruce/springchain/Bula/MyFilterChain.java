package com.zhang.bruce.springchain.Bula;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:18 下午
 */
@Service("MyFilterChain")
public class MyFilterChain implements PrepareFilter, ApplicationContextAware {
    private static List<PrepareFilter> prepareFilterList;

    @Override
    public Integer getShort() {
        return 0;
    }

    @Override
    public void doFilter(Myparam myparam, MyFilterChain filterChain, Integer index) {
        index = index + 1;
        if (index < prepareFilterList.size()) {
            prepareFilterList.get(index).doFilter(myparam, filterChain, index);
        } else {
            System.out.println("直接支付");
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, PrepareFilter> serviceMap = applicationContext.getBeansOfType(PrepareFilter.class);
        prepareFilterList = new ArrayList<>(serviceMap.values());
        prepareFilterList = prepareFilterList.stream()
                .sorted(Comparator.comparing(PrepareFilter::getShort))
                .collect(Collectors.toList());

    }
}
