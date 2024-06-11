package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2357Test {
    Solution2357 s = new Solution2357();

    @Test
    public void minimumOperations0(){
        int[] a = {1,5,0,3,5};
        assertEquals(3, s.minimumOperations(a));
    }

    @Test
    public void minimumOperations1(){
        int[] a = {0};
        assertEquals(0, s.minimumOperations(a));
    }
}