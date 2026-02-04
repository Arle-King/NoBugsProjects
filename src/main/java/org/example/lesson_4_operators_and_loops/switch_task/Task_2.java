package org.example.lesson_4_operators_and_loops.switch_task;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        switch (x) {
            case 1, 2, 3, 4, 5: System.out.println("300 рублей"); break;
            case 6, 7: System.out.println("450 рублей"); break;
            default: System.out.println("Плохое число");
        }
    }
}
