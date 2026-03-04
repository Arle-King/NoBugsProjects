package org.example.clean_code.complex_task.task_2;

import org.example.clean_code.complex_task.task_2.adapters.AviVideoAdapter;
import org.example.clean_code.complex_task.task_2.adapters.MovVideoAdapter;
import org.example.clean_code.complex_task.task_2.adapters.WmvVideoAdapter;

public class Main {
    public static void main(String[] args) {
        VideoService videoService = new VideoService(new AviVideoAdapter(), new MovVideoAdapter(), new WmvVideoAdapter());

        String aviVideoPath = "path/to/example.avi";
        Video aviVideo = videoService.uploadVideo(aviVideoPath);
        Stream stream = videoService.streamVideo(aviVideo.getId());
        System.out.println("Streaming video in MP4 format, Video ID: " + aviVideo.getId());

        System.out.println();

        String mowVideoPath = "path/to/example.avi";
        Video mowVideo = videoService.uploadVideo(mowVideoPath);
        Stream stream2 = videoService.streamVideo(mowVideo.getId());
        System.out.println("Streaming video in MP4 format, Video ID: " + mowVideo.getId());


        System.out.println();


        String wmvVideoPath = "path/to/example.avi";
        Video wmvVideo = videoService.uploadVideo(wmvVideoPath);
        Stream stream3 = videoService.streamVideo(wmvVideo.getId());
        System.out.println("Streaming video in MP4 format, Video ID: " + wmvVideo.getId());
    }
}
