package com.myprograms.solidprinciples.dip.gooddesign;

public class DatabaseWriter implements IWriter {
    @Override
    public void write(byte[] content) {
        System.out.println("Data is saved to database!");
    }
}
