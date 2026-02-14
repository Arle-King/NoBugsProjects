package org.example.lesson_13_fix_problem;

public class DebugTask2 {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
