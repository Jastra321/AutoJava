package org.autojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

//Given two integer arrays nums1 and nums2, return an array of their intersection.
//Each element in the result must be unique and you may return the result in any order.
public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] answer = {};

        if ((nums1.length != 0) && (nums2.length != 0)) {
            HashSet<Integer> set1 = getIntegers(nums1);
            HashSet<Integer> set2 = getIntegers(nums2);

            ArrayList<Integer> arr = extracted(set1, set2);
            if (arr.size() > 0){
                answer = arr.stream().mapToInt(i -> i).toArray();
            }

        }
        return answer;
    }

    private ArrayList<Integer> extracted(HashSet<Integer> set1, HashSet<Integer> set2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer q : set1) {

            if (set2.contains(q)) {
                arr.add(q);
            }
        }
        return arr;
    }

    private static HashSet<Integer> getIntegers(int[] nums1) {
        HashSet<Integer> set1 = new HashSet<Integer>(Arrays.stream(nums1).boxed().toList());
        return set1;
    }

}
