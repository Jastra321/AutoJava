package org.autojava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//решить с помощью hashMap
//Если есть дубли, вернуть true

public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        boolean returnA = false;
        if (nums.length > 1) {
            Map.Entry<Integer, Long> maxEntry = getIntegerLongEntry(nums);

            if (maxEntry.getValue() > 1L) returnA = true;
        }
        return returnA;
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
}
