package com.github.dimka9910.testtasks.collections;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.NavigableMap;
import java.util.TreeMap;

@SpringBootTest
public class Arrays {

    @Test
    void lengthArray() {
        int array[] = {1, 2, 3, 4};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }


    @Test
    void name() {

        NavigableMap<String, Integer> map = new TreeMap<>((a,b) -> a.length() - b.length());

    }
}
