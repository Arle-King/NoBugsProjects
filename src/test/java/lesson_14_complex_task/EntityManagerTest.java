package lesson_14_complex_task;

import org.assertj.core.api.SoftAssertions;
import org.example.lesson_14_complex_task.task_1.Entity;
import org.example.lesson_14_complex_task.task_1.EntityManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityManagerTest {

    Entity entity1;
    Entity entity2;
    Entity entity3;
    Entity entity4;
    Entity entity5;

    int biginSize;

    SoftAssertions softAssertions;

    @BeforeEach
    public void precondition() {
        entity1 = new Entity("Egor", 9, true);
        entity2 = new Entity("Vadim", 18, true);
        entity3 = new Entity("Egor", 25, false);
        entity4 = new Entity("Evgenia", 45, false);
        entity5 = new Entity("Artem", 90, false);

        softAssertions = new SoftAssertions();
    }

    @AfterEach
    public void postcondition() {
        softAssertions.assertAll();
    }

    //Можно было разбить эту пачку тестов на несколько, но мне лень
    @Test
    public void test() {
        EntityManager entityManager = new EntityManager<>();
        biginSize = entityManager.getEntityes().size();

        entityManager.add(entity1);
        softAssertions.assertThat(entityManager.getEntityes().size()).as("Размер коллекции не соответствует ожидаемому").isEqualTo(biginSize + 1);
        softAssertions.assertThat(entityManager.getEntityes().getLast()).as("equals не переопределён").isEqualTo(new Entity(entity1.getName(), entity1.getAge(), entity1.isActive()));

        biginSize = entityManager.getEntityes().size();
        entityManager.add(entity2);
        softAssertions.assertThat(entityManager.getEntityes().size()).as("Размер коллекции не соответствует ожидаемому").isEqualTo(biginSize + 1);

        biginSize = entityManager.getEntityes().size();
        entityManager.remove(entity1);
        softAssertions.assertThat(entityManager.getEntityes().size()).as("Размер коллекции не соответствует ожидаемому").isEqualTo(biginSize - 1);

        entityManager.add(entity1);
        entityManager.add(entity3);
        entityManager.add(entity4);
        entityManager.add(entity5);

        softAssertions.assertThat(entityManager.filterByName("Egor").size()).as("Фильтр по имени").isEqualTo(2);
        softAssertions.assertThat(entityManager.filterByAge(18, 80).size()).as("Фильтр по возрасту").isEqualTo(3);
        softAssertions.assertThat(entityManager.filterByActive(true).size()).as("Фильтр по активности").isEqualTo(2);
    }
}
