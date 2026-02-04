package org.example.lesson_6_oop_in_java.museum;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void printInfo() {
        this.exhibit.printInfo();
    }

    public void printCare() {
        this.exhibit.printCare();
    }
}
