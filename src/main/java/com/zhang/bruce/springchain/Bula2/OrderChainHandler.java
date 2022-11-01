package com.zhang.bruce.springchain.Bula2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * 订单处理责任链
 *
 * @author lishuzhen
 * @createTime 2022年06月19日 23:05:00
 */
@Service
public class OrderChainHandler {

    @Autowired
    private List<AbstractOrderChainHandler> chain;

    private AbstractOrderChainHandler firstHandler;


    @PostConstruct
    private void constructChain() {
        if (chain == null || chain.size() == 0) {
            throw new RuntimeException("not found order chain handler");
        }
        firstHandler = chain.get(0);
        for (int i = 0; i < chain.size(); i++) {
            if (i == chain.size() - 1) {
                chain.get(i).setNextHandler(null);
            } else {
                chain.get(i).setNextHandler(chain.get(i + 1));
            }
        }
    }

    public ResultDTO executionChain(OrderDTO orderDTO) {
        return firstHandler.doFilter(orderDTO);
    }
}
