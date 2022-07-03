package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class NextPermutation {

    @Test
    public void name() {
        int[] a = new int[]{2,3,1};
        nextPermutation(a);
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    public void nextPermutation(int[] nums) {
        int i = 0;
        for (i = nums.length - 1; i > 0; i--){
            if (nums[i] > nums[i-1]){
                int j = 0;
                for (j = nums.length - 1; j > i -1 && nums[j] <= nums[i-1]; j--){}
                int tmp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = tmp;

                Arrays.sort(nums, i, nums.length);
                break;
            }
        }
        if (i == 0){
            Arrays.sort(nums);
        }
    }
}
