package com.zhang.bruce.java8.day01.chap3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 11:31 上午
 */
public class ExecuteAround {
    public static void main(String... args) throws IOException {

        // method we want to refactor to make more flexible
//        String result = processFileLimited();
//        System.out.println(result);
//
//        System.out.println("---");
//
//        String oneLine = processFile((BufferedReader b) -> b.readLine());
//        System.out.println(oneLine);
//
//        String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
//        System.out.println(twoLines);
//
        IntePredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        IntePredicate oddNumbers = (int i) -> i % 2 == 0;
        System.out.println(oddNumbers.test(1000));

    }

    public static String processFileLimited() throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("lambdasinaction/chap3/data.txt"))) {
            return br.readLine();
        }
    }


    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("lambdasinaction/chap3/data.txt"))) {
            return p.process(br);
        }

    }

    public interface BufferedReaderProcessor {
        public String process(BufferedReader b) throws IOException;

    }

    public interface IntePredicate {
        boolean test(int t);
    }
}
