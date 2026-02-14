package lesson_12_tests;

import org.example.lesson_12_test_cod.IsEven;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsEvenTest {

    IsEven isEven;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        isEven = new IsEven();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(3, false),
                Arguments.of(-2, true),
                Arguments.of(-5, false),
                Arguments.of(0, true)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void isEvenTest(int numder, boolean result) {
        Assertions.assertEquals(isEven.isEven(numder), result, "Проверка на чётность не прошла: " + numder);
    }
}
