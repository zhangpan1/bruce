package com.zhang.bruce.java8.day02.chap5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 6:28 下午
 */
public class PuttingIntoPractice {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        // 1.找出2011年发生的所有交易，并按照交易额排序（从低到高）
        List<Transaction> tr2011 = transactions.stream().filter(
                transaction -> transaction.getYear() == 2011
        ).sorted(comparing(Transaction :: getValue)).collect(Collectors.toList());
        // 2.交易员都在哪些不同的城市呆过
        List<String> cityes = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
        System.out.println(cityes);

    }
}
