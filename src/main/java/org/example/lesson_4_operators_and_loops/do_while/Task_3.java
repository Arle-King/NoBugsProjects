package org.example.lesson_4_operators_and_loops.do_while;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = 1;

        do {
            System.out.println(x);
            x++;
        } while (x<11);
    }
}
