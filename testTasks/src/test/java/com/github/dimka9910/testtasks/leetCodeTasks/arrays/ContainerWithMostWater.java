package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ContainerWithMostWater {
    @Test
    void name() {
    }

    public int maxArea(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int area = 0;
        while (right != left) {
            area = Math.max(Math.min(height[left], height[right]) * (right - left), area);
            if (height[right] < height[left])
                right--;
            else
                left++;
        }
        return area;
    }
}
