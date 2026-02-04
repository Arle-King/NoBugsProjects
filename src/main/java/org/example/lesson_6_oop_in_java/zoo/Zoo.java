package org.example.lesson_6_oop_in_java.zoo;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void animalSound() {
        this.animal.animalSound();
    }

    public void animalMove() {
        this.animal.animalMove();
    }
}
