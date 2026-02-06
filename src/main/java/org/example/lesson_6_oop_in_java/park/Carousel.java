package org.example.lesson_6_oop_in_java.park;

public class Carousel extends Attraction {
    @Override
    public void printInfo() {
        System.out.println("Карусель для детей");
    }

    @Override
    public void maintain() {
        System.out.println("Карусель требует техническое обслуживание");
    }
}
