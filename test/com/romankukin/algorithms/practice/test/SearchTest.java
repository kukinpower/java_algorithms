package com.romankukin.algorithms.practice.test;

import com.romankukin.algorithms.practice.BinarySearch;
import com.romankukin.algorithms.practice.LinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SearchTest {

    @Test
    void    simpleAssertions() {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            arr.add(i);
        }
        // Testing Linear Search
        Assertions.assertEquals(-1, LinearSearch.search(arr, 10));
        Assertions.assertEquals(4, LinearSearch.search(arr, 5));
        Assertions.assertEquals(7, LinearSearch.search(arr, 8));
        // Testing Binary Search
        Assertions.assertEquals(-1, BinarySearch.search(arr, 10));
        Assertions.assertEquals(4, BinarySearch.search(arr, 5));
        Assertions.assertEquals(7, BinarySearch.search(arr, 8));
    }
}