package org.example.lesson_8_collections_in_java.array_deque.task_2;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.add(5);

        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.pollLast());
        }
    }
}
