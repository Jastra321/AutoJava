package org.autojava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DZ4WorksTest {
    @org.junit.jupiter.api.Test
    void doCheckContains() {
        String l = "asadbut";
        String o = "sad";
        assertEquals(DZ4Works.doCheckStringContainsString(l , o),  1);

        String A = "leetcode";
        String B = "leeto";
        assertEquals(DZ4Works.doCheckStringContainsString(A , B),  -1);
    }


    @Test
    void doCheckMassContainsNumber() {
        Integer[] nums = {1,3,5,6};
        Integer x = 5;
        assertEquals(DZ4Works.doCheckMassContainsNumber(nums, x), 2);
        Integer y = 2;
        assertEquals(DZ4Works.doCheckMassContainsNumber(nums, y), 1);
    }

    @Test
    void doChekMassContainsDuplicate() {
        Integer[] nums = {1,2,3,1};
        assertEquals(DZ4Works.doChekMassContainsDuplicate(nums), true);
        Integer[] nums1 = {1,2,3,4};
        assertEquals(DZ4Works.doChekMassContainsDuplicate(nums1), false);
    }
}