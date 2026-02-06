package org.example.lesson_6_oop_in_java.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Dish> list = new ArrayList<>();

    public void addDish(Dish dish) {
        this.list.add(dish);
    }

    public void printMenu() {
        for (Dish dish : this.list) {
            dish.getDish();
        }
    }
}
