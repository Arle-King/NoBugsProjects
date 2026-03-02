package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_1;

public class Door {
    protected String doorOpen() {
        return "Дверь открыта";
    }

    protected String doorClose() {
        return "Дверь закрыта";
    }

    protected String doorLock() {
        return "Дверь заблокированна";
    }
}
