package org.example.lesson_10.stream_api_grouping.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 5, 10, 11, 15, 56, 100));

        Map<String, List<Integer>> newMap = list.stream()
                .collect(Collectors.groupingBy(x -> {
                    if (x % 2 == 0) {
                        return "Чётное";
                    } else {
                        return "Не чётное";
                    }
                }));

        System.out.println(newMap);
    }

}
