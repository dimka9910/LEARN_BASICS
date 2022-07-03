package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.Arrays;

public class ThreeSumClosest {

    @Test
    public void name() {
        System.out.println(threeSumClosest(new int[]{1, 2,4,8,16,32,64,128}, 82));
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > Math.abs(min))
                break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                int sum = nums[i] + nums[right] + nums[left];
                if (Math.abs(target - sum) <= Math.abs(target - min))
                    min = sum;

                if (sum < target)
                    left++;
                else if (sum > target)
                    right--;
                else
                    return min;
            }
        }
        return min;
    }

}
