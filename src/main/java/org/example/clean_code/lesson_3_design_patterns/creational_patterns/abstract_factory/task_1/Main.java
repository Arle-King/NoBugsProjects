package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory.ClassicFactory;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory.StylePrinter;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_1.factory.ModernFactory;

public class Main {
    public static void main(String[] args) {
        StylePrinter modernFactory = new StylePrinter(new ModernFactory());
        modernFactory.printStyle();

        System.out.println();

        StylePrinter classicFactory = new StylePrinter(new ClassicFactory());
        classicFactory.printStyle();
    }
}
