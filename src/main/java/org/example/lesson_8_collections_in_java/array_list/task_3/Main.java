package org.example.lesson_8_collections_in_java.array_list.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Sttring",
                "Cat",
                "dada",
                "sedxfcgvhbjnkml,;",
                "ndjfndjnfjll"));

        System.out.println(list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(""));
    }


}
