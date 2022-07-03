package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionofTwoArrays {

    @Test
    public void testName() {
        System.out.println(intersection(new int[]{1,2,3,4,5}, new int[]{3,4,5,6}));

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);

        int[] res = new int[set1.size()];

        int i = 0;
        for (Integer j : set1){
            res[i++] = j;
        }

        // return set1.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }



}
