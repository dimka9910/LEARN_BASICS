package com.github.dimka9910.testtasks.objects.instanseof;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ListTask {
    @Test
    void name() {
        List list = new ArrayList();
        list.add("hello");
        list.add(2);
        System.out.print(list.get(0) instanceof Object); //true
        System.out.print(list.get(0) instanceof String); //true
        System.out.print(list.get(1) instanceof Integer); //true
    }
}
