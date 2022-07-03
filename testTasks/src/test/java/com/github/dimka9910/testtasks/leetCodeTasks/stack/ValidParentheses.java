package com.github.dimka9910.testtasks.leetCodeTasks.stack;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    @Test
    public void name() {
        System.out.println(isValid("(){}({}))"));
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                stack.push(c);
            } else if (!stack.empty()) {
                if (map.get(c) != stack.pop())
                    return false;
            } else {
                return false;
            }
        }
        return stack.empty();
    }
}
