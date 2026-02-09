package org.example.lesson_8_collections_in_java.array_list.task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.forEach(x -> {
            if (x % 2 == 0) System.out.println(x);
        });
    }


}
