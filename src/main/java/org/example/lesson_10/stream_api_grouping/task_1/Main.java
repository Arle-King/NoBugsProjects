package org.example.lesson_10.stream_api_grouping.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("stream", "ssh", "nono", "nan", "srt", "no"));

        Map<Character, List<String>> newMap = list.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));

        System.out.println(newMap);

    }

}
