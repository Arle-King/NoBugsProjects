package org.example.lesson_10.stream_api_base.task_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 5, 1, 11, 5, 56, 1));

        List<Integer> newList = list.stream()
                .distinct()
                .toList();

        System.out.println(newList);
    }

}
