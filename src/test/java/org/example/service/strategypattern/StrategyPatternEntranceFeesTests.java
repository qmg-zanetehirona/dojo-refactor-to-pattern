package org.example.service.strategypattern;

import org.dojo.strategypattern.EntranceFeeCalculator;
import org.dojo.strategypattern.TicketType;
import org.dojo.strategypattern.Visitor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyPatternEntranceFeesTests {

    @Test
    @DisplayName("Entrance Fees for Children Full Day Test")
    void EntranceFeesChildFullday() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(12), TicketType.FULLDAY);
        assertEquals(50, calculateEntranceFees);
    }

    @Test
    @DisplayName("Entrance Fees for Children Half Day Test")
    void EntranceFeesChildHalfday() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(6), TicketType.HALFDAY);
        assertEquals(20, calculateEntranceFees);
    }

    @Test
    @DisplayName("Entrance Fees for Adults Full Day Test")
    void EntranceFeesAdultFullday() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(26), TicketType.FULLDAY);
        assertEquals(120, calculateEntranceFees);
    }

    @Test
    @DisplayName("Entrance Fees for Adult Half Day Test")
    void EntranceFeesAdultHalfday() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(36), TicketType.HALFDAY);
        assertEquals(60, calculateEntranceFees);
    }
}