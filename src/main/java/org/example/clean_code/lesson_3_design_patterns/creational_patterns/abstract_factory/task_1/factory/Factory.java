package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair.Chair;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table.Table;

public interface Factory {
    Chair createChair();
    Table createTable();
}
