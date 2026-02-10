package org.example.lesson_9_exceptions_and_generics.generics.task_1;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
