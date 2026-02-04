package org.example.lesson_4_operators_and_loops.for_task;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(x + "x" + i + "=" + x * i);
        }
    }
}
