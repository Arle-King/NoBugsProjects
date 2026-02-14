package lesson_12_tests;

import org.example.lesson_12_test_cod.IsValidPhoneNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsValidPhoneNumberTest {
    IsValidPhoneNumber isValidPhoneNumber;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        isValidPhoneNumber = new IsValidPhoneNumber();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of("+1 1234567890", true),
                Arguments.of("12345", false),
                Arguments.of("invalid", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void isValidPhoneNumberTest(String str, boolean result) {
        Assertions.assertEquals(isValidPhoneNumber.isValidPhoneNumber(str), result, "ALARM");
    }
}
