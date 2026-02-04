package org.example.lesson_4_operators_and_loops.do_while;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x;

        String exit = "exit";

        do {
            System.out.println("Введите слово");
            x = scanner.nextLine();
        } while (!x.equals(exit));

        System.out.println("Конец программы");
    }
}
