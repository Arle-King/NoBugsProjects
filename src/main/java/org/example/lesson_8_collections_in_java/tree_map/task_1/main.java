package org.example.lesson_8_collections_in_java.tree_map.task_1;

import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Наталья", 25);
        map.put("Гриша", 42);
        map.put("Володя", 5);
        map.put("Нюра", 70);
        map.put("Виталик", 30);

        System.out.println(map);
    }
}
