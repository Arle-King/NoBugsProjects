package org.example.clean_code.lesson_3_design_patterns.structural_patterns.adaprer.task_2;

public class DistanceAdapter {
    private MilesDistance distance;

    public DistanceAdapter(MilesDistance distance) {
        this.distance = distance;
    }

    public double getKilometers() {
        return distance.getMiles() * 1.609;
    }
}
