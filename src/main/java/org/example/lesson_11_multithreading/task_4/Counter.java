package org.example.lesson_11_multithreading.task_4;

public class Counter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
