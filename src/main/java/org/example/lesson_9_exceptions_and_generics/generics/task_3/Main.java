package org.example.lesson_9_exceptions_and_generics.generics.task_3;

public class Main {
    public static void main(String[] args) {
        Pair<String, String> pairString = new Pair<>("123", "321");
        Pair<Integer, String> pairIntegerString = new Pair<>(123, "321");
        Pair<String, Integer> pairStringInteger = new Pair<>("123", 321);
        Pair<Integer, Integer> pairInteger = new Pair<>(123, 321);

        System.out.println(pairString.getX() + " " + pairString.getY());
        System.out.println(pairIntegerString.getX() + " " + pairIntegerString.getY());
        System.out.println(pairStringInteger.getX() + " " + pairStringInteger.getY());
        System.out.println(pairInteger.getX() + " " + pairInteger.getY());

        pairString.setX("321");
        pairString.setY("123");

        pairIntegerString.setX(321);
        pairIntegerString.setY("123");

        pairStringInteger.setX("321");
        pairStringInteger.setY(123);

        pairInteger.setX(321);
        pairInteger.setY(123);

        System.out.println();

        System.out.println(pairString.getX() + " " + pairString.getY());
        System.out.println(pairIntegerString.getX() + " " + pairIntegerString.getY());
        System.out.println(pairStringInteger.getX() + " " + pairStringInteger.getY());
        System.out.println(pairInteger.getX() + " " + pairInteger.getY());
    }



}
