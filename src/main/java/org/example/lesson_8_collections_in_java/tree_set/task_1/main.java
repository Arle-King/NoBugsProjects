package org.example.lesson_8_collections_in_java.tree_set.task_1;

import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

    }
}
