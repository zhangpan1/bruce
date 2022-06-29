package com.zhang.bruce.java8.day02.chap5;

import com.zhang.bruce.java8.day02.chap4.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 4:53 下午
 */
public class Mapping {
    public static void main(String[] args) {
        List<String> dishNames = Dish.menu.stream().map(Dish :: getName).collect(Collectors.toList());
        System.out.println(dishNames);

        String[] arrayOfWords = {"Goodbye","World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
        String[] words = {"Hello","World"};
        List<String[]> s = Arrays.stream(words).map(word -> word.split("")).distinct().collect(Collectors.toList());
        System.out.println(s);

        List<String> m =Arrays.stream(words).map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(m);

        // flatMap
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squares);

        List<Integer> number1 = Arrays.asList(1,2,3);
        List<Integer> number2 = Arrays.asList(3,4);

        // flatMap
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(6,7,8);

        List<int[]> pairs1 =
                numbers1.stream()
                        .flatMap((Integer i) -> numbers2.stream()
                                .map((Integer j) -> new int[]{i, j})
                        )
                        .collect(toList());

        List<int[]> pairs =
                numbers1.stream()
                        .flatMap((Integer i) -> numbers2.stream()
                                .map((Integer j) -> new int[]{i, j})
                        )
                        .filter(pair -> (pair[0] + pair[1]) % 3 == 0)
                        .collect(toList());
        pairs.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
    }
}
