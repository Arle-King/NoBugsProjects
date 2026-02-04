package org.example.park;

public class Carousel extends Attraction {
    @Override
    void printInfo() {
        System.out.println("Для детей");
    }

    @Override
    void maintain() {
        System.out.println("Техническое обслуживание");
    }
}
