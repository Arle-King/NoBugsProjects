package org.example.lesson_6_oop_in_java.museum;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private List<Exhibit> exhibit = new ArrayList<>();

    public void addExhibit(Exhibit exhibit) {
        this.exhibit.add(exhibit);
    }

    public void printExhibitsInfo() {
        this.exhibit.forEach(Exhibit::printInfo);
    }

    public void printExhibitsCare() {
        this.exhibit.forEach(Exhibit::printCare);
    }
}
