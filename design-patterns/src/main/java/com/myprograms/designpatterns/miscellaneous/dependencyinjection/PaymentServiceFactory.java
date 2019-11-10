package com.myprograms.designpatterns.miscellaneous.dependencyinjection;

public class PaymentServiceFactory {
    public static PaymentService getPaymentService(String paymentType) {
        if (paymentType == null) {
            return null;
        }
        if (paymentType.equalsIgnoreCase("CASH")) {
            return new CashPaymentService();
        }
        if (paymentType.equalsIgnoreCase("CARD")) {
            return new CardPaymentService();
        }

        return null;
    }
}
