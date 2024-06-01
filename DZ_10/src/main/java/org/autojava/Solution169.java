package org.autojava;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

public  class Solution169 {

    public int majorityElement(int[] nums){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        Integer number = -1;
        Integer maxCount = -1;
        for (Integer q: nums) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if (q == nums[j]) {
                    count++;
                }
            }
            map.put(q,count);
            if (maxCount < count){
                maxCount = count;
                number = q;
            }

        }
        int reternA = nums[0];

        if ((maxCount > nums.length / 2) && (maxCount != -1))  reternA = number;
        return reternA;
    }
}

