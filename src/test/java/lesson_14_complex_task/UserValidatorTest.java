package lesson_14_complex_task;

import org.assertj.core.api.SoftAssertions;
import org.example.lesson_14_complex_task.task_2.InvalidUserException;
import org.example.lesson_14_complex_task.task_2.User;
import org.example.lesson_14_complex_task.task_2.UserValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UserValidatorTest {

    User user;

    UserValidator userValidator;

    SoftAssertions softAssertions;

    @BeforeEach
    public void precondition() {
        user = new User("Egor", 25, "bfifbs@mail.ru");

        userValidator = new UserValidator<>();

        softAssertions = new SoftAssertions();
        UserValidator.validationEnabled = false;
    }

    @AfterEach
    public void postcondition() {
        softAssertions.assertAll();
    }

    @Test
    public void validationEnabledTrue() {
        UserValidator.validationEnabled = true;

        softAssertions.assertThat(userValidator.start()).as("Исключение NullPointerException обрабатывается").isEqualTo(false);

        userValidator.setUser(user);
        softAssertions.assertThat(userValidator.start()).as("Подходящие данные не прошли валидацию").isEqualTo(true);
    }

    @Test
    public void validationEnabledFalse() {
        softAssertions.assertThat(userValidator.start()).as("Флаг validationEnabled не работает").isEqualTo(false);

        userValidator.setUser(user);
        softAssertions.assertThat(userValidator.start()).as("Флаг validationEnabled не работает").isEqualTo(false);
    }

    @ParameterizedTest
    @MethodSource("providerUser")
    public void validateTest(String name, int age, String email, boolean resolt) {
        UserValidator.validationEnabled = true;
        userValidator.setUser(new User(name, age, email));

        try {
            softAssertions.assertThat(userValidator.start()).isEqualTo(resolt);
        } catch (InvalidUserException e) {
            System.out.println("Валидация пошла не по плану с данными: "
                    + "Имя: " + name
                    + ", Возраст: " + age
                    + ", Email: " + email);
        }
    }

    public static Stream<Arguments> providerUser() {
        return Stream.of(
                Arguments.of("Egor", 25, "bfifbs@mail.ru", true),
                Arguments.of("egor", 25, "bfifbs@mail.ru", false),
                Arguments.of("Egor", 9, "bfifbs@mail.ru", false),
                Arguments.of("Egor", 25, "mail.ru", false)
        );
    }
}
