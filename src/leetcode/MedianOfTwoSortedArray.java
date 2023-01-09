package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    Problem link: https://leetcode.com/problems/median-of-two-sorted-arrays/

    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

    The overall run time complexity should be O(log (m+n)).

    Example 1:
        Input: nums1 = [1,3], nums2 = [2]
        Output: 2.00000
        Explanation: merged array = [1,2,3] and median is 2.

    Example 2:
        Input: nums1 = [1,2], nums2 = [3,4]
        Output: 2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

*/

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        boolean lengthIsEven = false;
        if((nums1.length + nums2.length) % 2 == 0){
            lengthIsEven = true;
        }
        int medianIndex = (nums1.length + nums2.length)/2;

        List<Integer> mergedList = new ArrayList<>();
        if(nums1.length >= nums2.length){
            for(int i = 0; i < nums1.length; i++){
                mergedList.add(nums1[i]);
                if(i < nums2.length ){
                    mergedList.add(nums2[i]);
                }
            }
        }else{
            for(int i = 0; i < nums2.length; i++){
                mergedList.add(nums2[i]);
                if(i < nums1.length ){
                    mergedList.add(nums1[i]);
                }
            }
        }

        List<Integer> sortedList = mergedList.stream().sorted().collect(Collectors.toList());

        if(!lengthIsEven){
            return (double)(sortedList.get(medianIndex));
        }else{
            return (double) (sortedList.get(medianIndex-1)+sortedList.get(medianIndex))/2;
        }
    }
    public double findMedianSortedArraysV2(int[] nums1, int[] nums2) {
        boolean lengthIsEven = false;
        if((nums1.length + nums2.length) % 2 == 0){
            lengthIsEven = true;
        }
        int medianIndex = (nums1.length + nums2.length)/2;

        List<Integer> mergedList = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            mergedList.add(nums1[i]);

        }
        for(int i = 0; i < nums2.length; i++){
            mergedList.add(nums2[i]);
        }
        List<Integer> sortedList = mergedList.stream().sorted().collect(Collectors.toList());

        if(!lengthIsEven){
            return (double)(sortedList.get(medianIndex));
        }else{

            return (double) (sortedList.get(medianIndex-1)+sortedList.get(medianIndex))/2;
        }
    }
}
