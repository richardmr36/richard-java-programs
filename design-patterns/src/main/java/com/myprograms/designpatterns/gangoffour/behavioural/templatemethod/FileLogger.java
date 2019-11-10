package com.myprograms.designpatterns.gangoffour.behavioural.templatemethod;

public class FileLogger extends AbstractLogger {
    @Override
    protected void openDataStoreOperation() {
        System.out.println("Opening File.");
    }

    @Override
    protected void logMessage(String messageToLog) {
        System.out.println("Appending Log message to file : " + messageToLog);
    }

    @Override
    protected void closeDataStoreOperation() {
        System.out.println("Closing File.");
    }
}
