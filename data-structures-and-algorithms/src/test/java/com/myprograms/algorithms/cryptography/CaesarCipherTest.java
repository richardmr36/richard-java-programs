package com.myprograms.algorithms.cryptography;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaesarCipherTest {

    @Test
    public void encrypt() {
        CaesarCipher caesarCipher = new CaesarCipher();
        final String word = "middle-Outz";
        final int rotation = 2;
        final String result = "okffng-Qwvb";
        assertEquals("Cipher word is wrong", result, caesarCipher.encrypt(word, rotation));
    }


    @Test
    public void encryptTextAlone() {
        CaesarCipher caesarCipher = new CaesarCipher();
        final String word = "middleOutz";
        final int rotation = 2;
        final String result = "okffngQwvb";
        assertEquals("Cipher word is wrong", result, caesarCipher.encryptTextAlone(word, rotation));
    }
}