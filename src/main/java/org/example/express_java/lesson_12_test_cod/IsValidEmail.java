package org.example.express_java.lesson_12_test_cod;

public class IsValidEmail {
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}
