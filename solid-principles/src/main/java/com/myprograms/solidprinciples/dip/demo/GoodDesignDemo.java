package com.myprograms.solidprinciples.dip.demo;

import com.myprograms.solidprinciples.dip.gooddesign.EncryptService;
import com.myprograms.solidprinciples.dip.gooddesign.DatabaseReader;
import com.myprograms.solidprinciples.dip.gooddesign.FileReader;
import com.myprograms.solidprinciples.dip.gooddesign.FileWriter;
import com.myprograms.solidprinciples.dip.gooddesign.WebServiceWriter;

public class GoodDesignDemo {
    public static void main(String[] args) {
        EncryptService encryptService = new EncryptService();
        encryptService.encrypt(new DatabaseReader(), new FileWriter());
        System.out.println();
        encryptService.encrypt(new FileReader(), new WebServiceWriter());
    }
}
