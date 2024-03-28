package org.dojo.strategypattern2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Person {
    String name;
    String lastName;
    int age;
    List<CriminalRecordChecker.Records> records;
    List<Debt> debts;
    MaritalStatus maritalStatus;
    boolean healthIssue;

    public enum MaritalStatus {
        SINGLE,
        MARRIED,
        WIDOW
    }
}
