package org.example.lesson_10.fun_interfaces_and_lambda.task_3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;

        System.out.println(predicate.test(4));
        System.out.println(predicate.test(3));
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(10));
    }

}
