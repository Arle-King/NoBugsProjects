package org.example.lesson_8_collections_in_java.array_list.task_5;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 50, 7, 8, 9, 10));
        int max = list.getFirst();

        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) max = list.get(i);
        }

        System.out.println(max);
    }
}
