package org.example.lesson_9_exceptions_and_generics.exceptions.task_1;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader file;

        try {
            file = new FileReader("data.txt");
            System.out.println("Файл Открыт");
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
    }
}
