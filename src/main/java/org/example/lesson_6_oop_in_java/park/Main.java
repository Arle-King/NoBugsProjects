package org.example.lesson_6_oop_in_java.park;


public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        park.addAttraction(rollerCoaster);
        park.addAttraction(carousel);

        park.printAttractionsInfo();
        park.maintainAttractions();
    }
}
