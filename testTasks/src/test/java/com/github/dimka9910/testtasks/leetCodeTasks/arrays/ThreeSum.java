package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.*;

public class ThreeSum {

    @Test
    public void name() {
        System.out.println(threeSum(new int[]{0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> resultList = new HashSet<>();

        for (int i = 0; i < nums.length; i++){

            int left = i+1;
            int right = nums.length - 1;

            if (nums[i] > 0)
                break;

            while (left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if (sum > 0)
                    right--;
                else if (sum < 0)
                    left ++;
                else {
                    resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
            }
        }

        return new ArrayList<>(resultList);
    }

}
