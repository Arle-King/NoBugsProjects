package org.example.lesson_9_exceptions_and_generics.exceptions.task_4;

public class StringNonCheckException extends RuntimeException {

    public StringNonCheckException(String message) {
        super(message);
    }
}
