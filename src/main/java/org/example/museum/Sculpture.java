package org.example.museum;

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
