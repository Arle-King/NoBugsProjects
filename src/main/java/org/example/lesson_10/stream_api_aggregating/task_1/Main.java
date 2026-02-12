package org.example.lesson_10.stream_api_aggregating.task_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 11, 5, 15, 56, 1, 100));

        int newList = list.stream()
                .max(Integer::compare)
                .get();

        System.out.println(newList);
    }

}
