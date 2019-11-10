package com.myprograms.solidprinciples.srp.gooddesign;

public class FileWriter implements IWriter {
    @Override
    public void saveTo(String filename) {
        System.out.println("Saving this file to disk!");
    }
}
