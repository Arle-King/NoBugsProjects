package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button;

public class MacButton implements Button {
    @Override
    public void description() {
        System.out.println("Кнопка в стиле макентоши");
    }
}
