package org.example.lesson_6_oop_in_java.park;

public class RollerCoaster extends Attraction {
    @Override
    void printInfo() {
        System.out.println("Для взрослых");
    }

    @Override
    void maintain() {
        System.out.println("Проверка безопасности");
    }
}
