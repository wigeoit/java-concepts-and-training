package test;

import leetcode.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    TwoSum test = new TwoSum();

    @Test
    void target9(){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expectedResult = {0,1};

        assertEquals(expectedResult[0], test.twoSum(nums, target)[0]);
        assertEquals(expectedResult[1], test.twoSum(nums, target)[1]);
    }

    @Test
    void target6(){
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedResult = {1,2};

        assertEquals(expectedResult[0], test.twoSum(nums, target)[0]);
        assertEquals(expectedResult[1], test.twoSum(nums, target)[1]);
    }

    @Test
    void target6Again(){
        int[] nums = {3,3};
        int target = 6;
        int[] expectedResult = {0,1};

        assertEquals(expectedResult[0], test.twoSum(nums, target)[0]);
        assertEquals(expectedResult[1], test.twoSum(nums, target)[1]);
    }
}
