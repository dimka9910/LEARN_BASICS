package com.github.dimka9910.testtasks.leetCodeTasks.intTasks;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReverseInteger {
    @Test
    void name() {
        reverse(1534236469);
    }

    public int reverse(int x) {
        int res = 0;
        byte minus = 1;

        StringBuilder sb = new StringBuilder();

        if (x < 0){
            if (x == Integer.MIN_VALUE)
                return 0;
            minus = -1;
            x = -x;
        }

        while (x > 0){
            sb.append(x % 10);
            x = x / 10;
        }

        try {
            return Integer.parseInt(sb.toString()) * minus;
        } catch (Exception e){
            return 0;
        }
    }
}
