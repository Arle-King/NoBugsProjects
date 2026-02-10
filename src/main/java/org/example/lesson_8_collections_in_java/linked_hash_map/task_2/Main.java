package org.example.lesson_8_collections_in_java.linked_hash_map.task_2;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Сергей", "+7 (800) 555-35-35");

        System.out.println(map.get("Сергей"));
    }
}
