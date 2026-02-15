package org.example.lesson_9_exceptions_and_generics.exceptions.task_3;

public class Main {
    public static void main(String[] args) {
        try {
            age(10);
        } catch (AgeException e) {
            e.printStackTrace();
        }

        try {
            age(-15);
        } catch (AgeException e) {
            e.printStackTrace();
        }

        try {
            age(200);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }

    public static void age(int age){
        if (age < 0 || age > 150) {
            throw new AgeException("Проблема с возрастом! Человеку " + age + " ЛЕТ!!");
        }
        System.out.println("Всё ок!");
    }
}
