package org.example.lesson_10.fun_interfaces_and_lambda.task_5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;

        consumer.accept("Hello, world!");
        consumer.accept("Hello, world123!");
        consumer.accept("H24352354world!");
    }

}
