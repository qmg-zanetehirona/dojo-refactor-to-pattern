package org.dojo.strategypattern;

public class EntranceFeeCalculator {
    private static final double CHILD_PRICE_BASE = 100;
    private static final double ADULT_PRICE_BASE = 100;

    public double calculateEntranceFee(Visitor visitor, TicketType ticketType) {

        double fee = 0;
        if (visitor.getAge() > 14 && TicketType.HALFDAY == ticketType) {
            fee = ADULT_PRICE_BASE * 0.6;
        } else if (visitor.getAge() > 14 && TicketType.FULLDAY == ticketType) {
            fee = ADULT_PRICE_BASE * 1.2;
        }

        if (visitor.getAge() <= 14 && TicketType.HALFDAY == ticketType) {
            fee = CHILD_PRICE_BASE * 0.2;
        } else if (visitor.getAge() <= 14 && TicketType.FULLDAY == ticketType) {
            fee = CHILD_PRICE_BASE * 0.5;
        }
        return fee;
    }
}
