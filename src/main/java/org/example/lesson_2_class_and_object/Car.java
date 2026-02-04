package org.example.lesson_2_class_and_object;

public class Car {
    private String brand;
    private int year;

    public Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void print() {
        System.out.println("Бренд: " + brand);
        System.out.println("Год выпуска: " + year);
    }
}
