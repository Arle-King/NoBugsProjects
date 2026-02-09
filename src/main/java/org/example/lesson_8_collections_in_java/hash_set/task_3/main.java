package org.example.lesson_8_collections_in_java.hash_set.task_3;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Set<String> set;
        List<String> list = new ArrayList<>(Arrays.asList(
                "Sttring",
                "Cat",
                "dada",
                "sedxfcgvhbjnkml,;",
                "dada",
                "ndjfndjnfjll"));


        set = toSet(list);

        System.out.println(set);
    }

    public static Set<String> toSet(List<String> list) {
        return new HashSet<>(list);
    }
}
