package org.example.lesson_8_collections_in_java.priority_queue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(3);
        priorityQueue.add(15);
        priorityQueue.add(2);
        priorityQueue.add(15);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
