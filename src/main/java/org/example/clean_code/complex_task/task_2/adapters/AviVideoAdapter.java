package org.example.clean_code.complex_task.task_2.adapters;

import org.example.clean_code.complex_task.task_2.Video;

public class AviVideoAdapter implements VideoAdapter{
    private Video video;

    //абстрактная работа с видео
    private Video convertVideo() {
        return video;
    }

    @Override
    public Video uploadVideo(String video) {
        this.video = new Video(video);
        return convertVideo();
    }
}
