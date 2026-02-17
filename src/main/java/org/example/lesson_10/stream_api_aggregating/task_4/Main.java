package org.example.lesson_10.stream_api_aggregating.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("123", "123456", "Б12345", "12", "2", "Б123456789", "serhjfhd", "Б4561", "741852963123484", ""));

        String firstB = list.stream()
                .filter(el -> el.startsWith("Б"))
                .findFirst()
                .orElse("");

        System.out.println(firstB);
    }

}
