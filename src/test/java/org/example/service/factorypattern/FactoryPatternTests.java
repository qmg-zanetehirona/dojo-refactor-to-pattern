package org.example.service.factorypattern;

import org.dojo.factorypattern.PaymentType;
import org.dojo.factorypattern.PaymentCreatorWithoutRefactoring;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryPatternTests {

    @Test
    @DisplayName("Payments No Refactored Test")
    void PaymentNoRefactoredTest() throws NoSuchFieldException {
        //Given
        PaymentCreatorWithoutRefactoring creatorWithoutRefactoring = new PaymentCreatorWithoutRefactoring();
        //When
        String actual1 = creatorWithoutRefactoring.createPayment(PaymentType.APPLE_PAY);
        String actual2 = creatorWithoutRefactoring.createPayment(PaymentType.BANK_TRANSFER);
        String actual3 = creatorWithoutRefactoring.createPayment(PaymentType.CREDIT_CARD);
        String actual4 = creatorWithoutRefactoring.createPayment(PaymentType.DEBIT_CARD);
        String actual5 = creatorWithoutRefactoring.createPayment(PaymentType.GOOGLE_PAY);
        //Then
        assertEquals("ApplePay Payment Created", actual1);
        assertEquals("Bank Transfer Payment Created", actual2);
        assertEquals("Credit Card Payment Created", actual3);
        assertEquals("Debit Card Payment Created", actual4);
        assertEquals("GooglePay Payment Created", actual5);
    }

}