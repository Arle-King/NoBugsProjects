package org.example.lesson_6_oop_in_java.pet;


public class Main {
    public static void main(String[] args) {
        Syst system = new Syst();
        Animal cat = new Cat();
        Animal dog = new Dog();

        system.addAnimal(cat);
        system.addAnimal(dog);
        system.printPets();
    }
}
