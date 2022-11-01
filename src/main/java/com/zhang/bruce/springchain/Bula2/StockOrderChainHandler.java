package com.zhang.bruce.springchain.Bula2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 订单提交-库存计算处理器
 *
 * @author lishuzhen
 * @createTime 2022年06月19日 22:57:00
 */
@Service
@Order(100)
public class StockOrderChainHandler extends AbstractOrderChainHandler {
    /**
     * 执行过滤方法
     *
     * @param orderDTO
     * @return
     */
    @Override
    protected ResultDTO doFilter(OrderDTO orderDTO) {
        System.out.println("库存计算处理");
        return doNextHandler(orderDTO, ResultDTO.ok());
    }
}
