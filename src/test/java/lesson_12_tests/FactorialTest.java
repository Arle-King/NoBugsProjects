package lesson_12_tests;

import org.example.lesson_12_test_cod.Factorial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class FactorialTest {
    Factorial factorial;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        factorial = new Factorial();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void factorialTest(int value, int result) {
        Assertions.assertEquals(factorial.factorial(value), result, "АЛЯРМ");
    }

    @Test
    public void factorialNegativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorial.factorial(-1), "Проблема с отрицательными числами");
    }
}
