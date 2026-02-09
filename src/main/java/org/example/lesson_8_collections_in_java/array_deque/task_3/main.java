package org.example.lesson_8_collections_in_java.array_deque.task_3;

import java.util.ArrayDeque;

public class main {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addLast(2);
        arrayDeque.addFirst(3);
        arrayDeque.addLast(4);
        arrayDeque.addFirst(5);

        System.out.println(arrayDeque);

        System.out.println("Взяли с начала " + arrayDeque.pollFirst());
        System.out.println("Взяли с конца " + arrayDeque.pollLast());

        System.out.println("Осталось " + arrayDeque);

    }
}
