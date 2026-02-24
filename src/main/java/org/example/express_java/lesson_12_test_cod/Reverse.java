package org.example.express_java.lesson_12_test_cod;

public class Reverse {
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
