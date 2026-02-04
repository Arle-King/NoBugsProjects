package org.example.lesson_6_oop_in_java.museum;

public class Manuscript extends Exhibit{
    @Override
    void printInfo() {
        System.out.println("Очень сташая штука");
    }

    @Override
    void printCare() {
        System.out.println("требует контролируемой влажности");
    }
}
