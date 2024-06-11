package org.autojava;

/*
https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/
2357. Make Array Zero by Subtracting Equal Amounts

You are given a non-negative integer array nums. In one operation, you must:

Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
Subtract x from every positive element in nums.
Return the minimum number of operations to make every element in nums equal to 0.

 */

import java.util.HashSet;
import java.util.Set;
public class Solution2357 {
    public int minimumOperations(int[] nums) {
        Set<Integer> uniquePositives = new HashSet<>();

        for (int num : nums) {
            if (num > 0) {
                uniquePositives.add(num);
            }
        }

        return uniquePositives.size();
    }
}
