package org.example.lesson_6_oop_in_java.pet;

public class Dog extends Animal {
    @Override
    public void feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void care() {
        System.out.println("Собака гуляет");
    }
}
