package org.example.garden;

public class Garden {
    private Plant plant;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public void printCare() {
        this.plant.printCare();
    }
}
