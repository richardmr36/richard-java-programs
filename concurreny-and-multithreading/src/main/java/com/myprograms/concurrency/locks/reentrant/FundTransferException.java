package com.myprograms.concurrency.locks.reentrant;

public class FundTransferException extends Exception {
    private ERROR_CODE errorCode;

    private Exception originalException;
    public FundTransferException(Exception ex, ERROR_CODE ec) {
        originalException = ex;
        errorCode = ec;
    }

    public FundTransferException(ERROR_CODE ec) {
        errorCode = ec;
    }

    public static void main(String[] args) {
        System.out.println(ERROR_CODE.INSUFFICIENT_BALENCE.errorMessage);
    }

    public ERROR_CODE getErrorCode() {
        return errorCode;
    }

    public Exception getOriginalException() {
        return originalException;
    }

    enum ERROR_CODE {
        INSUFFICIENT_BALENCE("Insufficent Balance"), TRANSACTION_TIMEOUT("Transaction Timed Out"), SERVICE_UNAVAILABLE(
                "Service Unavailable");
        private String errorMessage;

        ERROR_CODE(String message) {
            errorMessage = message;
        }
    }
}