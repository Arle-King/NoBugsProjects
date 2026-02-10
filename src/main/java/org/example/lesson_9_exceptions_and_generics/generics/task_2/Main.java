package org.example.lesson_9_exceptions_and_generics.generics.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str = new String[]{"123", "3113"};
        Integer[] arrInt = new Integer[] {1, 2, 3};

        printArray(str);
        printArray(arrInt);

    }

    public static  <T> void printArray(T[] arr) {
        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
    }
}
