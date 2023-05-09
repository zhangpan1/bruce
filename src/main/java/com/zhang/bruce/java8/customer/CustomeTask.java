package com.zhang.bruce.java8.customer;

import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.github.pagehelper.PageInfo;
import com.zhang.bruce.easyexcel.UserModel;
import org.apache.commons.compress.utils.Lists;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2023/3/10 4:21 下午
 */
public class CustomeTask {
    private static AtomicLong count = new AtomicLong(0);

    public static void main(String[] args) {
        Date date = new Date();
        // 具体执行逻辑
        Consumer<UserModel> consumer = getRelayHandler(date);
        // 模拟分页查询
        findMerchantAll(result -> result.forEach(consumer));
    }

    private static Consumer<UserModel> getRelayHandler(Date date) {
        return customerInfo -> {
            System.out.println(customerInfo.getUserName());
        };
    }
    public static void findMerchantAll(Consumer<List<UserModel>> consumer) {
        new StreamQueryTemplate<UserModel>() {
            @Override
            protected PageInfo<UserModel> doISelect(int pageNum, int pageSize) {
                try {
                    return findMerchantByPage(pageNum, pageSize, Lists.newArrayList());
                } finally {
                    DynamicDataSourceContextHolder.poll();
                }
            }


        }.execute(consumer);
    }
    private static PageInfo<UserModel> findMerchantByPage(int pageNum, int pageSize, ArrayList<Object> newArrayList) {
        PageInfo<UserModel> customerInfoPageInfo = new PageInfo<>();
        List<UserModel> userModelList = Lists.newArrayList();
        for (int i = 0; i < 10; i ++){
            UserModel model = new UserModel();
            model.setAge(i+20);
            model.setBirthday(new Date());
            model.setUserName("大青蛙"+i);
            model.setId((long) i);
            userModelList.add(model);
        }
        count.addAndGet(1);
        // 查询两次退出
        if (count.get() < 2) {
            customerInfoPageInfo.setList(userModelList);
        } else {
            customerInfoPageInfo.setList(Lists.newArrayList());
        }
        return customerInfoPageInfo;
    }
}

