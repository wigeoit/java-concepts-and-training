package test;

import leetcode.TwoSum;

public class TwoSumTest {
    public static void main(String[] args) {
        TwoSum twoSumTest = new TwoSum();
        int[] testArray = {5,6,7,2};

        int[] twoSumResult = twoSumTest.twoSum(testArray, 9);


        System.out.println("Position 1: " + twoSumResult[0]);
        System.out.println("Position 2: " + twoSumResult[1]);
    }
}
