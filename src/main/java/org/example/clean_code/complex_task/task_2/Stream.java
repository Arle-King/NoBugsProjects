package org.example.clean_code.complex_task.task_2;

import java.util.UUID;

public class Stream {
    private UUID streamId;

    public Stream(UUID streamId) {
        this.streamId = streamId;
    }

    public UUID getStreamId() {
        return streamId;
    }
}
