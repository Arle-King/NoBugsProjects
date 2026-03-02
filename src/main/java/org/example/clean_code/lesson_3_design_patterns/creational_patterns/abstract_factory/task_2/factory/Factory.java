package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.factory;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.button.Button;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.menu.Menu;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.window.Window;

public interface Factory {
    Button createButton();
    Menu createMenu();
    Window createWindow();
}
