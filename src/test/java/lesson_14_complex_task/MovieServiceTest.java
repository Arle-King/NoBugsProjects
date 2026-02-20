package lesson_14_complex_task;

import org.assertj.core.api.SoftAssertions;
import org.example.lesson_14_complex_task.task_3.InvalidGradeException;
import org.example.lesson_14_complex_task.task_4.Movie;
import org.example.lesson_14_complex_task.task_4.MovieService;
import org.example.lesson_14_complex_task.task_4.Rating;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class MovieServiceTest {

    SoftAssertions softAssertions;

    Movie movie1;
    Movie movie2;
    Movie movie3;

    Rating<Number> rating1;
    Rating<Number> rating2;
    Rating<Number> rating3;

    MovieService movieService;

    @BeforeEach
    public void precondition() {
        softAssertions = new SoftAssertions();

        movieService = new MovieService();

        movie1 = new Movie("Титаник");
        movie2 = new Movie("Хатико");
        movie3 = new Movie("1 + 1");

        rating1 = new Rating<>(7);
        rating2 = new Rating<>(5);
        rating3 = new Rating<>(10);
    }

    @AfterEach
    public void postcondition() {
        softAssertions.assertAll();
    }

    @Test
    public void testAvg() {
        movieService.addGrade(movie1, rating1);
        movieService.addGrade(movie1, rating3);
        softAssertions.assertThat(movieService.getAverage(movie1)).as("").isEqualTo( (rating1.getGrade().doubleValue() + rating3.getGrade().doubleValue()) / 2);
    }

    // неочевидная проверка на переопределение equals
    @Test
    public void testSort() {
        movieService.addGrade(movie1, rating1);
        movieService.addGrade(movie2, rating2);
        movieService.addGrade(movie3, rating3);

        assertSoftly(softly  -> {
            softly .assertThat(movieService.sortMovie().get(0)).as("").isEqualTo(movie3);
            softly .assertThat(movieService.sortMovie().get(1)).as("").isEqualTo(movie1);
            softly .assertThat(movieService.sortMovie().get(2)).as("").isEqualTo(movie2);
        });
    }

    @Test
    public void testInvalidGradeException() {
        try {
            movieService.addGrade(movie1, new Rating<>(-1));
        } catch (InvalidGradeException e) {
            softAssertions.assertThat(e.getMessage()).as("").isEqualTo("Оценка -1 невалидна");
        }
    }
}
