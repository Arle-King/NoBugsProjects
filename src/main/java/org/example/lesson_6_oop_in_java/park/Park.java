package org.example.lesson_6_oop_in_java.park;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attraction = new ArrayList<>();

    public void addAttraction(Attraction attraction) {
        this.attraction.add(attraction);
    }

    public void printAttractionsInfo() {
        attraction.forEach(Attraction::printInfo);
    }

    public void maintainAttractions() {
        attraction.forEach(Attraction::maintain);
    }
}
