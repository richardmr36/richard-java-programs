package com.myprograms.solidprinciples.srp.gooddesign;

public class GoogleDriveWriter implements IWriter {
    @Override
    public void saveTo(String filename) {
        System.out.println("Saving this file to Google Drive!");
    }
}
