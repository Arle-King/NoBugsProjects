package org.example.lesson_4_operators_and_loops.do_while;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        //x = scanner.nextInt();

        do {
            System.out.println("Введите положительное число");
            x = scanner.nextInt();
        } while (x <= 0);
    }
}
