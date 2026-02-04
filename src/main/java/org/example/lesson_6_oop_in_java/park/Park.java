package org.example.lesson_6_oop_in_java.park;

public class Park {

    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void printInfo() {
        this.attraction.printInfo();
    }

    public void maintain() {
        this.attraction.maintain();
    }
}
