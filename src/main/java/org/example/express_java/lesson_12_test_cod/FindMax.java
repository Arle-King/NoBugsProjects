package org.example.express_java.lesson_12_test_cod;

import java.util.Arrays;

public class FindMax {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
