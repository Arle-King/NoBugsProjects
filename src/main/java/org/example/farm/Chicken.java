package org.example.farm;

public class Chicken extends Animal {
    @Override
    public void harvesting() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void care() {
        System.out.println("Курица требует зерно");
    }
}
