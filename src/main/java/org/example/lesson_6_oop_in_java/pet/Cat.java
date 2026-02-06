package org.example.lesson_6_oop_in_java.pet;

public class Cat extends Animal{
    @Override
    public void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    public void care() {
        System.out.println("Кошка играет");
    }
}
