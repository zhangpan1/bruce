package com.zhang.bruce.java8.day02.chap5;

import java.util.stream.Stream;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 4:46 下午
 */
public class BuildingStreams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java 8", "Lambdas", "In", "Action");
        stream.map(String :: toUpperCase).forEach(System.out:: println);


    }
}
