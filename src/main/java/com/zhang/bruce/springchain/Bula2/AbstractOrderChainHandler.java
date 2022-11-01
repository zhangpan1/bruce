package com.zhang.bruce.springchain.Bula2;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 2:38 下午
 */
public abstract class AbstractOrderChainHandler {
    private AbstractOrderChainHandler nextHandler;

    /**
     * 执行过滤方法
     *
     * @param orderDTO
     * @return
     */
    abstract protected ResultDTO doFilter(OrderDTO orderDTO);

    /**
     * 执行下一个处理器
     *
     * @param orderDTO
     * @param resultDTO
     * @return
     */
    protected ResultDTO doNextHandler(OrderDTO orderDTO, ResultDTO resultDTO) {
        if (nextHandler == null) {
            return resultDTO;
        }
        return nextHandler.doFilter(orderDTO);
    }

    public void setNextHandler(AbstractOrderChainHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
