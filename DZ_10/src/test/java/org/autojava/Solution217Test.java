package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution217Test {
    Solution217 s = new Solution217();

    @Test
    public void Test0(){
        int[] a = {7, 8, 9, 9};
        assertEquals(true, s.containsDuplicate(a));
    }

    @Test
    public void Test1(){
        int[] a = {7, 8, 9, 10};
        assertEquals(false, s.containsDuplicate(a));
    }
}