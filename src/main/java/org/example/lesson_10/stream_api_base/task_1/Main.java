package org.example.lesson_10.stream_api_base.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("123", "123456", "12345", "12", "2", "123456789", "serhjfhd", "4561", "741852963123484", ""));

        Stream<String> stream = list.stream()
                .filter(x -> x.length() > 5);

        List<String> newList = stream.toList();

        System.out.println(newList);
    }

}
