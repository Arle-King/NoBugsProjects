package org.example.lesson_4_operators_and_loops.if_else;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        if (x < 60) {
            System.out.println("Неудовлетворительно");
        } else if (x < 75) {
            System.out.println("Удовлетворительно");
        } else if (x < 90) {
            System.out.println("Хорошо");
        } else if (x <= 100) {
            System.out.println("Отлично");
        } else {
            System.out.println("Никто ничего");
        }
    }
}
