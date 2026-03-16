package org.example.qwerty.OOP;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    List<Animal> zoo;

    public Manager() {
        this.zoo = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        zoo.add(animal);
    }

    public void deasonForLeaving(String animal, String deason) {
        zoo.stream()
                .filter(x  -> x.getName().equals(animal))
                .peek(x -> x.deasonForLeaving(deason))
                .findFirst()
                .orElse(null);
    }

    public void printZoo() {
        for (Animal animal : zoo) {
            System.out.println(animal.getName());
            System.out.println(animal.getDaysBeforeMedEx());
        }
    }
}
