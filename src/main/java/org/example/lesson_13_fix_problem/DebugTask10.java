package org.example.lesson_13_fix_problem;

import java.util.*;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(name -> name.startsWith("A"));
    }
}
