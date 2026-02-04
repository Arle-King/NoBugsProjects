package org.example.lesson_4_operators_and_loops.for_task;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i < x + 1; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
