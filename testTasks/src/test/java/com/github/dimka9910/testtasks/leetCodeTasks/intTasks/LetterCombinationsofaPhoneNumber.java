package com.github.dimka9910.testtasks.leetCodeTasks.intTasks;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombinationsofaPhoneNumber {
    @Test
    public void name() {

        System.out.println(letterCombinations("29"));
    }


    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1)
            return new ArrayList<>();

        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});

        List<StringBuilder> list = new LinkedList<>();
        char[] digitsArray = digits.toCharArray();
        int size = 1;
        int length = digits.length();

        for (char c : digitsArray) {
            size = size * map.get(c).length;
        }
        for (int i = 0; i < size; i++) {
            list.add(new StringBuilder());
        }

        for (char c : digitsArray) {
            Iterator<StringBuilder> iterator = list.iterator();
            char[] currentLetters = map.get(c);

            while (iterator.hasNext()) {
                for (int i = 0; i < currentLetters.length; i++) {
                    for (int j = 0; j < size / currentLetters.length; j++) {
                        iterator.next().append(currentLetters[i]);
                    }
                }
            }
            size = size / currentLetters.length;
        }
        return list.stream().map(String::new).collect(Collectors.toList());
    }
}
