package com.github.dimka9910.testtasks.exceptions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Task1ReturnOrThrow {

    @Test
    void testExc (){
        System.out.println(print(1));  // print:   java.lang.Exception
        System.out.println(print(-1)); //throws   java.lang.RuntimeException and show a stack trace with a runtime exception.

    }

    static Exception print(int i){
        if (i>0) {
            return new Exception();
        } else {
            throw new RuntimeException();
        }
    }


}
