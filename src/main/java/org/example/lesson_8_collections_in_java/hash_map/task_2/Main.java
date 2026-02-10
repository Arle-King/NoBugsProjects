package org.example.lesson_8_collections_in_java.hash_map.task_2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Наталья", 25);
        map.put("Гриша", 42);
        map.put("Володя", 5);
        map.put("Нюра", 70);
        map.put("Виталик", 30);

        System.out.println(map.containsKey("Володя"));
        System.out.println(map.containsKey("Волод12я"));
    }
}
