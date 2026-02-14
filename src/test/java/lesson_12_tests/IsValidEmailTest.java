package lesson_12_tests;

import org.example.lesson_12_test_cod.IsValidEmail;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsValidEmailTest {
    IsValidEmail isValidEmail;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        isValidEmail = new IsValidEmail();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of("test@example.com", true),
                Arguments.of("bad@.com", false),
                Arguments.of("no-at-symbol", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void isValidEmailTest(String numder, boolean result) {
        Assertions.assertEquals(isValidEmail.isValidEmail(numder), result, "АЛЯРМ!");
    }

    @Test
    public void isValidEmailNullTest() {
        Assertions.assertFalse(isValidEmail.isValidEmail(null), "Ошибка в обработке null");
    }
}
