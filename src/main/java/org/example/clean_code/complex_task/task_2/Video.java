package org.example.clean_code.complex_task.task_2;

import java.util.UUID;

public class Video {
    private UUID id;

    public Video() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}
