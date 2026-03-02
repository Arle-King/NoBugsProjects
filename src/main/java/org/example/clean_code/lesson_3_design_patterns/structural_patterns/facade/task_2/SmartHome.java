package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_2;

public class SmartHome {
    public String lightOn() {
        return "Свет включен";
    }

    public String lightOff() {
        return "Свет выключен";
    }

    public String conditionerOn() {
        return "Кондиционер включен";
    }

    public String conditionerOff() {
        return "Кондиционер выключен";
    }

    public String securitySystemOn() {
        return "Система безопасности включена";
    }

    public String securitySystemOff() {
        return "Система безопасности выключена";
    }
}
