package test;

import leetcode.MaximumSumCircularSubarray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MaximumSumCircularSubarrayTest {
    MaximumSumCircularSubarray test = new MaximumSumCircularSubarray();
    @Test
    void firstTest(){
        int[] nums = {1,12,3,-2};
        int expectedResult = 16;

        assertEquals(expectedResult, test.maxSubarraySumCircular(nums) );
    }
}