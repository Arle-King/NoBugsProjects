package org.example.lesson_6_oop_in_java.pet;

import java.util.ArrayList;
import java.util.List;

public class Syst {

    private List<Animal> animal = new ArrayList<>();

    public void addAnimal(Animal animal) {
        this.animal.add(animal);
    }

    public void printPets() {
        this.animal.forEach(animal -> {
            animal.feed();
            animal.care();
        });
    }
}
