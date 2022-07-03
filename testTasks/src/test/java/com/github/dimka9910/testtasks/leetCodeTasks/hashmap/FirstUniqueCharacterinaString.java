package com.github.dimka9910.testtasks.leetCodeTasks.hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {

    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            map.put(chars[i], map.containsKey(chars[i]) ? null: i);
        }

        return map.values().stream()
                .filter(v -> v != null)
                .min(Comparator.comparingInt(v -> v))
                .orElse(-1);
    }
}
