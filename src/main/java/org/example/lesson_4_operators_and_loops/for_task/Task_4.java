package org.example.lesson_4_operators_and_loops.for_task;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Число простое");
        } else {
            System.out.println("Число не простое");
        }
    }
}
