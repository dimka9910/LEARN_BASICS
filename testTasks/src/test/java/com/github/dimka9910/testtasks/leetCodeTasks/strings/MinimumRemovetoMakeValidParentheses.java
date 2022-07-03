package com.github.dimka9910.testtasks.leetCodeTasks.strings;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.LinkedList;

@SpringBootTest
public class MinimumRemovetoMakeValidParentheses {

    /**
     * Given a string s of '(' , ')' and lowercase English characters.
     *
     * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions )
     * so that the resulting parentheses string is valid and return any valid string.
     *
     * Formally, a parentheses string is valid if and only if:
     *
     * It is the empty string, contains only lowercase characters, or
     * It can be written as AB (A concatenated with B), where A and B are valid strings, or
     * It can be written as (A), where A is a valid string.
     */

    @Test
    void name() {
        String str = "ff))ff((ff";
        char[] charArray = str.toCharArray();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int countBrackets = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                countBrackets++;
                linkedList.addFirst(i);
            } else if (charArray[i] == ')') {
                if (countBrackets > 0) {
                    countBrackets--;
                    linkedList.removeFirst();
                } else {
                    linkedList.addLast(i);
                }
            }
        }

        for (Integer pos : linkedList) {
            charArray[pos] = ' ';
        }

        String res = new String(charArray).replaceAll(" ", "");
        System.out.println(res);
    }
}
