package test;

import leetcode.MedianOfTwoSortedArray;

public class MedianOfTwoSortedArrayTest {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4};

        // 0 1 2 3 4
        // 1 2 3 4 5

        MedianOfTwoSortedArray test = new MedianOfTwoSortedArray();
        System.out.println(test.findMedianSortedArrays(a,b));
    }
}
