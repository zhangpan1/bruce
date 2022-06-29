package com.zhang.bruce.java8.day02.chap5;

import com.zhang.bruce.java8.day02.chap4.Dish;

import java.util.Optional;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 5:13 下午
 */
public class Finding {
    public static void main(String[] args) {
        if (Dish.menu.stream().anyMatch(Dish :: isVegetarian)) {
            System.out.println("This menu is (somewahat) vegetarian friendly !!");
        }
        boolean isHealthy = Dish.menu.stream().allMatch(d -> d.getCalories() >= 1000);
        System.out.println(isHealthy);

        Optional<Dish> dish = Dish.menu.stream().filter(Dish :: isVegetarian).findAny();


    }
}
