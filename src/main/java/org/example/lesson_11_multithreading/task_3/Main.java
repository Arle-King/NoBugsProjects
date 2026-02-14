package org.example.lesson_11_multithreading.task_3;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter = new AtomicInteger();

        Thread thread = new Thread(() -> {
            while (!stop) {
                counter.getAndIncrement();
            }
        });

        thread.start();
        Thread.sleep(2000);
        stop = true;

    }
}
