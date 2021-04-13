package com.romankukin.algorithms.practice;

import java.util.List;

public class BinarySearch {

    /**
     * Iterative Binary Search
     * Complexity: O(lg n)
     * @param arr sorted array of integers
     * @param n integer to search
     * @return position of an n in arr
     * or -1 if no integer n presented in arr
     */
    public static int search(List<Integer> arr, int n) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (arr.get(mid) == n) {
                return mid;
            } else if (arr.get(mid) < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
