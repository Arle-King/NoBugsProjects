package org.example.lesson_8_collections_in_java.hash_set.task_2;

import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }

        System.out.println(set);

        int x = 22;

        System.out.println(set.contains(x));
    }
}
