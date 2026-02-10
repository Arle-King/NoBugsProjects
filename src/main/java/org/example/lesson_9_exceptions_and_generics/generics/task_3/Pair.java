package org.example.lesson_9_exceptions_and_generics.generics.task_3;

public class Pair<T, R> {
    private T x;
    private R y;

    public Pair(T x, R y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public R getY() {
        return y;
    }

    public void setY(R y) {
        this.y = y;
    }
}
