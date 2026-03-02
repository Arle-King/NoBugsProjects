package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button.Button;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button.MacButton;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.menu.MacMenu;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.menu.Menu;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.window.MacWindow;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.window.Window;

public class MacFactory implements Factory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Window createWindow() {
        return new MacWindow();
    }
}
