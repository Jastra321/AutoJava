package org.autojava;

import java.util.PriorityQueue;

/*
https://leetcode.com/problems/relative-ranks/description/

You are given an integer array score of size n, where score[i] is the score
of the ith athlete in a competition. All the scores are guaranteed to be unique.


The athletes are placed based on their scores, where the 1st place athlete has the highest score,
the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

The 1st place athlete's rank is "Gold Medal".
The 2nd place athlete's rank is "Silver Medal".
The 3rd place athlete's rank is "Bronze Medal".

For the 4th place to the nth place athlete, their rank is their placement number
(i.e., the xth place athlete's rank is "x").
        Return an array answer of size n where answer[i] is the rank of the ith athlete.
*/


public class Solution506 {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{score[i], i});
        }

        for (int rank = 1; rank <= n; rank++) {
            int[] top = maxHeap.poll();
            int index = top[1];
            if (rank == 1) {
                result[index] = "Gold Medal";
            } else if (rank == 2) {
                result[index] = "Silver Medal";
            } else if (rank == 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(rank);
            }
        }

        return result;
    }
}
