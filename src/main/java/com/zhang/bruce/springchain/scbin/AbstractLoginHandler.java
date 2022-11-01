package com.zhang.bruce.springchain.scbin;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/10/14 11:49 上午
 */
public abstract class AbstractLoginHandler<T> {
    /**
     * 责任链，下一个链接节点
     */
    protected AbstractLoginHandler<T> next = null;
    /**
     * 内部逻辑
     * @param loginDTO 登录DTO
     */
    public abstract String doHandler(LoginDTO loginDTO) throws Exception;

    public void next(AbstractLoginHandler handler) {
        this.next = handler;
    }
    public static class Builder<T> {
        private AbstractLoginHandler<T> head;
        private AbstractLoginHandler<T> tail;

        public Builder<T> addHandler(AbstractLoginHandler handler) {
            if (this.head == null) {
                this.head = handler;
                this.tail = handler;
            } else {
                this.tail.next(handler);
                this.tail = handler;
            }
            return this;
        }

        public AbstractLoginHandler build() {
            return this.head;
        }
    }
}
