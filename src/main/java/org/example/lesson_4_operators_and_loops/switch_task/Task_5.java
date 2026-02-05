package org.example.lesson_4_operators_and_loops.switch_task;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        char s;
        x = scanner.nextInt();
        y = scanner.nextInt();
        s = scanner.next().charAt(0);

        switch (s) {
            case '+': System.out.println(x + y); break;
            case '-': System.out.println(x - y); break;
            case '*': System.out.println(x * y); break;
            case '/': {
                if (y == 0) {
                    System.out.println("На ноль не делим");
                    break;
                }
                System.out.println(x / y);
            } break;
            default: System.out.println("Что-то пошло не так: 403");
        }
    }
}
