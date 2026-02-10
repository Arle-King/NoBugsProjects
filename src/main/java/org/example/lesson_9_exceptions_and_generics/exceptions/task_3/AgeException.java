package org.example.lesson_9_exceptions_and_generics.exceptions.task_3;

public class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
