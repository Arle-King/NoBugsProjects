package org.example.zoo;

public class Main {
    public static void main(String[] argm) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo.setAnimal(elephant);
        zoo.animalSound();
        zoo.animalMove();

        zoo.setAnimal(bird);
        zoo.animalSound();
        zoo.animalMove();
    }
}
