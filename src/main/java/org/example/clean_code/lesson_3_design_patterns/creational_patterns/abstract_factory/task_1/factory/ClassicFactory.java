package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair.Chair;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.chair.ClassicChair;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table.ClassicTable;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.table.Table;

public class ClassicFactory implements Factory{

    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
