package test;

import leetcode.MedianOfTwoSortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MedianOfTwoSortedArrayTest {
    MedianOfTwoSortedArray test = new MedianOfTwoSortedArray();

    @Test
    void returnsTwo(){
        int[] nums1 ={1,3};
        int[] nums2 ={2};
        double expectedResult = 2.0;

        assertEquals(expectedResult, test.findMedianSortedArrays(nums1, nums2));
    }
    @Test
    void returnsTwoPointFive(){
        int[] nums1 ={1,2};
        int[] nums2 ={3,4};
        double expectedResult = 2.5;

        assertEquals(expectedResult, test.findMedianSortedArrays(nums1, nums2));
    }
}
