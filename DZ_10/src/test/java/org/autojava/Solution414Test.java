package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution414Test {
    Solution414 s = new Solution414();

    @Test
    public void thirdMax0(){
        int[] nums = {3,2,1};
        assertEquals(1, s.thirdMax(nums));
    }

    @Test
    public void thirdMax1(){
        int[] nums = {1,2};
        assertEquals(2, s.thirdMax(nums));
    }

    @Test
    public void thirdMax2(){
        int[] nums = {2,2,3,1};
        assertEquals(1, s.thirdMax(nums));
    }
}