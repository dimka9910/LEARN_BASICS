package com.github.dimka9910.testtasks.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetUnique {
    @Test
    public void name() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(2);


        Set<List<Integer>> set = new HashSet<>();

        set.add(list1);
        System.out.println(set.size());
        set.add(list2);
        System.out.println(set.size());
        set.add(list3);
        System.out.println(set.size());

        System.out.println();
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(list.size());
        set = new HashSet<>(list);
        System.out.println(set.size());
    }
}
