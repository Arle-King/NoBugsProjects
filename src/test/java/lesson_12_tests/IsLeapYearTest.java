package lesson_12_tests;

import org.example.lesson_12_test_cod.IsLeapYear;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsLeapYearTest {
    IsLeapYear isLeapYear;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        isLeapYear = new IsLeapYear();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of(2105, false),
                Arguments.of(2020, true),
                Arguments.of(1600, true),
                Arguments.of(2000, true),
                Arguments.of(1900, false),
                Arguments.of(2100, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void isLeapYearTest(int numder, boolean result) {
        Assertions.assertEquals(isLeapYear.isLeapYear(numder), result, "Ошибка!!! АЛЯРМ");
    }
}
