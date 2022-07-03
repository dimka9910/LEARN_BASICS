package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.LinkedList;

public class LongestIncreasingSubsequence {

    @Test
    public void name() {
        lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3});
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] min = new int[n + 1];

        min[1] = nums[0];

        int len = 1;

        for (int i = 1; i < nums.length; i++) {
            int left = 1;
            int right = len;
            while (left <= right) {
                int mid = left + ((right - left) >> 1);
                if (min[mid] < nums[i])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            min[left] = nums[i];
            len = Math.max(left, len);
        }
        return len;
    }

    public int recurse(LinkedList<Integer> list, int pos, int[] nums) {

        if (pos == nums.length)
            return list.size();

        if (list.size() == 0 || nums[pos] > list.getLast()) {
            if (nums[pos] - 1 == list.getLast()) {
                list.add(nums[pos]);
                return recurse(list, pos + 1, nums);
            }
            int size1 = recurse(new LinkedList<>(list), pos + 1, nums);
            list.add(nums[pos]);
            int size2 = recurse(list, pos + 1, nums);
            return Math.max(size1, size2);
        } else {
            return recurse(list, pos + 1, nums);
        }
    }
}
