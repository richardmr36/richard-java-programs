package com.myprograms.solidprinciples.srp.gooddesign;

public class VideoMedia extends Media {
    @Override
    public void printInfo() {
        System.out.println("This is a Video! It's name is "+getName()+" and duration is "+getDuration()+" minutes.");
    }
}
