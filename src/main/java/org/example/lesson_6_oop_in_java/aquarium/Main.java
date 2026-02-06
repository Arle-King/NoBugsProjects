package org.example.lesson_6_oop_in_java.aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Animal shark = new Shark();
        Animal starfish = new Starfish();

        aquarium.addAnimal(shark);
        aquarium.addAnimal(starfish);
        aquarium.printAnimals();
    }
}
