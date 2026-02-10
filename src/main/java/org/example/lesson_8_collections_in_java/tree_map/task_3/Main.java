package org.example.lesson_8_collections_in_java.tree_map.task_3;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(25, "Наталья");
        map.put(42, "Гриша");
        map.put(5, "Володя");
        map.put(70, "Нюра");
        map.put(30, "Виталик");

        int x = 70;

        Integer key = map.higherKey(x);

        if (key == null) {
            System.out.println("Выше нет");
        } else {
            System.out.println(map.get(map.higherKey(x)));
        }
    }
}
