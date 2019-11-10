package com.myprograms.solidprinciples.dip.baddesign;

public class EncryptService {

    /*This encrypt() method depends on the input. If we change or add more input, we will have to modify the function*/
    public void encrypt(ConentSource source, ContentDestination destination) {
        byte[] content = null;
        switch (source) {
            case FILE:
                content = readFromFile();
                break;

            case DATABASE:
                content = readFromDatabase();
                break;
        }

        byte[] encryptContent = doEncrypt(content);
        switch (destination) {
            case FILE:
                writeToFile(encryptContent);
                break;

            case DATABASE:
                writeToDatabase(encryptContent);
        }
    }

    private byte[] doEncrypt(byte[] content) {
        return null;
    }

    private void writeToFile(byte[] encryptContent) {
    }

    private void writeToDatabase(byte[] encryptContent) {
    }

    private byte[] readFromFile() {
        return null;
    }

    private byte[] readFromDatabase() {
        return null;
    }
}
