package org.example.lesson_8_collections_in_java.linked_list.task_4;

import java.util.Arrays;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
    }
}
