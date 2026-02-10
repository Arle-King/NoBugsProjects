package org.example.lesson_9_exceptions_and_generics.exceptions.task_3;

public class Main {
    public static void main(String[] args) {
        age(10);
        age(-15);
        age(200);

    }

    public static void age(int age){
        try {
            if (age < 0 || age > 150) {
                throw new AgeException("Проблема с возрастом! Человеку " + age + " ЛЕТ!!");
            }
            System.out.println("Всё ок!");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
