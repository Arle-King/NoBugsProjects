package org.example.lesson_14_complex_task.task_3;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GradeService <T extends Number> {
    private List<StudentGrade<T>> list;

    public GradeService() {
        list = new CopyOnWriteArrayList<>();
    }

    public synchronized void addGrade(String name, String academiDiscipline, T grade) {
        if (grade.doubleValue() < 0) {
            throw new InvalidGradeException("Оценка " + grade + " невалидна");
        }

        list.add(new StudentGrade<>(name, academiDiscipline, grade));
    }

    public double getAverage(String academiDiscipline) {
        return list.stream()
                .filter(discipline -> academiDiscipline.equals(discipline.getAcademiDiscipline()))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .orElse(0);
    }
}
