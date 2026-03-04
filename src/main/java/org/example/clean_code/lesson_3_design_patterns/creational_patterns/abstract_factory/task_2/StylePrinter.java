package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button.Button;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.factory.Factory;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.menu.Menu;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.window.Window;

public class StylePrinter {
    private final Factory factory;

    public StylePrinter(Factory factory) {
        this.factory = factory;
    }

    public void print() {
        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        Window window = factory.createWindow();

        button.description();
        menu.description();
        window.description();
    }
}
