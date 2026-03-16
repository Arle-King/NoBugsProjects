package org.example.clean_code.complex_task.task_2;

import org.example.clean_code.complex_task.task_2.adapters.*;

import java.util.UUID;

public class VideoService {
    private AviVideoAdapter aviVideoAdapter;
    private MovVideoAdapter movVideoAdapter;
    private WmvVideoAdapter wmvVideoAdapter;

    private VideoAdapter videoAdapter;

    public VideoService(AviVideoAdapter aviVideoAdapter, MovVideoAdapter movVideoAdapter, WmvVideoAdapter wmvVideoAdapter) {
        this.aviVideoAdapter = aviVideoAdapter;
        this.movVideoAdapter = movVideoAdapter;
        this.wmvVideoAdapter = wmvVideoAdapter;
    }

    public Video uploadVideo(String videoPath) {
        this.videoAdapter = switch (videoPath.substring(videoPath.indexOf(".") + 1).toLowerCase()) {
            case "avi" -> new AviVideoAdapter();
            case "mov" -> new MovVideoAdapter();
            case "wmv" -> new WmvVideoAdapter();
            default -> throw new IllegalArgumentException("No adapter");
        };

        return this.videoAdapter.uploadVideo(videoPath);
    }

    public Stream streamVideo(UUID id) {
        return new Stream(id);
    }
}
