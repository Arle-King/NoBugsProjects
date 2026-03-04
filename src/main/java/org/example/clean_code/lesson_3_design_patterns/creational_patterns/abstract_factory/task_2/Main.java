package org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2;

import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.factory.MacFactory;
import org.example.clean_code.lesson_3_design_patterns.creational_patterns.abstract_factory.task_2.factory.WinFactory;

public class Main {
    public static void main(String[] args) {
        StylePrinter mac = new StylePrinter(new MacFactory());
        mac.print();

        System.out.println();

        StylePrinter win = new StylePrinter(new WinFactory());
        win.print();

    }
}
