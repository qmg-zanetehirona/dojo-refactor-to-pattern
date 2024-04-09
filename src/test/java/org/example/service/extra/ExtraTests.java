package org.example.service.extra;

import org.dojo.extra.ExtraNoRefactored;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraTests {

    @Test
    @DisplayName("Extra 1: Bags Fees Test")
    void BagFeesTest1() {
        //Given
        ExtraNoRefactored extraNoRefactored = new ExtraNoRefactored();
        int[] bagWeight = new int[]{25, 55, 75};
        int numberOfBags = bagWeight.length;
        int bagFees = 0;
        //When
        bagFees = extraNoRefactored.getBagFees(numberOfBags, bagWeight, bagFees);
        //Then
        assertEquals(375, bagFees);
    }

    @Test
    @DisplayName("Extra 1: Bags Fees Test")
    void BagFeesTest2() {
        //Given
        ExtraNoRefactored extraNoRefactored = new ExtraNoRefactored();
        int[] bagWeight = new int[]{70, 55, 75};
        int numberOfBags = bagWeight.length;
        int bagFees = 0;
        //When
        bagFees = extraNoRefactored.getBagFees(numberOfBags, bagWeight, bagFees);
        //Then
        assertEquals(550, bagFees);
    }

    @Test
    @DisplayName("Extra 1: Just one bag Test")
    void BagFeesTest3() {
        //Given
        ExtraNoRefactored extraNoRefactored = new ExtraNoRefactored();
        int[] bagWeight = new int[]{49};
        int numberOfBags = bagWeight.length;
        int bagFees = 0;
        //When
        bagFees = extraNoRefactored.getBagFees(numberOfBags, bagWeight, bagFees);
        //Then
        assertEquals(25, bagFees);
    }

    @Test
    @DisplayName("Extra 1: Bags Fees Test")
    void BagFeesTest4() {
        //Given
        ExtraNoRefactored extraNoRefactored = new ExtraNoRefactored();
        int[] bagWeight = new int[]{75, 10, 10};
        int numberOfBags = bagWeight.length;
        int bagFees = 0;
        //When
        bagFees = extraNoRefactored.getBagFees(numberOfBags, bagWeight, bagFees);
        //Then
        assertEquals(385, bagFees);
    }
}