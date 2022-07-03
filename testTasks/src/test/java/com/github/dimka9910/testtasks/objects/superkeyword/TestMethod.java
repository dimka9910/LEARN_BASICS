package com.github.dimka9910.testtasks.objects.superkeyword;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMethod {

    @Test
    public void name() {
        Class3 class3 = new Class3();
        System.out.println(class3.getInt());
    }
}
