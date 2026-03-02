package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_2;

public class SmartHomeFacade {
    private SmartHome smartHome;

    public SmartHomeFacade(SmartHome smartHome) {
        this.smartHome = smartHome;
    }

    public void allOn() {
        System.out.println(smartHome.lightOn());
        System.out.println(smartHome.conditionerOn());
        System.out.println(smartHome.securitySystemOn());
    }

    public void allOff() {
        System.out.println(smartHome.lightOff());
        System.out.println(smartHome.conditionerOff());
        System.out.println(smartHome.securitySystemOff());
    }
}
