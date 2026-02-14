package lesson_12_tests;

import org.example.lesson_12_test_cod.FindMax;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FindMaxTest {
    FindMax findMax;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        findMax = new FindMax();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{7}, 7),
                Arguments.of(new int[]{-3, -5, -7, -2}, -2)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void findMaxTest(int[] numder, int result) {
        Assertions.assertEquals(findMax.findMax(numder), result, "Надено неверное максимальное число: ");
    }

    @Test
    public void findMaxNullTest() {
        Assertions.assertThrows(NullPointerException.class, () -> findMax.findMax(null), "Ошибка в обработке null");
    }
}
