package org.example.service.strategypattern;

import org.dojo.strategypattern.EntranceFeeCalculator;
import org.dojo.strategypattern.TicketType;
import org.dojo.strategypattern.Visitor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyPatternTests {

    @Test
    @DisplayName("Entrance Fees Test")
    void EntranceFeesTest1() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(12), TicketType.FULLDAY);
        assertEquals(50, calculateEntranceFees, 0.01);
    }

    @Test
    @DisplayName("Entrance Fees Test")
    void EntranceFeesTest2() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(6), TicketType.HALFDAY);
        assertEquals(20, calculateEntranceFees, 0.01);
    }

    @Test
    @DisplayName("Entrance Fees Test")
    void EntranceFeesTest3() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(26), TicketType.FULLDAY);
        assertEquals(120, calculateEntranceFees, 0.01);
    }

    @Test
    @DisplayName("Entrance Fees Test")
    void EntranceFeesTest4() {
        //Given
        double calculateEntranceFees = new EntranceFeeCalculator().calculateEntranceFee(new Visitor(36), TicketType.HALFDAY);
        assertEquals(60, calculateEntranceFees, 0.01);
    }
}