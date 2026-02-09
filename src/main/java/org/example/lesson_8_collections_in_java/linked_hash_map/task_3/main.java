package org.example.lesson_8_collections_in_java.linked_hash_map.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {
        LinkedHashMap<String, String[]> map = new LinkedHashMap<>();
        addHistory(map, "Сергей", "Https");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + Arrays.toString(E));
        });
        addHistory(map, "Сергей", "Https");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + Arrays.toString(E));
        });
        addHistory(map, "Сергей", "Https//1");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + Arrays.toString(E));
        });
        addHistory(map, "Андрей", "Https");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + Arrays.toString(E));
        });
        addHistory(map, "Андрей", "Https123456");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + Arrays.toString(E));
        });
        addHistory(map, "Сергей", "Https123456");
        map.forEach((K, E) -> {
            System.out.println("Значения в map: ");
            System.out.print("Ключ: " + K + " Значения: " + Arrays.toString(E));
        });
    }

    public static void addHistory(LinkedHashMap<String, String[]> map, String name, String url) {
        if (!map.isEmpty() && map.containsKey(name) && map.get(name).length > 9) {
            System.out.println("Места нет");
        } else {
            List<String> arr = new ArrayList<>();
            if (!map.isEmpty() && map.containsKey(name) && map.get(name).length > 0) {
                arr.addAll(List.of(map.get(name)));
            }
            arr.add(url);
            map.put(name, arr.toArray(new String[0]));
            System.out.println();
            System.out.println("Сайт добавлен");
        }
    }


}
