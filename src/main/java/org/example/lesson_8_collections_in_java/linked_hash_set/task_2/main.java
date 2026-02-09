package org.example.lesson_8_collections_in_java.linked_hash_set.task_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < 3; i++) {
            if (addElement(set, 1)) {
                System.out.println("Елемент добавлен");
            } else {
                System.out.println("Елемент уже в списке");
            }
        }
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
