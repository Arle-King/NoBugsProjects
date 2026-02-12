package org.example.lesson_10.stream_api_base.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("123", "123456", "12345", "12", "2", "123456789", "serhjfhd", "4561", "741852963123484", ""));

        List<Integer> newList = list.stream()
                .map(x -> x.length())
                .toList();

        System.out.println(newList);
    }

}
