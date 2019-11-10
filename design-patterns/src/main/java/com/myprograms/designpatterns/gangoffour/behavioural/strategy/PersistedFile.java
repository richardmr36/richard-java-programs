package com.myprograms.designpatterns.gangoffour.behavioural.strategy;

import java.io.FileOutputStream;
import java.io.IOException;

public class PersistedFile {
    private final String path;
    private final String contents;
    private final EncryptionAlgorithm cipher;

    public PersistedFile(String path, String contents, EncryptionAlgorithm cipher) {
        this.path = path;
        this.contents = contents;
        this.cipher = cipher;
    }

    public void persist() {
        String cypherText = cipher.encrypt(contents);
        try (FileOutputStream outputStream = new FileOutputStream(path)) {
            outputStream.write(cypherText.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
