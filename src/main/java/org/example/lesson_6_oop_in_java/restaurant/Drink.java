package org.example.lesson_6_oop_in_java.restaurant;

public class Drink extends Dish {

    private String name;
    private int volume;

    public Drink (String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Название: " + name + " с объёмом: " + volume);
    }
}
