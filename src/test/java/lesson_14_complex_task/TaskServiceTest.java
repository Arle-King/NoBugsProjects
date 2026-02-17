package lesson_14_complex_task;

import org.assertj.core.api.SoftAssertions;
import org.example.lesson_14_complex_task.task_6.Task;
import org.example.lesson_14_complex_task.task_6.TaskService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TaskServiceTest {

    SoftAssertions softAssertions;
    TaskService taskService;
    int beginSize;

    Task<Integer> task1;
    Task<Integer> task2;
    Task<Integer> task3;

    @BeforeEach
    public void precondition() {

        task1 = new Task<>(1, true, 10, LocalDate.now());
        task2 = new Task<>(2, false, 1, LocalDate.now().plusDays(1));
        task3 = new Task<>(3, false, 5, LocalDate.now().minusDays(1));

        softAssertions = new SoftAssertions();
        taskService = new TaskService();
    }

    @AfterEach
    public void postcondition() {
        softAssertions.assertAll();
    }

    @Test
    public void test() {

        beginSize = taskService.getPriorityQueue().size();
        softAssertions.assertThat(taskService.addTask(task1)).as("").isEqualTo(true);
        softAssertions.assertThat(taskService.getPriorityQueue().size()).as("").isEqualTo(beginSize + 1);
        softAssertions.assertThat(taskService.getPriorityQueue().peek()).as("").isEqualTo(new Task<>(task1.getId(), task1.isStatus(), task1.getPriority(), task1.getDate()));

        softAssertions.assertThat(taskService.addTask(task1)).as("").isEqualTo(false);
        softAssertions.assertThat(taskService.getPriorityQueue().size()).as("").isEqualTo(beginSize + 1);

        beginSize = taskService.getPriorityQueue().size();
        softAssertions.assertThat(taskService.addTask(task2)).as("").isEqualTo(true);
        softAssertions.assertThat(taskService.getPriorityQueue().size()).as("").isEqualTo(beginSize + 1);

        beginSize = taskService.getPriorityQueue().size();
        taskService.removeTask(task2);
        softAssertions.assertThat(taskService.getPriorityQueue().size()).as("").isEqualTo(beginSize - 1);


        taskService.addTask(task2);
        taskService.addTask(task3);
        softAssertions.assertThat(taskService.filterByStatus(false).size()).as("").isEqualTo(2);
        softAssertions.assertThat(taskService.filterByPriority(2, 7).size()).as("").isEqualTo(1);

        softAssertions.assertThat(taskService.getPriorityQueue().peek()).as("").isEqualTo(task2);

        softAssertions.assertThat(taskService.sortAbcByDate().peek()).as("").isEqualTo(task3);
        softAssertions.assertThat(taskService.sortDeskByDate().peek()).as("").isEqualTo(task2);

    }


}
