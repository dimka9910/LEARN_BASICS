package com.github.dimka9910.testtasks.leetCodeTasks.strings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ZigzagConversion {

    @Test
    void name() {

        String s = "PAYPALISHIRING";
        char[] charArray = s.toCharArray();
        int numRows = 3;

        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        StringBuilder stringBuilder = new StringBuilder(s.length());
        int step = 2 * (numRows - 1);
        for (int row = 1; row <= numRows; row++) {

            for (int i = row - 1; i < charArray.length; i+= step) {
                stringBuilder.append(charArray[i]);

                if (row != 1 && row != numRows && i + (numRows - row) * 2 < charArray.length)
                    stringBuilder.append(charArray[i + (numRows - row) * 2]);
            }
        }


        System.out.println(stringBuilder);
//        return stringBuilder.toString();

    }
}
