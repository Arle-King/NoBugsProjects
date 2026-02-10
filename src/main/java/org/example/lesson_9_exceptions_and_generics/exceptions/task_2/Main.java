package org.example.lesson_9_exceptions_and_generics.exceptions.task_2;

public class Main {
    public static void main(String[] args) {

        division(5, 5);
        division(1, 5);
        division(10, 5);
        division(5, 0);

    }

    public static void division(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            System.out.println((double) x/y);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка вычисления! " + e.getMessage());
        }
    }
}
