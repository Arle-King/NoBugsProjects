package org.example.clean_code.lesson_2_fixing_code.task_1.after;

import java.util.Arrays;

public class MathOperations {
    public int add(int... numbers) {
        return Arrays.stream(numbers).sum();
    }

}