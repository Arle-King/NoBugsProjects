package org.example.lesson_4_operators_and_loops.if_else;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Число положительное");
        } else if (x < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }
}
