package org.example.lesson_14_complex_task.task_3;

public class StudentGrade <T extends Number>{

    private String name;
    private String academiDiscipline;
    private T grade;

    public StudentGrade(String name, String academiDiscipline, T grade) {
        this.name = name;
        this.academiDiscipline = academiDiscipline;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getAcademiDiscipline() {
        return academiDiscipline;
    }

    public T getGrade() {
        return grade;
    }
}
