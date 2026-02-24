package org.example.express_java.lesson_12_test_cod;

import java.util.Arrays;

public class FindSecondMax {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }

}
