package org.example.lesson_6_oop_in_java.museum;


public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();

        museum.addExhibit(manuscript);
        museum.addExhibit(sculpture);

        museum.printExhibitsInfo();
        museum.printExhibitsCare();

    }
}
