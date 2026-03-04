package org.example.clean_code.complex_task.task_2.adapters;

import org.example.clean_code.complex_task.task_2.Video;

public class WmvVideoAdapter implements VideoAdapter{
    @Override
    public Video uploadVideo() {
        return new Video();
    }
}
