package org.example.lesson_6_oop_in_java.museum;

public class Sculpture extends Exhibit {
    @Override
    public void printInfo() {
        System.out.println("Скульптура очень красивая");
    }

    @Override
    public void printCare() {
        System.out.println("Скульптура нуждается в реставрации");
    }
}
