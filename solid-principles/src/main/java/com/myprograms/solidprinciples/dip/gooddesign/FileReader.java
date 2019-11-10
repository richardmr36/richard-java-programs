package com.myprograms.solidprinciples.dip.gooddesign;

public class FileReader implements IReader {
    @Override
    public byte[] read() {
        System.out.println("Data is read from the file!");
        return new byte[0];
    }
}
