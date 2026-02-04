package org.example.restaurant;

public class HotDish extends Dish {

    private String name;
    private int temperature;

    public HotDish(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Название: " + name + " с температурой: " + temperature);
    }
}
