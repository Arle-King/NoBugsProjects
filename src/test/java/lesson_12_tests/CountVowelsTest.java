package lesson_12_tests;

import org.example.lesson_12_test_cod.CountVowels;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CountVowelsTest {

    CountVowels countVowels;

    @BeforeEach
    public void precondition() {
        System.out.println("Тест начался");
        countVowels = new CountVowels();
    }

    @AfterEach
    public void postcondition() {
        System.out.println("Тест окончен");
    }

    public static Stream<Arguments> provaderString() {
        return Stream.of(
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                Arguments.of("", 0),
                Arguments.of("qwwwq", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provaderString")
    public void countVowelsTest(String str, int counter) {
        Assertions.assertEquals(countVowels.countVowels(str), counter,
                "Количество гласный в строке не совпадает с ожидаемым! Строка: "
                        + str + " гласных обнаружено: " + counter);
    }

    @Test
    public void countVowelsThrowsTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> countVowels.countVowels(null), "Ошибка в обработке null");
    }
}
