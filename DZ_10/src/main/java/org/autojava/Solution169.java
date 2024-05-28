package org.autojava;
import java.util.*;
//ищем первое число, которые повторяются чаще в половину массива раз.
//если с частотой в половину массива нет, то больше чем половину массива
//если половина массива равна единицы, выбираем первое значение из массива

public  class Solution169 {

    protected  int majorityElement(int[] nums){
        HashMap<Integer, Integer> counter = new HashMap<>();

        for (int a: nums) {
            counter.put(a, 1);
        }

        for (Integer i: counter.keySet()) {
            int k = 0;
            for (Integer q : nums) {
                if (q == i) {
                    k++;
                }
            }
            counter.put(i, k);
        }

        Integer count = nums[0];
        int maxCount =  nums.length / 2;

        for (int a: nums) {
            if (maxCount == 1) {
                break;
            }
            else if ( counter.get(a) > maxCount ) {
                count = a;
                maxCount = counter.get(a);
            } else if (counter.get(a) == maxCount ) {
                count = a;
                break;
            }
        }

        return count;
    }
}
