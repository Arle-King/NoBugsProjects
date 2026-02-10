package org.example.lesson_8_collections_in_java.linked_list.task_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ListIterator<Integer> it = list.listIterator(0);

        System.out.println("Вперёд: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println("Обратно: ");
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}
