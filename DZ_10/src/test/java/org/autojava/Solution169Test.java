package org.autojava;

import com.sun.source.tree.IfTree;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.lang.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution169Test {
    int[] v = new int[]{1,2,3};
    int[] v1 = new int[]{1,2,3,4,5,5};
    int[] v2 = new int[]{1,2,3,1,5,1};
    int[] v3 = new int[]{2,2,1,1,1};
    int[] v4 = new int[]{1};
    int[] v5 = new int[]{6,5,5};
    int[] v6 = new int[]{3, 3,4};
    int[] v7 = new int[]{5,5,5,2,4,4,4};


    Solution169 s = new Solution169();

    @Test
    public void majorityElementTest() {
        assertEquals( 1, s.majorityElement(v) );
    }

    @Test
    public void majorityElementTest1() {
        assertEquals( 1, s.majorityElement(v1) );
    }

    @Test
    public void majorityElementTest2() {
        assertEquals( 1, s.majorityElement(v2) );
    }

    @Test
    public void majorityElementTest3() {
        assertEquals( 1, s.majorityElement(v3) );
    }

    @Test
    public void majorityElementTest4() {
        assertEquals( 1, s.majorityElement(v4) );
    }

    @Test
    public void majorityElementTest5() {
        assertEquals( 5, s.majorityElement(v5) );
    }

    @Test
    public void majorityElementTest6() {
        assertEquals( 3, s.majorityElement(v6) );
    }
    @Test
    public void majorityElementTest7() {
        assertEquals( 5, s.majorityElement(v7) );
    }
}