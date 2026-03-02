package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_1;

public class Main {
    public static void main(String[] args) {
        DoorFacade doorFacade = new DoorFacade(new Door());

        doorFacade.DoorOpen();
        doorFacade.DoorClose();
        doorFacade.DoorLock();
    }
}
