package com.github.dimka9910.testtasks.leetCodeTasks.strings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class LongestPalindromicSubstring {


    //fastest
    //https://www.youtube.com/watch?v=V-sEwsca1ak
    @Test
    void name2() {
        String s = "abaxabaxabyybaxabybbbbb";
        char[] oldchar = s.toCharArray();
        char[] charArray = new char[s.length()*2 + 1];
        int[] sizeArray = new int[s.length() * 2 + 1];
        charArray[0] = '|';
        IntStream.range(1, s.length() + 1).forEach(v -> {
            charArray[v * 2 - 1] = oldchar[v - 1];
            charArray[v * 2] = '|';
        });

        sizeArray[0] = 1;
        int r;

        for (int i = 1; i < charArray.length; i++){
            r = 1;
            while (i - r >= 0 && i + r < charArray.length && charArray[i-r] == charArray[i + r]){
                r++;
            }
            r--;
            sizeArray[i] = r * 2 + 1;

            if ((i + r) == charArray.length - 1)
                break;

            for (int j = 1; j <= r; j++){
                int tmp = r -j - (sizeArray[i - j] / 2);
                if (tmp > 0)
                    sizeArray[i + j] = sizeArray[i - j];
                else if (tmp < 0)
                    sizeArray[i + j] = sizeArray[i - j] + tmp * 2;
                else {
                    i = i + j - 1;
                    j = r + 1;
                }
            }
        }

        int maxpos = 0;
        r = sizeArray[0];
        for (int i = 1; i < sizeArray.length; i++){
            if (r < sizeArray[i]){
                r = sizeArray[i];
                maxpos = i;
            }
        }

        maxpos = maxpos / 2;
        r = r / 2;

        System.out.println(s.substring(maxpos - r / 2, maxpos - r / 2 + r));
    }

    @Test
    void name3() {
        String s = "abaxabaxabyybaxabybbbbb";
        char[] oldchar = s.toCharArray();
        int[] sizeArray = new int[s.length() * 2 + 1];

        sizeArray[0] = 1;
        sizeArray[1] = 3;
        int r;

        for (int i = 2; i < sizeArray.length; i++){
            r = 1;
            while (i - r >= 0 && i + r < sizeArray.length
                    && ((i - r) % 2 == 0 || oldchar[(i-r)/2] == oldchar[(i+r)/2])){
                r++;
            }
            r--;
            sizeArray[i] = r * 2 + 1;

            if ((i + r) == sizeArray.length - 1)
                break;

            for (int j = 1; j <= r; j++){
                int tmp = r -j - (sizeArray[i - j] / 2);
                if (tmp > 0)
                    sizeArray[i + j] = sizeArray[i - j];
                else if (tmp < 0)
                    sizeArray[i + j] = sizeArray[i - j] + tmp * 2;
                else {
                    i = i + j - 1;
                    j = r + 1;
                }
            }
        }

        int maxpos = 0;
        r = sizeArray[0];
        for (int i = 1; i < sizeArray.length; i++){
            if (r < sizeArray[i]){
                r = sizeArray[i];
                maxpos = i;
            }
        }

        maxpos = maxpos / 2;
        r = r / 2;

        System.out.println(s.substring(maxpos - r / 2, maxpos - r / 2 + r));
    }
}
