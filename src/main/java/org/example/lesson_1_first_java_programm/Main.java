package org.example.lesson_1_first_java_programm;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        MathOperations mathOperations = new MathOperations();

        System.out.println("a = " + a + " b = " + b);
        System.out.println(a + " + " + b + " = " + mathOperations.add(a, b));
        System.out.println(a + " - " + b + " = " + mathOperations.subtract(a, b));
        System.out.println(a + " * " + b + " = " + mathOperations.multiply(a, b));
        System.out.println(a + " / " + b + " = " + mathOperations.divide(a, b));
        System.out.println("Max = " + mathOperations.findMax(a, b));
        System.out.println("Difference = " + mathOperations.difference(a, b));
        System.out.println("Площадь квадрата = " + mathOperations.squareArea(a));
        System.out.println("Периметр квадрата = " + mathOperations.squarePerimeter(b));
        System.out.println("Количество минут = " + mathOperations.convertSecondsToMinutes(mathOperations.add(a, b)));
        System.out.println("Средняя скорость = " + mathOperations.averageSpeed(mathOperations.add(a, b), mathOperations.difference(a, b)));
        System.out.println("Гипотенуза = " + mathOperations.findHypotenuse(a, b));
        System.out.println("Длинна окружности = " + mathOperations.circleCircumference(mathOperations.multiply(a, b)));
        System.out.println("Проценты = " + mathOperations.calculatePercentage(mathOperations.findMax(a, b), mathOperations.difference(a, b)));
        System.out.println("Из цельсия в фаренгейты = " + mathOperations.celsiusToFahrenheit(a));
        System.out.println("Из фаренгейтов в цельсия = " + mathOperations.fahrenheitToCelsius(mathOperations.celsiusToFahrenheit(a)));

    }
}
