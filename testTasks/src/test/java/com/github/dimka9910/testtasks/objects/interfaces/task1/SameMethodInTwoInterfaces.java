//package com.github.dimka9910.testtasks.objects.interfaces.task1;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//
//class TestTasksApplicationTests {
//
//}
//
//interface One {
//    default void method() {
//        System.out.println("One");
//    }
//}
//
//interface Two {
//    default void method () {
//        System.out.println("One");
//    }
//}
//
//class Three1 implements One, Two {
//    public void method() {
//        super.One.method();  //Cannot resolve symbol 'One'
//    }
//}
//
//class Three2 implements One, Two {
//    public void method() {
//        One.method();   //Non-static method 'method()' cannot be referenced from a static context
//    }
//}
//
//class Three3 implements One, Two {  //inherits unrelated defaults for method()
//                                    // from types One and Two
//}
//
//class Three4 implements One, Two {
//    public void method() {
//        One.super.method();
//    }
//}
//
//
//
//interface Two2 {
//    void method ();
//}
//
//class Three3 implements One, Two2 {  //Class 'Three3' must either be declared abstract
//                                    // or implement abstract method 'method()' in 'Two2'
//}