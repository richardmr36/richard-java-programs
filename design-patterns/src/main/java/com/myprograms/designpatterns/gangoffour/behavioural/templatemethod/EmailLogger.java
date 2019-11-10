package com.myprograms.designpatterns.gangoffour.behavioural.templatemethod;

public class EmailLogger extends AbstractLogger {
    @Override
    protected void openDataStoreOperation() {
        System.out.println("Connecting to mail server and logging in.");
    }

    @Override
    protected void logMessage(String messageToLog) {
        System.out.println("Sending Email with Log Message : " + messageToLog);
    }

    @Override
    protected void closeDataStoreOperation() {
        System.out.println("Disposing Connection.");
    }
}
