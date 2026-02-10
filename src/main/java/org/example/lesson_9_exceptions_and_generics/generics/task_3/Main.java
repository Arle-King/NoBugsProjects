package org.example.lesson_9_exceptions_and_generics.generics.task_3;

public class Main {
    public static void main(String[] args) {
        Pair<String, String> pairStrint = new Pair<>("123", "321");
        Pair<Integer, String> pairIntegerStrint = new Pair<>(123, "321");
        Pair<String, Integer> pairStrintInteger = new Pair<>("123", 321);
        Pair<Integer, Integer> pairInteger = new Pair<>(123, 321);

        System.out.println(pairStrint.getX() + " " + pairStrint.getY());
        System.out.println(pairIntegerStrint.getX() + " " + pairIntegerStrint.getY());
        System.out.println(pairStrintInteger.getX() + " " + pairStrintInteger.getY());
        System.out.println(pairInteger.getX() + " " + pairInteger.getY());

        pairStrint.setX("321");
        pairStrint.setY("123");

        pairIntegerStrint.setX(321);
        pairIntegerStrint.setY("123");

        pairStrintInteger.setX("321");
        pairStrintInteger.setY(123);

        pairInteger.setX(321);
        pairInteger.setY(123);

        System.out.println();

        System.out.println(pairStrint.getX() + " " + pairStrint.getY());
        System.out.println(pairIntegerStrint.getX() + " " + pairIntegerStrint.getY());
        System.out.println(pairStrintInteger.getX() + " " + pairStrintInteger.getY());
        System.out.println(pairInteger.getX() + " " + pairInteger.getY());
    }



}
