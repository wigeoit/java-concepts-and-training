package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
    Link: https://leetcode.com/problems/non-decreasing-subsequences

    Given an integer array nums, return all the different possible non-decreasing subsequences of the given
    array with at least two elements. You may return the answer in any order.

    Input: nums = [4,6,7,7]
    Output: [[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
*/

public class NonDecreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> sequence = new ArrayList<>();
        backtrack(nums, 0, sequence, result);
        return new ArrayList(result);
    }

    private void backtrack(int[] nums, int index, List<Integer> sequence, Set<List<Integer>> result) {

        if (index == nums.length) {
            if (sequence.size() >= 2) {
                result.add(new ArrayList<>(sequence));
            }
            return;
        }

        if (sequence.isEmpty() || sequence.get(sequence.size() - 1) <= nums[index]) {
            sequence.add(nums[index]);
            backtrack(nums, index + 1, sequence, result);
            sequence.remove(sequence.size() - 1);
        }
        backtrack(nums, index + 1, sequence, result);
    }
}
