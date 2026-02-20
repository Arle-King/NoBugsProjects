package lesson_14_complex_task;

import org.assertj.core.api.Assert;
import org.assertj.core.api.SoftAssertions;
import org.example.lesson_14_complex_task.task_3.GradeService;
import org.example.lesson_14_complex_task.task_3.InvalidGradeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeServiceTest {

    SoftAssertions softAssertions;

    @BeforeEach
    public void precondition() {
        softAssertions = new SoftAssertions();
    }

    @AfterEach
    public void postcondition() {
        softAssertions.assertAll();
    }

    @Test
    public void gradeTest() {
        GradeService<Number> gradeService = new GradeService<>();
        // Проверка на пустом списке
        softAssertions.assertThat(gradeService.getAverage("Math")).as("").isEqualTo(0);

        // Проверка полсе 1 добавления
        gradeService.addGrade("Egor", "Math", 70);
        softAssertions.assertThat(gradeService.getAverage("Math")).as("").isEqualTo(70);

        // Добавили ещё один
        gradeService.addGrade("Egor", "Math", 90);
        softAssertions.assertThat(gradeService.getAverage("Math")).as("").isEqualTo(80);

        // В списке есть дисциплины, но мы спрашиваем о несуществующей
        softAssertions.assertThat(gradeService.getAverage("Math2")).as("").isEqualTo(0);

        //Проверка на отрицательную оценку
        Assertions.assertThrows(InvalidGradeException.class, () -> gradeService.addGrade("Egor", "Math", -90), "Оценка -90 невалидна");

        // Добавис оценку другого типа
        gradeService.addGrade("Egor", "Math", 80.0);
        softAssertions.assertThat(gradeService.getAverage("Math")).as("").isEqualTo(80);

    }
}
