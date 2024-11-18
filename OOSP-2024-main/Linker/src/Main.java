package main;

import models.Folder;
import models.Video;
import models.VideoComponent;

public class Main {
    public static void main(String[] args) {
        VideoComponent video1 = new Video("Video1.mp4");
        VideoComponent video2 = new Video("Video2.mp4");
        VideoComponent video3 = new Video("Video3.mp4");

        Folder folder1 = new Folder("Folder1");
        folder1.addComponent(video1);
        folder1.addComponent(video2);

        Folder folder2 = new Folder("Folder2");
        folder2.addComponent(video3);

        Folder rootFolder = new Folder("RootFolder");
        rootFolder.addComponent(folder1);
        rootFolder.addComponent(folder2);

        rootFolder.print();
    }
}