package org.example.clean_code.complex_task.task_2;

import java.util.UUID;

public class Video {
    private UUID id;
    private String path;

    public Video(String path) {
        this.id = UUID.randomUUID();
        this.path = path;
    }

    public UUID getId() {
        return id;
    }

    public String getPath() {
        return path;
    }
}
