package com.github.dimka9910.testtasks.collections.listTest;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void name() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        Integer i = arrayList.get(2);
        System.out.println(i);
    }
}
