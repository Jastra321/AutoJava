package org.autojava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//решить с помощью hashMap
//Если есть дубли, вернуть true

public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
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
        boolean returnA = false;
        if (maxEntry.getValue() > 1L) returnA = true;
        return returnA;
    }
}
