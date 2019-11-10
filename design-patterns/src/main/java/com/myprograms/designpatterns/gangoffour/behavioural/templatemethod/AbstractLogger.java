package com.myprograms.designpatterns.gangoffour.behavioural.templatemethod;

public abstract class AbstractLogger {
    protected boolean consoleLoggingEnabled;

    public boolean isConsoleLoggingEnabled() {
        return consoleLoggingEnabled;
    }

    public void setConsoleLoggingEnabled(boolean consoleLoggingEnabled) {
        this.consoleLoggingEnabled = consoleLoggingEnabled;
    }

    protected String serializeMessage(String message) {
        System.out.println("Serializing message");
        return message;
    }

    protected abstract void openDataStoreOperation();

    protected abstract void logMessage(String messageToLog);

    protected abstract void closeDataStoreOperation();

    protected void logToConsole(String messageToLog) {
        System.out.println("Writing in Console : " + messageToLog);
    }

    public void log(String message) {
        String messageToLog = serializeMessage(message);
        openDataStoreOperation();
        logMessage(messageToLog);
        closeDataStoreOperation();
        if (isConsoleLoggingEnabled()) {
            logToConsole(messageToLog);
        }
    }
}
