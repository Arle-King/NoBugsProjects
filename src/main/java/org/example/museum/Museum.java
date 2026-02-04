package org.example.museum;

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
