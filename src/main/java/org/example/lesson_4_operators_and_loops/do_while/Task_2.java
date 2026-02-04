package org.example.lesson_4_operators_and_loops.do_while;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x;
        //x = scanner.nextInt();

        String password = "password";

        do {
            System.out.println("Введите пароль");
            x = scanner.nextLine();
        } while (!x.equals(password));

        System.out.println("Успех");
    }
}
