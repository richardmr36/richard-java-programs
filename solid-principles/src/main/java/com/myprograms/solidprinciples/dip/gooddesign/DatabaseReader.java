package com.myprograms.solidprinciples.dip.gooddesign;

public class DatabaseReader implements IReader {
    @Override
    public byte[] read() {
        System.out.println("Data is read from database!");
        return new byte[0];
    }
}
