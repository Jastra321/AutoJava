package org.autojava;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;
//вернуть элемент, который повторяется максимальное колчество раз и не менее половины длинны массива раз.
//если нужого нет, вернуть первый.
public  class Solution169 {

    public int majorityElement(int[] nums) {
        int reternA = nums[0];
        //проверка на уникальность элементов массива
        boolean isUnique = false;
        HashSet<Integer> set = new HashSet<Integer>(Arrays.stream(nums).boxed().toList());
        if (set.size() == nums.length) isUnique = true;

        //анализ дублей
        if (!isUnique) {

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

            System.out.println(" " + maxEntry.getKey() + " " + maxEntry.getValue());
            if (maxEntry.getValue() > (nums.length / 2))    reternA = maxEntry.getKey();

        }
        return reternA;
    }
}

