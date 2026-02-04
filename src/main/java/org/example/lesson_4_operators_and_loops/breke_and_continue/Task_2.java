package org.example.lesson_4_operators_and_loops.breke_and_continue;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        int sum = 0;

        for (int i = 0; i < 21; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
