package org.example.lesson_10.stream_api_base.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 5, 10, 11, 15, 56, 100));

        List<Integer> newList = list.stream()
                .map(x -> x * x)
                .toList();

        System.out.println(newList);
    }

}
