package org.example.lesson_3_static_final_and_access_modifier;

public class MathConstants {
    public final static double PI = 3.14159;
    public final static double E = 2.71828;

    public static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    public static double calculateCircumference(double r) {
        return 2 * PI * r;
    }
}
