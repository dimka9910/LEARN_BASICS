package com.github.dimka9910.testtasks.leetCodeTasks.strings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringtoIntegerAtoi {

    @Test
    void name() {
        System.out.println(myAtoi("-4193 with words"));
    }

    public int myAtoi(String s) {
        //int a = '0'; //48
        //int b = '9'; //58
        char[] chars = s.trim().toCharArray();
        if (chars.length == 0)
            return 0;

        boolean minus = false;
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        if (chars[0] == '-' || chars[0] == '+') {
            minus = chars[0] == '-';
            i++;
        }
        while (i < chars.length && chars[i] >= 48  && chars[i] <= 58){
            stringBuilder.append(chars[i]);
            i++;
        }
        if (stringBuilder.length() == 0){
            return 0;
        }
        if (minus)
            stringBuilder.insert(0,'-');
        try {
            return Integer.parseInt(stringBuilder.toString());
        } catch (Exception e){
            return minus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
