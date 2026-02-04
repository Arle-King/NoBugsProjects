package org.example.lesson_4_operators_and_loops.if_else;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }
}
