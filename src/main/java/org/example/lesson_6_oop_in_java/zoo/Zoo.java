package org.example.lesson_6_oop_in_java.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animal = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animal.add(animal);
    }

    public void printAnimals() {
        this.animal.forEach(animal -> {
            animal.animalSound();
            animal.animalMove();
        });
    }
}
