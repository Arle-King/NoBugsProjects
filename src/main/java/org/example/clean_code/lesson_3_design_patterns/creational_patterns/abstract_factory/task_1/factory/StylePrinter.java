package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair.Chair;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table.Table;

public class StylePrinter {
    private final Factory factory;

    public StylePrinter(Factory factory) {
        this.factory = factory;
    }

    public void printStyle() {
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.description();
        table.description();
    }
}
