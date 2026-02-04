package org.example.lesson_4_operators_and_loops.while_task;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        while(x != 1) {
            System.out.println(x);
            x--;
        }
    }
}
