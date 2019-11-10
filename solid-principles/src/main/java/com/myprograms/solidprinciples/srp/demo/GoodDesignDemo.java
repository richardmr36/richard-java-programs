package com.myprograms.solidprinciples.srp.demo;

import com.myprograms.solidprinciples.srp.gooddesign.AudioMedia;
import com.myprograms.solidprinciples.srp.gooddesign.FileWriter;
import com.myprograms.solidprinciples.srp.gooddesign.GoogleDriveWriter;
import com.myprograms.solidprinciples.srp.gooddesign.Media;
import com.myprograms.solidprinciples.srp.gooddesign.VideoMedia;

public class GoodDesignDemo {
    public static void main(String[] args) {
        Media videoMedia = new VideoMedia();
        videoMedia.setName("Harry Potter and the Goblet of Fire");
        videoMedia.setDuration(129);
        videoMedia.writeTo(new FileWriter());
        videoMedia.printInfo();

        System.out.println();

        Media audioMedia = new AudioMedia();
        audioMedia.setName("Hosonna");
        audioMedia.setDuration(5);
        audioMedia.writeTo(new GoogleDriveWriter());
        audioMedia.printInfo();
    }
}
