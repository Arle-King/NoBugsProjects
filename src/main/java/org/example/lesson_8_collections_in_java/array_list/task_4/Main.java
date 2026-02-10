package org.example.lesson_8_collections_in_java.array_list.task_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println(list.stream().mapToInt(x -> x).sum());
    }
}
