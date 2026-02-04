package org.example.lesson_4_operators_and_loops.switch_task;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String x;
        x = scanner.nextLine();

        switch (x.toLowerCase()) {
            case "start": System.out.println("Система запущена"); break;
            case "stop": System.out.println("Система остановлена"); break;
            case "restart": System.out.println("Система перезапущена"); break;
            case "status": System.out.println("Статус системы"); break;
            default: System.out.println("Неизвестная команда"); break;
        }
    }
}
