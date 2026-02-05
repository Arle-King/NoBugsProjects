package org.example.lesson_4_operators_and_loops.while_task;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        while (x < 0) {
            x = scanner.nextInt();
        }

        while(x > 0) {
            System.out.println(x);
            x--;
        }
    }
}
