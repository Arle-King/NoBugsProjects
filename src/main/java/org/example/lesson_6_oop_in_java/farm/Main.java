package org.example.lesson_6_oop_in_java.farm;


public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal cow = new Cow();
        Animal chicken = new Chicken();

        farm.addAnimal(cow);
        farm.addAnimal(chicken);

        farm.feedAllAnimals();
        farm.careAllAnimals();

    }
}
