package com.github.dimka9910.testtasks.objects.superkeyword;

public class Class2 implements Interface1_1, Interface1_2{

    @Override
    public int getInt() {
        return Interface1_2.super.getInt();
    }
}
