package org.example.lesson_10.stream_api_grouping.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 5, 10, 11, 15, 56, 100));

        Double average = list.stream()
                .mapToInt(x -> (int)x)
                .average()
                .getAsDouble();

        System.out.println(average);
    }

}
