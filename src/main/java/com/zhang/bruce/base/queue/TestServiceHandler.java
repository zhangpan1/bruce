package com.zhang.bruce.base.queue;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/7/3 11:48 上午
 */
public class TestServiceHandler  implements QueueTaskHandler {
    // ******* start 这一段并不是必要的，这是示范一个传值的方式
    private String domain;

    private String  month;

    public TestServiceHandler(String domain, String month) {
        this.domain = domain;
        this.month = month;
    }


    // 这里也就是我们实现QueueTaskHandler的处理接口
    @Override
    public void processData() {
        // 可以去做你想做的业务了
        // 这里需要引用spring的service的话，我写了一个工具类，下面会贴出来
        // ItestService testService = SpringUtils.getBean(ItestService.class);
        System.out.println("name > " + domain + "," + "age > " + month);
    }
}
