package org.autojava;

import java.util.Arrays;
import java.util.HashSet;
//Given an integer array nums and an integer k,
// //return true if there are two distinct indices i and j in the array
// such that nums[i] == nums[j] and abs(i - j) <= k.
//Решить с помощью HashSet.

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean isAnswer = false;
        if ((k >= 1) && (nums.length > 1)) {

        //проверка на уникальность элементов массива
            boolean isUnique = false;
            HashSet<Integer> set = new HashSet<Integer>(Arrays.stream(nums).boxed().toList());
            if (set.size() == nums.length) isUnique = true;
        //поиск дубликатов
            if (!isUnique) {

                int i = 0;
                do {
                    set.clear();
                    int x = 0;
                    if  ((i + k) < (nums.length - 1)) {
                         x = i + k;
                    } else {
                         x = nums.length - 1;
                    }
                    set.add(nums[i]);
                    isAnswer = isAnswer(nums, i, x, set, isAnswer);

                    i++;
                } while ((i < nums.length) && (!isAnswer));

            }
        }
        return isAnswer;
    }

    private boolean isAnswer(int[] nums, int i, int x, HashSet<Integer> set, boolean isAnswer) {
        for (int j = (i + 1); j <= x; j++) {
            if (!set.add(nums[j])) {
                isAnswer = true;
                break;
            }
        }
        return isAnswer;
    }
}
