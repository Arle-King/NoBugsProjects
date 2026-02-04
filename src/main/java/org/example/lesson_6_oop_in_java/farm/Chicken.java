package org.example.lesson_6_oop_in_java.farm;

public class Chicken extends Animal {
    @Override
    public void harvesting() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void care() {
        System.out.println("Курица требует зерно");
    }
}
