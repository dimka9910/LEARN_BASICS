package com.github.dimka9910.testtasks.collections.setTest;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class LinkedHashSetTest {

    @Test
    public void name() {

        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add('d');
        linkedHashSet.add('a');
        linkedHashSet.add('c');
        linkedHashSet.add('t');


        Map<String, Integer> map = new HashMap<>();
        map.put("dd", null);
        map.put("ff", null);

        System.out.println(map.values().stream().min(Comparator.comparingInt(v -> v)).orElse(-1));

    }
}
