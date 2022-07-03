package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    @Test
    public void name() {

        System.out.println(generateParenthesis(3));

    }

    public List<String> generateParenthesis(int n) {
        List<String> resultList = new LinkedList<>();
        func(new StringBuilder("("), n - 1, n, 1, resultList);
        return resultList;
    }

    public void func(StringBuilder sb, int open, int closed, int sum, List<String> resultList){
        if (sum > 0){
            if (open > 0){
                StringBuilder sb1 = new StringBuilder(sb);
                sb1.append('(');
                func(sb1, open - 1, closed, sum + 1, resultList);
            }
            StringBuilder sb2 = new StringBuilder(sb);
            sb2.append(')');
            func(sb2, open, closed - 1, sum - 1, resultList);
        } else if (open > 0) {
            StringBuilder sb1 = new StringBuilder(sb);
            sb1.append('(');
            func(sb1, open - 1, closed, sum + 1, resultList);
        } else {
            resultList.add(new String(sb));
        }
    }
}
