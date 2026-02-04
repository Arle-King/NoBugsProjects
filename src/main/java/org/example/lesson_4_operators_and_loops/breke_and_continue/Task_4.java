package org.example.lesson_4_operators_and_loops.breke_and_continue;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x;
        x = scanner.nextLine();

        while (true) {
            if (x.equals("stop")) break;
        }

        System.out.println();
    }
}
