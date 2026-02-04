package org.example.lesson_6_oop_in_java.farm;

public class Farm {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void harvesting() {
        this.animal.harvesting();
    }

    public void care() {
        this.animal.care();
    }
}
