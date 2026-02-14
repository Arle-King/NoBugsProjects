package lesson_12_tests;

import org.example.lesson_12_test_cod.Reverse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseTest {
    Reverse reverse;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        reverse = new Reverse();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of("123", "321"),
                Arguments.of("1", "1"),
                Arguments.of("", ""),
                Arguments.of("2134", "4312")
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void reverseTest(String str, String result) {
        Assertions.assertEquals(reverse.reverse(str), result, "Разворот пошёл не по плану! Проблема с: " + str);
    }

    @Test
    public void reverseNullTest() {
        Assertions.assertNull(reverse.reverse(null), "Разворот пошёл не по плану! Проблема с: null");
    }
}
