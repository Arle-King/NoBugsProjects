package org.example.lesson_6_oop_in_java.museum;

public class Manuscript extends Exhibit{
    @Override
    public void printInfo() {
        System.out.println("Манускрипт очень старая штука");
    }

    @Override
    public void printCare() {
        System.out.println("Манускрипт требует контролируемой влажности");
    }
}
