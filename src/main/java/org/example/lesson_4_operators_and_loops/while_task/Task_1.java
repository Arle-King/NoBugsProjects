package org.example.lesson_4_operators_and_loops.while_task;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        int sum = 1;

        if (x < 0){
            System.out.println("Факториал не отпределён");
        } else if (x > 1) {
            while(x != 1) {
                sum = sum * x;
                x--;
            }

            System.out.println(sum);
        } else {
            System.out.println(sum);
        }
    }
}
