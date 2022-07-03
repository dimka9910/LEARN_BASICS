package com.github.dimka9910.testtasks.leetCodeTasks.strings;

import org.junit.Test;

public class CountAndSay {

    @Test
    public void name() {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }

    public String countAndSay(int n) {

        String str;
        if (n > 1)
            str = countAndSay(n - 1);
        else
            return "1";

        StringBuilder sb = new StringBuilder();

        char[] chars = str.toCharArray();

        char prev = ' ';
        int counter = 0;
        for (int i = 0; i < chars.length; i++){
            if (prev != chars[i]){
                if (counter != 0){
                    sb.append(counter).append(prev);
                }
                counter = 1;
                prev = chars[i];
            } else
                counter++;
        }
        sb.append(counter).append(prev);
        return sb.toString();
    }

}
