package org.example.lesson_9_exceptions_and_generics.exceptions.task_4;

public class StringNonCheckException extends RuntimeException {

    private String email;

    public StringNonCheckException(String message) {
        super(message);
    }
}
