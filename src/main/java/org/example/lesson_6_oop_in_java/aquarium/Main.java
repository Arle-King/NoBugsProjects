package org.example.lesson_6_oop_in_java.aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Animal shark = new Shark();
        Animal starfish = new Starfish();

        aquarium.setAnimal(shark);
        aquarium.animalPrint();

        aquarium.setAnimal(starfish);
        aquarium.animalPrint();
    }
}
