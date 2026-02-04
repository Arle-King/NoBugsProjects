package org.example.lesson_4_operators_and_loops.if_else;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        if (x < 18) {
            System.out.println("Скидка 25%");
        } else if (x >= 65) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Скидки нет");
        }
    }
}
