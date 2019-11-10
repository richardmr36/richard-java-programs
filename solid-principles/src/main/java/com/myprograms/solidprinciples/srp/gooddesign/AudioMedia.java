package com.myprograms.solidprinciples.srp.gooddesign;

public class AudioMedia extends Media {
    @Override
    public void printInfo() {
        System.out.println("This is a Audio! It's name is "+getName()+" and duration is "+getDuration()+" minutes.");
    }
}
