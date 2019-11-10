package com.myprograms.solidprinciples.dip.gooddesign;

public class WebServiceReader implements IReader {
    @Override
    public byte[] read() {
        System.out.println("Data is read from Webservice!");
        return new byte[0];
    }
}
