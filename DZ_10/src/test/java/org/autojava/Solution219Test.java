package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution219Test {
    Solution219 s = new Solution219();

    @Test
    public void test0() {
        int[] a = {0, 1, 2, 3, 4, 3, 5, 6, 7, 8, 9, 10};
        assertEquals(true, s.containsNearbyDuplicate(a, 2));
    }

    @Test
    public void test1() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(false, s.containsNearbyDuplicate(a, 2));
    }

    @Test
    public void test3() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(false, s.containsNearbyDuplicate(a, 2000));
    }
}