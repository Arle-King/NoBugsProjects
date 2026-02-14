package lesson_12_tests;

import org.example.lesson_12_test_cod.FindSecondMax;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

public class FindSecondMaxTest {
    FindSecondMax findSecondMax;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        findSecondMax = new FindSecondMax();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of(new int[]{}, IllegalArgumentException.class),
                Arguments.of(new int[]{3}, IllegalArgumentException.class),
                Arguments.of(new int[]{5, 5, 5, 5}, NoSuchElementException.class)
        );
    }

    @Test
    public void findSecondMaxTest() {
        Assertions.assertEquals(findSecondMax.findSecondMax(new int[]{3, 5, 7, 2}), 5, "ALARM");
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void findSecondMaxThrowsTest(int[] numder, Class classException) {
        Assertions.assertThrows(classException, () -> findSecondMax.findSecondMax(numder));
    }
}
