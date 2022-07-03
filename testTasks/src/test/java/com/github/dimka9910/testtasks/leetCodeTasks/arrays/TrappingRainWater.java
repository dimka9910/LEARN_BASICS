package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TrappingRainWater {

    @Test
    void name() {
        System.out.println(trap2(new int[]{1}));
    }

    public int trap(int[] height) {
        int right = height.length - 1;
        int left = 0;
        int area = 0;
        if (height.length < 3)
            return 0;

        int lastHeight = Math.min(height[right] , height[left]);
        area += lastHeight * (right - left - 1);
        while (left< right - 1){
            if (height[left] < height[right]){
                left++;
                area -= Math.min(height[left], lastHeight);
            } else {
                right --;
                area -= Math.min(height[right], lastHeight);
            }
            int newHeight = Math.min(height[right] , height[left]);
            if (newHeight > lastHeight){
                area += (newHeight - lastHeight) * (right - left - 1);
                lastHeight = newHeight;
            }
        }
        return area;
    }

    public int trap2(int[] height) {
        if (height.length < 3)
            return 0;

        int result =0, level=0, left = 0, right = height.length - 1;

        while(left < right)
        {
            int lower = height[height[left] < height[right]? left++:right--];
            level = Math.max(level,lower);
            result+=level-lower;

        }
        return result;
    }
}
