package org.dojo.strategypattern2;

import java.util.List;

import static org.dojo.strategypattern2.Debt.DebtType.STUDENT_LOAN;
import static org.dojo.strategypattern2.Person.MaritalStatus.WIDOW;

public class Insurance {

    private final CreditHistoryChecker creditHistoryChecker;
    private final CriminalRecordChecker criminalRecordChecker;
    private final MedicalRecordChecker medicalRecordChecker;

    public Insurance(CreditHistoryChecker creditHistoryChecker, CriminalRecordChecker criminalRecordChecker, MedicalRecordChecker medicalRecordChecker) {
        this.creditHistoryChecker = creditHistoryChecker;
        this.criminalRecordChecker = criminalRecordChecker;
        this.medicalRecordChecker = medicalRecordChecker;
        }

    public boolean isEligible(Person person) {

        boolean eligible = false;

        if (person.getAge() >= 18) {
            List<CriminalRecordChecker.Records> records = criminalRecordChecker.check(person);
            List<Debt> debts = creditHistoryChecker.getDebts(person);

            if (!records.isEmpty()) {
                eligible = false;
            } else if (!debts.isEmpty()) {
                for (int i = 0; i < debts.size(); i++) {
                    if (debts.size() == 1) {
                        if ((debts.get(i).getType().equals(STUDENT_LOAN))) {
                            eligible = true;
                        }
                    } else {
                        eligible = false;
                    }
                }
            } else if (person.getMaritalStatus().equals(WIDOW)) {
                if (medicalRecordChecker.suffersAnyHealthIssue(person)) {
                    eligible = false;
                }
            } else {
                eligible = true;
            }
        } else {
            eligible = false;
        }
        return eligible;
    }
}
