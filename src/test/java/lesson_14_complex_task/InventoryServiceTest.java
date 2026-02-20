package lesson_14_complex_task;

import org.assertj.core.api.SoftAssertions;
import org.example.lesson_14_complex_task.task_3.InvalidGradeException;
import org.example.lesson_14_complex_task.task_5.InventoryService;
import org.example.lesson_14_complex_task.task_5.OutOfStockException;
import org.example.lesson_14_complex_task.task_5.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InventoryServiceTest {

    int beginSize = 0;

    InventoryService inventoryService;

    Product product1;
    Product product2;
    Product product3;

    SoftAssertions softAssertions;

    @BeforeEach
    public void precondition() {
        product1 = new Product("GameBoy", 150, "Game");
        product2 = new Product("Doka2", 350, "Game");
        product3 = new Product("Boots", 750, "Sport");

        inventoryService = new InventoryService();
        InventoryService.isInventoryOpen = false;

        softAssertions = new SoftAssertions();
    }

    @AfterEach
    public void postcondition() {
        softAssertions.assertAll();
    }

    @Test
    public void isInventoryClosedTest() {
        Assertions.assertThrows(OutOfStockException.class, () -> inventoryService.getProducts("Game"), "");
        Assertions.assertThrows(OutOfStockException.class, () -> inventoryService.filterByPrice(100, 400), "");
        softAssertions.assertThat(inventoryService.addProduct(product1)).as("").isEqualTo(false);
    }

    @Test
    public void isInventoryOpenTest() {
        InventoryService.isInventoryOpen = true;

        try {
            inventoryService.getProducts("Game");
        } catch (OutOfStockException e) {
            softAssertions.assertThat(e.getMessage()).as("").isEqualTo("Такой категории не существует");
        }

        beginSize = 0;
        inventoryService.addProduct(product1);
        softAssertions.assertThat(inventoryService.getProducts(product1.getCategory()).size()).as("").isEqualTo(beginSize + 1);
        softAssertions.assertThat(inventoryService.getProducts(product1.getCategory()).get(0)).as("Тут мы падаем, потому что equals и hashCode не переопределены").isEqualTo(new Product(product1.getName(), product1.getPrice(), product1.getCategory()));

        beginSize = inventoryService.getProducts(product1.getCategory()).size();
        inventoryService.addProduct(product2);
        softAssertions.assertThat(inventoryService.getProducts(product1.getCategory()).size()).as("").isEqualTo(beginSize + 1);

        inventoryService.addProduct(product3);
        softAssertions.assertThat(inventoryService.filterByPrice(300, 800).size()).as("").isEqualTo(2);
        softAssertions.assertThat(inventoryService.filterByPrice(100, 600).size()).as("").isEqualTo(2);
    }
}
