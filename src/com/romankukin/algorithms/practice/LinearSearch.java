package com.romankukin.algorithms.practice;

import java.util.List;

public class LinearSearch {

    /**
     * Searching n in array
     * Linear Search complexity: O(n)
     * @param arr array where to search
     * @param n integer to search
     * @return index of array where value is stored
     * or -1 in case of value was not found
     */
    public static int search(List<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n) {
                return i;
            }
        }
        return -1;
    }
}
