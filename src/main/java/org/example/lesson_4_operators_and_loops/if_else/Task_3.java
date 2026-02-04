package org.example.lesson_4_operators_and_loops.if_else;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        x = scanner.nextInt();

        switch (x) {
            case 1, 2:
                System.out.println("Неудовлетворительно");
                break;

            case 3:
                System.out.println("Удовлетворительно");
                break;

            case 4:
                System.out.println("Хорошо");
                break;

            case 5:
                System.out.println("Отлично");
                break;

            default:
                System.out.println("Необрабатываемое число");
                break;
        }
    }
}
