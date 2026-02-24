package org.example.express_java.lesson_12_test_cod;

public class IsLeapYear {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
