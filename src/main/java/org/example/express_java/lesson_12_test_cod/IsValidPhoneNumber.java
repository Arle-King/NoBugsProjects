package org.example.express_java.lesson_12_test_cod;

public class IsValidPhoneNumber {
    public boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\+\\d{1,3} \\d{10}");
    }
}
