package com.github.dimka9910.testtasks.leetCodeTasks.hashmap;

import java.util.*;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> map = new HashMap();

        for (int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            List<String> list = map.getOrDefault(str, new ArrayList());
            list.add(strs[i]);
            map.put(str, list);
        }

        return new ArrayList(map.values());
    }
}
