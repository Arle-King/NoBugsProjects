package org.example.lesson_14_complex_task.task_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieService {

    private Map<Movie, List<Rating>> map;

    public MovieService() {
        map = new HashMap<>();
    }

    public synchronized void addGrade(Movie movie, Rating grade) {
        if (grade.getGrade().doubleValue() < 1 || grade.getGrade().doubleValue() > 10) {
            throw new InvalidRatingException("Оценка " + grade + " невалидна");
        }

        map.computeIfAbsent(movie, k -> new ArrayList<>()).add(grade);
    }

    public double getAverage(Movie movie) {
        return map.getOrDefault(movie, new ArrayList<>())
                .stream()
                .mapToDouble(rating -> rating.getGrade().doubleValue())
                .average()
                .orElse(0);
    }

    public List<Movie> sortMovie() {
        return map.keySet()
                .stream()
                .sorted((m1, m2) -> {
                    double avg1 = getAverage(m1);
                    double avg2 = getAverage(m2);
                    return Double.compare(avg2, avg1);
                })
                .collect(Collectors.toList());
    }
}
