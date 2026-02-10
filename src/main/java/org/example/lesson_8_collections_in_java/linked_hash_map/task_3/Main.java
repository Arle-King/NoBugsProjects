package org.example.lesson_8_collections_in_java.linked_hash_map.task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Deque<String>> map = new LinkedHashMap<>();
        addHistory(map, "Сергей", "Https");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + E);
            System.out.println();
        });
        System.out.println();

        addHistory(map, "Сергей", "Https");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + E);
            System.out.println();
        });
        System.out.println();

        addHistory(map, "Сергей", "Https//1");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + E);
            System.out.println();
        });
        System.out.println();

        addHistory(map, "Андрей", "Https");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + E);
            System.out.println();
        });
        System.out.println();

        addHistory(map, "Андрей", "Https123456");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + E);
            System.out.println();
        });
        System.out.println();

        addHistory(map, "Сергей", "Https123456");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + E);
            System.out.println();
        });
    }

    public static void addHistory(LinkedHashMap<String, Deque<String>> map, String name, String url) {

        if (!map.containsKey(name)) {
            map.computeIfAbsent(name, x -> new ArrayDeque<>());
        }

        if (map.get(name).size() + 1 > 9) {
            map.get(name).removeFirst();
        }

        map.get(name).add(url);
    }
}
