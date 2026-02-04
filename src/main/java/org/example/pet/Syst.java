package org.example.pet;

public class Syst {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void Feed() {
        this.animal.Feed();
    }

    public void care() {
        this.animal.care();
    }
}
