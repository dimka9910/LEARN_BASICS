package com.github.dimka9910.testtasks.leetCodeTasks.intTasks;

import org.junit.Test;

public class DivideTwoIntegers {

    @Test
    public void name() {
        divide(-2147483648, -1);
    }

    public int divide(int dividend, int divisor) {
        if (dividend == 0)
            return 0;

        boolean minus = false;
        if (dividend < 0) {
            minus = true;
        }
        if (divisor < 0) {
            if (divisor < 0 ^ minus)
                divisor = -divisor;
            minus = !minus;
        }

        int res = 0;
        for (int i = dividend; i - divisor >= 0; i -= divisor, res++) {
        }

        return minus ? -res : res;

    }
}
