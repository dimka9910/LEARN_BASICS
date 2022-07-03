package com.github.dimka9910.testtasks.collections.iterators;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void name() {

        ArrayList<Integer> iterable = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        Iterator<Integer> iterator = iterable.iterator();

        Integer val = iterator.next();
        val = iterator.next();
        iterator.remove();
        val = iterator.next();


    }
}
