package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair;

public class ClassicChair implements Chair{
    @Override
    public void description() {
        System.out.println("Классический стул");
    }
}
