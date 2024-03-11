package org.dojo.extra;

public class ExtraNoRefactored {

//    int[]bagWeight = new int[]{25,55,75};
//    int numberOfBags = bagWeight.length;
//    int bagFees = 0;

    public int getBagFees(int numberOfBags, int[] bagWeight, int bagFees) {
        for (int i = 0; i < numberOfBags; i++) {
            if (i < 1) {
                if (bagWeight[i] < 50) {
                    if (i == 0) {
                        bagFees += 25;
                    } else {
                        bagFees += 35;
                    }
                } else if (bagWeight[i] < 70) {
                    if (i == 0) {
                        bagFees += 100;
                    } else if (i == 1) {
                        bagFees += 150;
                    } else {
                        bagFees += 200;
                    }
                } else {
                    bagFees += 200;
                }
            } else if (i >= 0 && bagWeight[i] < 70) {
                if (i == 1) {
                    bagFees += 100;
                } else {
                    bagFees += 150;
                }
            } else {
                bagFees += 200;
            }
        }
        return bagFees;
    }
}
