package org.example.lesson_6_oop_in_java.zoo;

public class Main {
    public static void main(String[] argm) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo.addAnimal(elephant);
        zoo.addAnimal(bird);

        zoo.printAnimals();
    }
}
