package org.autojava;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Solution349Test {

    Solution349 s = new Solution349();
    int[] pust = null;

    @Test
    public void intersectionTest0(){
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {4, 5, 6};
        assertArrayEquals(pust, s.intersection(ints1, ints2));
    }

    @Test
    public void intersectionTest1(){
        int[] ints1 = {1, 2, 2, 1};
        int[] ints2 = {2, 2};
        int[] result = {2};

        assertArrayEquals(result, s.intersection(ints1, ints2));
    }

    @Test
    public void intersectionTest2(){
        int[] ints1 = {4, 9, 5};
        int[] ints2 = {9, 4, 9, 8, 4};
        int[] result = s.intersection(ints1, ints2);
        boolean isAnswer = false;
        if ((result != null) && ((result[0] == 4 && result[1] == 9) || (result[1] == 4 && result[0] == 9))){
            isAnswer = true;
        }
        assertEquals(true, isAnswer);
    }

    @Test
    public void intersectionTest3(){
        int[] ints1 = {1};
        assertArrayEquals(ints1, s.intersection(ints1, ints1));
    }
}