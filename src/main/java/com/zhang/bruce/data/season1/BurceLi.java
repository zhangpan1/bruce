package com.zhang.bruce.data.season1;

import com.google.common.collect.Maps;
import org.apache.catalina.User;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @description: some desc
 * @author: bruce
 * @email: zhangpan380@gmail.com
 * @date: 2022/3/4 10:23 上午
 */
public class BurceLi {
    public static void main(String[] args) {

        Map<String, User> list = Maps.newConcurrentMap();
        List<String> userNo = list.values().stream().map(User::getUsername).collect(Collectors.toList());
        // 这个的表达式咋写的 TODO
        Map<String, List<User>> users = Maps.newHashMap();
        List<String> useList = users.values().stream().flatMap(Collection::stream).map(User::getUsername).collect(Collectors.toList());

    }
}
