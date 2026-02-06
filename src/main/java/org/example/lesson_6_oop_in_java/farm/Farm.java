package org.example.lesson_6_oop_in_java.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Animal> animal = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animal.add(animal);
    }

    public void feedAllAnimals() {
        animal.forEach(Animal::harvesting);
    }

    public void careAllAnimals() {
        animal.forEach(Animal::care);
    }
}
