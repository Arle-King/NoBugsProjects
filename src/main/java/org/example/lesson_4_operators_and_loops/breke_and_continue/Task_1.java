package org.example.lesson_4_operators_and_loops.breke_and_continue;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        int sum = 0;

        do {
            x = scanner.nextInt();
            if (x < 0) break;

            sum = sum + x;
        } while (true);

        System.out.println("Сумма: " + sum);
    }
}
