package org.autojava;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution506Test {
    Solution506 s = new Solution506();

    @Test
    public void findRelativeRanksTest0(){
        int[] a = {5,4,3,2,1};
        String[] result = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        assertArrayEquals(result, s.findRelativeRanks(a));
    }

    @Test
    public void findRelativeRanksTest2(){
        int[] a = {10,3,8,9,4};
        String[] result = {"Gold Medal","5","Bronze Medal","Silver Medal","4"};
        assertArrayEquals(result, s.findRelativeRanks(a));
    }

}