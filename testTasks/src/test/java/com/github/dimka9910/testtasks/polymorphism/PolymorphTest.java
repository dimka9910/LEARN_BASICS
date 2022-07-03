package com.github.dimka9910.testtasks.polymorphism;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class PolymorphTest {


    @Test
    void polymorphism() {
        //How can you achieve runtime polymorphism in Java? - method overriding

        //Ad-hoc polymorphism (method overloading)
        System.out.println("ff");
        System.out.println(2);

        //Subtype polymorphism (runtime)
        //reference subtype object
        Object obj = "string";
        //overriding
        new Object().hashCode();
        new String().hashCode();

        //Parametric polymorphism
        List<String> list = new ArrayList<>();
    }


    @Test
    void polymorphismSuperClasss() {
        class ParentClass{
            void method1(){
                System.out.println("hello");
            }

            void method1(String param){
                System.out.println(param);
            }
        }

        class ChildClass extends ParentClass{
            @Override
            void method1() {
                System.out.println("child");
            }
        }

        ParentClass parentClass = new ParentClass();
        parentClass.method1();
        ParentClass parentClassChild = new ChildClass();
        parentClassChild.method1();
        ChildClass childClass = new ChildClass();
        childClass.method1();
    }


}
