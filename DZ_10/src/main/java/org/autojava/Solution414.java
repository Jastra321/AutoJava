package org.autojava;

/*
https://leetcode.com/problems/third-maximum-number/description/

Given an integer array nums, return the third distinct maximum number in this array.
If the third maximum does not exist, return the maximum number.
*/


public class Solution414 {
    public int thirdMax(int[] nums) {
        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        int elementMax = -2*10^31;

        for (Integer num : nums) {
            if (num >  elementMax)  elementMax=num;

            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        return (thirdMax != null) ? thirdMax : elementMax;
    }
}
