package org.example.lesson_8_collections_in_java.tree_set.task_2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            if (addElement(set, 1)) {
                System.out.println("Елемент добавлен");
            } else {
                System.out.println("Елемент уже в дереве");
            }
        }

        System.out.println(set);
    }

    public static boolean addElement(Set<Integer> set, int element) {
        if (set.contains(element)) {
            return false;
        } else {
            set.add(element);
            return true;
        }
    }
}
