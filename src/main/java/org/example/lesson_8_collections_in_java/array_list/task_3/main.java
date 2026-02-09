package org.example.lesson_8_collections_in_java.array_list.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Sttring",
                "Cat",
                "dada",
                "sedxfcgvhbjnkml,;",
                "ndjfndjnfjll"));

        AtomicReference<String> max = new AtomicReference<>("");

        list.forEach(x -> {
            if (x.length() > max.get().length()) max.set(x);
        });

        System.out.println(max);
    }


}
