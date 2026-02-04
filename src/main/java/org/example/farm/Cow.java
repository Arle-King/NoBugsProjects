package org.example.farm;

public class Cow extends Animal {

    @Override
    public void harvesting() {
        System.out.println("Корова даёт молоко");
    }

    @Override
    public void care() {
        System.out.println("Корова нуждается в выпасе");
    }
}
