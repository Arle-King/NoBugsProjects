package org.example.lesson_14_complex_task.task_4;

public class Rating<T extends Number> {
    private T grade;

    public Rating(T grade) {
        this.grade = grade;
    }

    public T getGrade() {
        return grade;
    }
}
