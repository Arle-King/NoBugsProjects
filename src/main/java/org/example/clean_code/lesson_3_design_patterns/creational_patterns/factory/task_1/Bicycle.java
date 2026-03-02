package org.example.clean_code.lesson_3_design_patterns.creational_patterns.factory.task_1;

public class Bicycle implements Transport{
    @Override
    public void drive() {
        System.out.println("Велик едет");
    }
}
