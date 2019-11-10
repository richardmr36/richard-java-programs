package com.myprograms.solidprinciples.dip.gooddesign;

public class EncryptService {
    /*This method does not depend on input data. When we add new type of input/output data, current code has no change
    * Adding WebServiceReader and WebServiceWriter now*/
    public void encrypt(IReader reader, IWriter writer) {
        byte[] content = reader.read();
        byte[] encryptContent = doEncrypt(content);
        writer.write(encryptContent);
    }

    private byte[] doEncrypt(byte[] content) {
        return null;
    }
}
