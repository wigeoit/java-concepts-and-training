package leetcode;

/*
    Link: https://leetcode.com/problems/maximum-sum-circular-subarray/

    Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

    A circular array means the end of the array connects to the beginning of the array.
    Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous
    element of nums[i] is nums[(i - 1 + n) % n].

    A subarray may only include each element of the fixed buffer nums at most once.
    Formally, for a subarray nums[i], nums[i + 1], ..., nums[j],
    there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.

    Example 1:
        Input: nums = [1,-2,3,-2]
        Output: 3
        Explanation: Subarray [3] has maximum sum 3.
 */

public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0;
        int curMin = 0;
        int sum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];

        for (int num : nums) {
            curMax = Math.max(curMax, 0) + num;
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin, 0) + num;
            minSum = Math.min(minSum, curMin);
            sum += num;
        }
        return sum == minSum ? maxSum : Math.max(maxSum, sum - minSum);
    }
}
