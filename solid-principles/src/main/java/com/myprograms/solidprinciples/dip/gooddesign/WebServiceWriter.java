package com.myprograms.solidprinciples.dip.gooddesign;

public class WebServiceWriter implements IWriter {
    @Override
    public void write(byte[] content) {
        System.out.println("Data is sent to WebService");
    }
}
