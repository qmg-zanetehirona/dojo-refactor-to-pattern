package org.dojo.factorypattern;

import org.dojo.factorypattern.PaymentType;

public class PaymentCreatorWithoutRefactoring {

    public String createPayment(PaymentType paymentType) throws NoSuchFieldException {

        if (paymentType == PaymentType.APPLE_PAY) {
            return createApplePayPayment();
        } else if (paymentType == PaymentType.BANK_TRANSFER) {
            return createBankTransferPayment();
        } else if (paymentType == PaymentType.CREDIT_CARD) {
            return createCreditCardPayment();
        } else if (paymentType == PaymentType.DEBIT_CARD) {
            return createDebitCardPayment();
        } else if (paymentType == PaymentType.GOOGLE_PAY) {
            return createGooglePayPayment();
        } else {
            throw new NoSuchFieldException("Invalid Payment Type");
        }
    }
    public String createApplePayPayment() {
        return "ApplePay Payment Created";
    }

    public String createBankTransferPayment() {
        return "Bank Transfer Payment Created";
    }

    public String createCreditCardPayment() {return "Credit Card Payment Created";}

    public String createDebitCardPayment() {
        return "Debit Card Payment Created";
    }

    public String createGooglePayPayment() {
        return "GooglePay Payment Created";
    }
}
