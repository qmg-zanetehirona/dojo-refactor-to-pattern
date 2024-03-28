package org.dojo.strategypattern2;

import java.util.List;

public class CriminalRecordChecker {
    public List<Records> check(Person person) {
        return person.getRecords();
    }

    public enum Records {
        MURDER,
        ARMED_ROBBERY,
        ASSAULT,
        DRUG_POSSESSION,
        THEFT,
        VANDALISM,
        SEXUAL_ASSAULT,
        FRAUD,
        DOMESTIC_VIOLENCE
    }
}
