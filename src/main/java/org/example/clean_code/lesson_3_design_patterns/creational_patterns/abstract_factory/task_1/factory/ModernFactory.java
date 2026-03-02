package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair.Chair;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair.ModernChair;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table.ModernTable;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table.Table;

public class ModernFactory implements Factory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
