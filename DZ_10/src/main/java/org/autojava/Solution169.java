package org.autojava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//вернуть элемент, который повторяется максимальное колчество раз и не менее половины длинны массива раз.
//если нужого нет, вернуть первый.
public  class Solution169 {

    public int majorityElement(int[] nums) {
        int reternA = nums[0];

        //проверка на пустой массив и уникальность элементов массива
        boolean isUnique = false;
        isUnique = isUnique(nums, isUnique);

        //анализ дублей
        if (!isUnique) {
            Map.Entry<Integer, Long> maxEntry = getIntegerLongEntry(nums);
            if (maxEntry.getValue() > (nums.length / 2))    reternA = maxEntry.getKey();
        }
        return reternA;
    }

    private Map.Entry<Integer, Long> getIntegerLongEntry(int[] nums) {
        HashMap.Entry<Integer, Long> maxEntry = Arrays.stream(nums).boxed()
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
        return maxEntry;
    }

    private boolean isUnique(int[] nums, boolean isUnique) {
        if (nums.length < 2) isUnique = true;
        HashSet<Integer> set = new HashSet<Integer>(Arrays.stream(nums).boxed().toList());
        if (set.size() == nums.length) isUnique = true;
        return isUnique;
    }
}

