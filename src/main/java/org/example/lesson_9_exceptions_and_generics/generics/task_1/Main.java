package org.example.lesson_9_exceptions_and_generics.generics.task_1;

public class Main {
    public static void main(String[] args) {
        Box<Integer> boxInt = new Box<>();
        Box<String> boxString = new Box<>();

        boxInt.setValue(1);
        System.out.println(boxInt.getValue());

        boxString.setValue("fgv hb");
        System.out.println(boxString.getValue());
    }
}
