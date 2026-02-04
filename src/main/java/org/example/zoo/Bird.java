package org.example.zoo;

public class Bird extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    public void animalMove() {
        System.out.println("Птица летает");
    }
}
