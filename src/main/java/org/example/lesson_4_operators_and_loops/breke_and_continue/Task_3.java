package org.example.lesson_4_operators_and_loops.breke_and_continue;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            x = scanner.nextInt();
            if (x < 0) {
                x = 1;
                continue;
            }
            System.out.println(x);
        } while (x > 0);
    }
}
