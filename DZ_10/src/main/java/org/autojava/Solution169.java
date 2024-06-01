package org.autojava;

import java.util.*;

public  class Solution169 {

    public int majorityElement(int[] nums){
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < nums.length ; i++) {
            int count =0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        int reternA = -1;

        if ((maxCount > nums.length / 2) && (index != -1) ) {
           reternA = nums[index];
        }
         else {
             reternA = nums[0];
        }
         return reternA;
    }
}
