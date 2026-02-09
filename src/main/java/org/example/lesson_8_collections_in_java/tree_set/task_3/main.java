package org.example.lesson_8_collections_in_java.tree_set.task_3;

import java.util.Arrays;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10));
        int x = 5;

        System.out.println(set.higher(x));
        System.out.println(set.lower(x));

    }
}
