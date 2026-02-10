package org.example.lesson_8_collections_in_java.linked_hash_set.task_1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");

        System.out.println(set);
    }
}
