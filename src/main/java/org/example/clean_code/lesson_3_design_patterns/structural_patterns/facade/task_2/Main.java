package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_2;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(new SmartHome());

        smartHomeFacade.allOn();
        smartHomeFacade.allOff();
    }
}
