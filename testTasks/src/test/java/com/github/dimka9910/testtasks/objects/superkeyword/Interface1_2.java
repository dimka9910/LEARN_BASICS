package com.github.dimka9910.testtasks.objects.superkeyword;

public interface Interface1_2 extends Interface0{
    @Override
    default int getInt() {
        return Interface0.super.getInt();
    }
}
