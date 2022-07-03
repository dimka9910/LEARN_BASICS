package com.github.dimka9910.testtasks.learnMultithreading.liftOff;

import org.junit.Test;

public class MainThread {

    @Test
    public void name() {
        LiftOff liftOff = new LiftOff();
        liftOff.run();
    }

    @Test
    public void name2() {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }

    @Test
    public void name3() {
        for(int i = 0; i < 5; i++)
            new Thread(new LiftOff()).start();
        System.out.println("Waiting for LiftOff");
    }


    @Test
    public void Exercise1Test() {
        for(int i = 0; i < 5; i++)
            new Thread(new Excercise1()).start();
        System.out.println("Waiting for Exercise to end");
    }
}
