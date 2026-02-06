package org.example.lesson_6_oop_in_java.park;

public class RollerCoaster extends Attraction {
    @Override
    public void printInfo() {
        System.out.println("Американские горки для взрослых");
    }

    @Override
    public void maintain() {
        System.out.println("Американские горки требуют проверка безопасности");
    }
}
