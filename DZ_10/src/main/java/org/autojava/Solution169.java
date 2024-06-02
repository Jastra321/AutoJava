package org.autojava;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;

public  class Solution169 {

    public int majorityElement(int[] nums){
        //make
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        HashMap.Entry<Integer, Long> maxEntry = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(
                        (e1, e2) ->
                                e1.getValue() == e2.getValue()
                                        ?
                                        Long.compare(e1.getKey(), e2.getKey())
                                        :
                                        Long.compare(e1.getValue(), e2.getValue())
                )
                .get();
        //use
        int reternA = nums[0];
        boolean fined = false;
        for (int i = 0; i < nums.length; i++) {
            if ( (maxEntry.getKey() == nums[i]) && (maxEntry.getValue() > nums.length / 2) && (!fined) ){
                reternA = nums[i];
                fined = true;
                break;
            }
        }

        return reternA;
    }
}

