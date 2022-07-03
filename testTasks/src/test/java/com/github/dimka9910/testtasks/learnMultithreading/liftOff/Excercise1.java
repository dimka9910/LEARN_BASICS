package com.github.dimka9910.testtasks.learnMultithreading.liftOff;

public class Excercise1 implements Runnable{

    private int repeat = 3;

    private static int taskCount = 0;
    private final int id = taskCount++;

    public Excercise1() {
        System.out.println("task " + taskCount + " is created");
    }

    @Override
    public void run() {
        while (repeat-- > 0){
            System.out.println(id + " repeats left: " + repeat);
            Thread.yield();
        }
    }
}
