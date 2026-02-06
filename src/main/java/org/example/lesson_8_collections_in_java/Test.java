package org.example.lesson_8_collections_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("23r");
        list.add("23213r");
        list.add("231231231233r");

        Collections.reverse(list);

        list.forEach(System.out::println);



    }
}
