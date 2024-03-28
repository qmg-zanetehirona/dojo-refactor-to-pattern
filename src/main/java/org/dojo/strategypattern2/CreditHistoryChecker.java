package org.dojo.strategypattern2;

import java.util.List;

public class CreditHistoryChecker {
    public List<Debt> getDebts(Person person) {
       return person.getDebts();
    }
}
