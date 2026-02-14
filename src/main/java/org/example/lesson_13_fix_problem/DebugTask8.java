package org.example.lesson_13_fix_problem;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        if (Math.rint(a) == Math.rint(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}

