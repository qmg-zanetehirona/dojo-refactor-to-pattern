package org.example.service.strategypattern2;

import org.dojo.strategypattern2.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.dojo.strategypattern2.Debt.DebtType.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StrategyPatternInsuranceTest {

    @Test
    @DisplayName("Person Eligible for Insurance Test")
    void IsEligibleForInsurance() {
        //Given
        Person person = new Person("John", "Doe", 25, List.of(), List.of(), Person.MaritalStatus.SINGLE, false);
        Insurance insurance = new Insurance(new CreditHistoryChecker(), new CriminalRecordChecker(), new MedicalRecordChecker());
        //When
        boolean isEligibleForInsurance = insurance.isEligible(person);
        //Then
        assertTrue(isEligibleForInsurance);
    }

    @Test
    @DisplayName("Person Eligible for Insurance with Student_Loan")
    void IsEligibleForInsuranceJustStudentLoan() {
        //Given
        List<Debt> debts = List.of(new Debt(STUDENT_LOAN));
        Person person = new Person("John", "Doe", 25, List.of(), debts, Person.MaritalStatus.SINGLE, false);
        Insurance insurance = new Insurance(new CreditHistoryChecker(), new CriminalRecordChecker(), new MedicalRecordChecker());
        //When
        boolean isEligibleForInsurance = insurance.isEligible(person);
        //Then
        assertTrue(isEligibleForInsurance);
    }

    @Test
    @DisplayName("Person UnEligible for Medical Record")
    void personUnEligibleForInsuranceForMedicalRecord() {
        //Given
        Person person = new Person("John", "Doe", 25, List.of(), List.of(), Person.MaritalStatus.WIDOW, true);
        Insurance insurance = new Insurance(new CreditHistoryChecker(), new CriminalRecordChecker(), new MedicalRecordChecker());
        //When
        boolean isEligibleForInsurance = insurance.isEligible(person);
        //Then
        assertFalse(isEligibleForInsurance);
    }

    @Test
    @DisplayName("Person UnEligible for Criminal Record")
    void personUnEligibleForInsuranceForCriminalRecord() {
        //Given
        List<CriminalRecordChecker.Records> records = List.of(CriminalRecordChecker.Records.ASSAULT, CriminalRecordChecker.Records.DOMESTIC_VIOLENCE);
        Person person = new Person("John", "Doe", 25, records, List.of(), Person.MaritalStatus.SINGLE, false);
        Insurance insurance = new Insurance(new CreditHistoryChecker(), new CriminalRecordChecker(), new MedicalRecordChecker());
        //When
        boolean isEligibleForInsurance = insurance.isEligible(person);
        //Then
        assertFalse(isEligibleForInsurance);
    }

    @Test
    @DisplayName("Person UnEligible for Credit History")
    void personUnEligibleForInsuranceForCreditHistory() {
        //Given
        List<Debt> debts = List.of(new Debt(CAR_LOAN), new Debt(STUDENT_LOAN));
        Person person = new Person("John", "Doe", 25, List.of(), debts, Person.MaritalStatus.SINGLE, false);
        Insurance insurance = new Insurance(new CreditHistoryChecker(), new CriminalRecordChecker(), new MedicalRecordChecker());
        //When
        boolean isEligibleForInsurance = insurance.isEligible(person);
        //Then
        assertFalse(isEligibleForInsurance);
    }

    @Test
    @DisplayName("Person UnEligible for Age")
    void personUnEligibleForInsuranceForAge() {
        //Given
        Person person = new Person("John", "Doe", 12, List.of(), List.of(), Person.MaritalStatus.SINGLE, false);
        Insurance insurance = new Insurance(new CreditHistoryChecker(), new CriminalRecordChecker(), new MedicalRecordChecker());
        //When
        boolean isEligibleForInsurance = insurance.isEligible(person);
        //Then
        assertFalse(isEligibleForInsurance);
    }
}
