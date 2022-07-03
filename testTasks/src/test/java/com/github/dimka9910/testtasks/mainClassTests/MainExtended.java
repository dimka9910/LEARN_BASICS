package com.github.dimka9910.testtasks.mainClassTests;


class Parent {

    static int a;

    static {
        a = 1;
        System.out.println("a");
    }

    public static int getA(){
        System.out.println("d");
        return a;
    }


}

public class MainExtended{

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = Integer.getInteger("2ab2");



        System.out.println(a.hashCode());
        System.out.println(b);
    }
}


class D extends Parent {

    static {
        System.out.println("Dclass");
    }

}