package com.myprograms.designpatterns.gangoffour.behavioural.strategy;


import org.apache.commons.codec.digest.DigestUtils;

public class Sha512EncryptionAlgorithm implements EncryptionAlgorithm {
    @Override
    public String encrypt(String plaintext) {
        return DigestUtils.sha512Hex(plaintext);
    }
}
