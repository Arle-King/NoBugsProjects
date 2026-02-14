package lesson_12_tests;

import org.example.lesson_12_test_cod.CountWords;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CountWordsTest {
    CountWords countWords;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        countWords = new CountWords();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderNumber() {
        return Stream.of(
                Arguments.of("123 123 123 132", 4),
                Arguments.of("1", 1),
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderNumber")
    public void countWordsTest(String str, int result) {
        Assertions.assertEquals(countWords.countWords(str), result, "ALARM");
    }

    @Test
    public void countWordsThrowsTest() {
        Assertions.assertThrows(NullPointerException.class, () -> countWords.countWords(null), "Что-то пошло не по плану! Проблема с: null");
    }
}
