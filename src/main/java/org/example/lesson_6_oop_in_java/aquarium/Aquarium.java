package org.example.lesson_6_oop_in_java.aquarium;

public class Aquarium {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void animalPrint() {
        animal.print();
    }
}
