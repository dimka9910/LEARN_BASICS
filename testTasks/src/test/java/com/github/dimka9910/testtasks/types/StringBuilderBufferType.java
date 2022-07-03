package com.github.dimka9910.testtasks.types;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBuilderBufferType {

    @Test
    void stringBuilderMethods() {

        StringBuilder sb = new StringBuilder("Hello!");
        sb.append(1)
                .append(new char[]{97, 'b', 'c'})
                .append(302.0 / 3.0)
                .append("hehe")
                .append("012345", 1,5);
        System.out.println(sb); // Hello!1abc100.66666666666667hehe1234
        sb.delete(12,sb.length()); //Hello!1abc10
        sb.replace(5,7, "-o-"); //Hello-o-abc10
        sb.insert(2,"---");// He---llo-o-abc10
        sb.insert(1,"012345",1,5); //H1234e---llo-o-abc10
//        sb.append()
//        sb.insert(2,"---");
//        System.out.println(sb);


    }
}
