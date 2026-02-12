package org.example.lesson_10.fun_interfaces_and_lambda.task_4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function = x -> x.length();

        System.out.println(function.apply("123456"));
        System.out.println(function.apply("1"));
        System.out.println(function.apply(""));

    }

}
