package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory.ClassicFactory;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory.CreateFactory;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory.ModernFactory;

public class Main {
    public static void main(String[] args) {
        CreateFactory modernFactory = new CreateFactory(new ModernFactory());
        modernFactory.printStyle();

        System.out.println();

        CreateFactory classicFactory = new CreateFactory(new ClassicFactory());
        classicFactory.printStyle();
    }
}
