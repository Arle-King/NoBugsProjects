package org.example.lesson_12_test_cod;

public class CountWords {
    public int countWords(String sentence) {
    return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
