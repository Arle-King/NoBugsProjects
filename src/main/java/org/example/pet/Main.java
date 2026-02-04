package org.example.pet;


public class Main {
    public static void main(String[] args) {
        Syst system = new Syst();
        Animal cat = new Cat();
        Animal dog = new Dog();

        system.setAnimal(cat);
        system.Feed();
        system.care();

        system.setAnimal(dog);
        system.Feed();
        system.care();
    }
}
