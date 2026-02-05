package org.example.lesson_4_operators_and_loops.breke_and_continue;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        while (true) {
            x = scanner.nextInt();
            if (x < 0) {
                continue;
            } else if (x == 0) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("Конец");
    }
}
