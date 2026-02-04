package org.example.lesson_4_operators_and_loops.switch_task;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        String s;
        x = scanner.nextInt();
        y = scanner.nextInt();
        s = String.valueOf(scanner.next().charAt(0));

        switch (s) {
            case "+": System.out.println(x + y); break;
            case "-": System.out.println(x - y); break;
            case "*": System.out.println(x * y); break;
            case "/": System.out.println(x / y); break;
            default: System.out.println("Что-то пошло не так: 403");
        }
    }
}
