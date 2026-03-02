package org.example.clean_code.lesson_3_design_patterns.structural_patterns.adaprer.task_2;

public class DistanceAdapter {
    private double distance;

    public DistanceAdapter(double distance) {
        this.distance = distance;
    }

    public double getKilometers() {
        return distance * 1.609;
    }
}
