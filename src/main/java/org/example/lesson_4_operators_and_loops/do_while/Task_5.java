package org.example.lesson_4_operators_and_loops.do_while;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();

        int counter = 0;

        do {
            counter++;
            x = x / 10;
        } while (x != 0);

        System.out.println("Количество цифр в числе: " + counter);
    }
}
