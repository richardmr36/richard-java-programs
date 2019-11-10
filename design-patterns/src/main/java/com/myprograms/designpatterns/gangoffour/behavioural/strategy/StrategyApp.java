package com.myprograms.designpatterns.gangoffour.behavioural.strategy;

public class StrategyApp {
    public static void main(String[] args) {

        PersistedFile file = new PersistedFile("StrategyPatternSampleOutput.txt", "Hello, world!",
                new Sha256EncryptionAlgorithm()); //We can use factory method pattern to decide which algorithm to use.
        file.persist();
    }
}
