package org.example.clean_code.lesson_3_design_patterns.structural_patterns.adaprer.task_2;

public class Main {
    public static void main(String[] args) {
        MilesDistance mill = new MilesDistance(2);

        DistanceAdapter distanceAdapter = new DistanceAdapter(mill);
        
        System.out.println(distanceAdapter.getKilometers());
    }
}
