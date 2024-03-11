package org.example.service.extra;

import org.dojo.extra.ExtraNoRefactored;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraTests {

    @Test
    @DisplayName("Extra 1: Bags Fees Test")
    void BagFeesTest() {
        //Given
        ExtraNoRefactored extraNoRefactored = new ExtraNoRefactored();
        int[] bagWeight = new int[]{25, 55, 75};
        int numberOfBags = bagWeight.length;
        int bagFees = 0;
        //When
        bagFees = extraNoRefactored.getBagFees(numberOfBags, bagWeight, bagFees);
        //Then
        assertEquals(325, bagFees);
    }
}