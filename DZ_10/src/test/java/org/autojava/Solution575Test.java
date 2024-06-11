package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution575Test {
    Solution575 s = new Solution575();

    @Test
    public void distributeCandies0() {
        int[] a = {1,1,2,2,3,3};
        assertEquals(3, s.distributeCandies(a));
    }

    @Test
    public void distributeCandies1() {
        int[] a = {1,1,2,3};
        assertEquals(2, s.distributeCandies(a));
    }

    @Test
    public void distributeCandies2() {
        int[] a = {6,6,6,6};
        assertEquals(1, s.distributeCandies(a));
    }

}