package org.example.lesson_6_oop_in_java.zoo;

public class Elephant extends Animal{

    @Override
    public void animalSound() {
        System.out.println("Слон трубит");
    }

    @Override
    public void animalMove() {
        System.out.println("Слон ходит");
    }
}
