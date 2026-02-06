package org.example.lesson_6_oop_in_java.garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plant = new ArrayList<>();

    public void addPlant(Plant plant) {
        this.plant.add(plant);
    }

    public void printPlants() {
        this.plant.forEach(Plant::printCare);
    }
}
