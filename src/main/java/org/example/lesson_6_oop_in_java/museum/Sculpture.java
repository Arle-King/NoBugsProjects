package org.example.lesson_6_oop_in_java.museum;

public class Sculpture extends Exhibit {
    @Override
    void printInfo() {
        System.out.println("Очень красиво");
    }

    @Override
    void printCare() {
        System.out.println("нуждается в реставрации");
    }
}
