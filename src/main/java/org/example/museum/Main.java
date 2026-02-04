package org.example.museum;


public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.setExhibit(manuscript);
        museum.printInfo();
        museum.printCare();

        museum.setExhibit(sculpture);
        museum.printInfo();
        museum.printCare();
    }
}
