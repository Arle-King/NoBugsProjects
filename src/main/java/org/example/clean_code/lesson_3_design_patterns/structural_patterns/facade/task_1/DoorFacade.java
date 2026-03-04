package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_1;

public class DoorFacade {
    private Door door;

    public DoorFacade(Door door) {
        this.door = door;
    }

    public void doorOpen() {
        System.out.println(door.doorOpen());
    }

    public void doorClose () {
        System.out.println(door.doorClose());
    }

    public void doorLock () {
        System.out.println(door.doorLock());
    }
}
