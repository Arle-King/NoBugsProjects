package org.example.garden;


public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        garden.setPlant(orchid);
        garden.printCare();

        garden.setPlant(cactus);
        garden.printCare();
    }
}
