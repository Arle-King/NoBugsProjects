package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button.Button;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button.WinButton;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.menu.Menu;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.menu.WinMenu;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.window.WinWindow;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.window.Window;

public class WinFactory implements Factory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Menu createMenu() {
        return new WinMenu();
    }

    @Override
    public Window createWindow() {
        return new WinWindow();
    }
}
