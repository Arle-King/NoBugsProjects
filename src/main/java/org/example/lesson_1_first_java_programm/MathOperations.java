package org.example.lesson_1_first_java_programm;

public class MathOperations {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }

    public int findMax(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public int difference(int x, int y) {
        return (x - y > 0) ? (x - y) : (y - x);
    }

    public double squareArea(int side) {
        return side * side;
    }

    public double squarePerimeter(int side) {
        return side * 4;
    }

    public double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
