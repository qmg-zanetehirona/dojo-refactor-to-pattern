package org.example.service.factorypattern;

import org.dojo.factorypattern.PaymentType;
import org.dojo.factorypattern.PaymentCreatorWithoutRefactoring;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryPatternPaymentsTests {

    @Test
    @DisplayName("Payments No Refactored Test")
    void PaymentNoRefactoredTest() throws NoSuchFieldException {
        //Given
        PaymentCreatorWithoutRefactoring creatorWithoutRefactoring = new PaymentCreatorWithoutRefactoring();
        //When
        String applePay = creatorWithoutRefactoring.createPayment(PaymentType.APPLE_PAY);
        String bankTransfer = creatorWithoutRefactoring.createPayment(PaymentType.BANK_TRANSFER);
        String creditCard = creatorWithoutRefactoring.createPayment(PaymentType.CREDIT_CARD);
        String debitCard = creatorWithoutRefactoring.createPayment(PaymentType.DEBIT_CARD);
        String googlePay = creatorWithoutRefactoring.createPayment(PaymentType.GOOGLE_PAY);
        //Then
        assertEquals("ApplePay Payment Created", applePay);
        assertEquals("Bank Transfer Payment Created", bankTransfer);
        assertEquals("Credit Card Payment Created", creditCard);
        assertEquals("Debit Card Payment Created", debitCard);
        assertEquals("GooglePay Payment Created", googlePay);
    }

}
