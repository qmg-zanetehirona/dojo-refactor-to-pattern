package org.dojo.strategypattern2;

import lombok.Getter;

@Getter
public class Debt {

    private final DebtType type;

    public Debt(DebtType type) {
        this.type = type;
    }

    public enum DebtType {
        STUDENT_LOAN,
        HOUSE_LOAN,
        CAR_LOAN,
        BUSINESS_LOAN
    }
}
