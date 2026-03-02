package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table;

public class ClassicTable implements Table {
    @Override
    public void description() {
        System.out.println("Классический стол");
    }
}
