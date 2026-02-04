package org.example.lesson_4_operators_and_loops.switch_task;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        if (x < 60) {
            System.out.println("F");
        } else if (x < 70) {
            System.out.println("D");
        } else if (x < 80) {
            System.out.println("C");
        } else if (x < 90) {
            System.out.println("B");
        } else if (x < 101) {
            System.out.println("A");
        } else {
            System.out.println("Плохое число");
        }
    }
}
