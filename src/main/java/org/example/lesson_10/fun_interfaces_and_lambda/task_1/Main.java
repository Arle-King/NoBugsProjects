package org.example.lesson_10.fun_interfaces_and_lambda.task_1;

public class Main {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> x + y;
        MathOperation subtraction = (x, y) -> x - y;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation division = (x, y) -> (double) x / y;

        System.out.println("Сумма: " + add.operation(5, 5));
        System.out.println("Разница: " + subtraction.operation(5, 5));
        System.out.println("Умножение: " + multiplication.operation(5, 5));
        System.out.println("Деление: " + division.operation(5, 5));
    }

}
