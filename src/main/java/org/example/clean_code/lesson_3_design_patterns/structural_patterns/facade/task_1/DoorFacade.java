package org.example.clean_code.lesson_3_design_patterns.structural_patterns.facade.task_1;

public class DoorFacade {
    private Door door;

    public DoorFacade(Door door) {
        this.door = door;
    }

    public void DoorOpen() {
        System.out.println(door.doorOpen());
    }

    public void DoorClose () {
        System.out.println(door.doorClose());
    }

    public void DoorLock () {
        System.out.println(door.doorLock());
    }
}
