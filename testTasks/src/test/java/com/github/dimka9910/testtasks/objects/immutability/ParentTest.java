package com.github.dimka9910.testtasks.objects.immutability;

import org.junit.Test;

class ParentTest {

     A a = new A();
     A ab = new B();

    @Test
    public void name() {
        A a = new A();
        A ab = new B();
        B b = new B();

        System.out.println("---------");
        System.out.println(a.getA());  // 11
        System.out.println(a.b);   // 12
        System.out.println(a.c);  // 13
        System.out.println(a.d);  // 14

        System.out.println("---------");
        System.out.println(ab.getA());  // 21
        System.out.println(ab.b);       // 12
        System.out.println(ab.c);       // 13
        System.out.println(ab.d);       // 14

        System.out.println("---------");
        B aab = (B) ab;
        System.out.println(aab.getA());  // 21
        System.out.println(aab.b);       // 12
        System.out.println(aab.c);       // 13
        System.out.println(aab.d);       // 14



        System.out.println("---------");
        System.out.println(b.a);        // 21
        System.out.println(b.b);        // 22
        System.out.println(b.getC());   // 23
        System.out.println(b.d);        // 24
    }

    @Test
    public void name2() {

        A a = new A();
        A ab = new B();
        B b = new B();


        method(a);    // a
        method(ab);   // a
        method(b);    // b
        System.out.println("---------");
        method(a, a);  // aa
        method(a, b);  // ab
        method(a, ab); // aa
        System.out.println("---------");
        method(b, b);  // bb
        method(b, a);  // ba
        method(b, ab); // ba
        System.out.println("---------");
        method(ab, ab); //aa
        method(ab, a);  // aa
        method(ab, b);  // ab

    }


    public void method(A a) {
        System.out.println("method a");
    }

    public void method(B a) {
        System.out.println("methoda b");
    }

    public void method(A a, B b) {
        System.out.println("method ab");
    }

    public void method(B a, A b) {
        System.out.println("method ba");
    }

    public void method(B a, B b) {
        System.out.println("method bb");
    }

    public void method(A a, A b) {
        System.out.println("method aa");
    }

}


class A {
    private Integer a = 11;
    final Integer b = 12;
    public Integer c = 13;
    public static Integer d = 14;


    public static Integer getC(int c) {
        return d;
    }


    public Integer getA() {
        return a;
    }
}
interface F {
    public int b = 4;

}

class B extends A {
    public Integer a = 21;
    final Integer b = 22;
    public Integer c = 23;
    static Integer d;

    public Integer getC() {
        return c;
    }

    public Integer getA() {
        return a;
    }
}