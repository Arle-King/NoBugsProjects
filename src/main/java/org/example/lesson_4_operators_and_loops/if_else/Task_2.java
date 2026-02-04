package org.example.lesson_4_operators_and_loops.if_else;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}
