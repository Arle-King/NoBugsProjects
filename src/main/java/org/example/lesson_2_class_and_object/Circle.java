package org.example.lesson_2_class_and_object;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area of the circle: " + Math.PI * radius * radius);
    }

    public void calculateCircumference() {
        System.out.println("Circumference of the circle: " + 2 * Math.PI * radius);
    }
}
