package org.example.lesson_8_collections_in_java.linked_hash_map.task_1;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Наталья", 25);
        map.put("Гриша", 42);
        map.put("Володя", 5);
        map.put("Нюра", 70);
        map.put("Виталик", 30);

        System.out.println(map);
    }
}
