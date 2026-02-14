import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class TestBase {

    public static Stream<Arguments> validStringsToTest() {
        return Stream.of(
                Arguments.of("1234567890", true),
                Arguments.of("12345678901", false),
                Arguments.of("123456789012", false),
                Arguments.of("1234567890123", false),
                Arguments.of("12345678901234", false)
                );
    }


    @ParameterizedTest
    @MethodSource("validStringsToTest")
    public void test(String x, boolean expected) {
        if (expected) {
            System.out.println(x);
        } else {
            System.out.println(x);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"validStringsToTest", "validStringsToTest"})
    public void test2(String x) {
        if (true) {
            System.out.println(x);
        } else {
            System.out.println(x);
        }
    }
}
