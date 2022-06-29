package com.zhang.bruce.java8.day01.chap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @description: some desc
 * @email: pan.zhang@yeepay.com
 * @date: 2022/6/23 10:08 上午
 */
public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple(80,"green"), new Apple(155, "green"), new Apple(120, "red"));

        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]
        List<Apple> greenApples = filterApplesByColor(inventory, "green");
        System.out.println(greenApples);

        // [Apple{color='red', weight=120}]
        List<Apple> redApples = filterApplesByColor(inventory, "red");
        System.out.println(redApples);

        List<Apple> redApples1 = filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple a) {
                return "red".equals(a.getColor());
            }
        });
        System.out.println(redApples1);

        List<Apple> result = filterApples(inventory,(Apple apple) -> "red".equals(apple.getColor()));
        System.out.println(result);
        inventory.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        inventory.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Wold");
            }
        });
        Thread b = new Thread(() -> System.out.println("Hello World"));
    }
    public static List<Apple> filterApples(List<Apple> inventory,ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByColor(List<Apple> inventory,String color){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.color.equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getWeight() > weight){
                result.add(apple);
            }
        }
        return result;
    }



    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
    interface ApplePredicate{
        public boolean test(Apple a);
    }
    static class AppleWeightPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return apple.getWeight() > 150;
        }
    }
    static class AppleColorPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "green".equals(apple.getColor());
        }
    }

    static class AppleRedAndHeavyPredicate implements ApplePredicate{
        public boolean test(Apple apple){
            return "red".equals(apple.getColor())
                    && apple.getWeight() > 150;
        }
    }

    public interface AppleFormatter{
        String accept(Apple a);
    }
    public class AppleFancyFormatter implements AppleFormatter{

        @Override
        public String accept(Apple a) {
            String characteristic = a.getWeight() > 150 ? "heavy" : "light";
            return "A" + characteristic + "" + a.getColor() + " apple";
        }
    }
}
