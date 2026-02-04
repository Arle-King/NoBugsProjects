package org.example.pet;

public class Dog extends Animal {
    @Override
    public void Feed() {
        System.out.println("Собака ест сухой корм");
    }

    @Override
    public void care() {
        System.out.println("Собака гуляет");
    }
}
