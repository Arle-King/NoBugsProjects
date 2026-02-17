package org.example.lesson_14_complex_task.task_6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> implements Comparable<Task<T>> {

    private T id;
    private boolean isStatus = false;
    private int priority;
    private LocalDate date;

    public Task(T id, boolean isStatus, int priority, LocalDate date) {
        this.id = id;
        this.isStatus = isStatus;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return isStatus == task.isStatus && priority == task.priority && Objects.equals(id, task.id) && Objects.equals(date, task.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isStatus, priority, date);
    }

    @Override
    public int compareTo(Task<T> o) {
        return Integer.compare(this.priority, o.priority);
    }

}