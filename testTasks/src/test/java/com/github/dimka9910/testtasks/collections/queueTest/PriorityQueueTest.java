package com.github.dimka9910.testtasks.collections.queueTest;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void name() {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(5);

        priorityQueue.offer(5);
        priorityQueue.offer(3);
        priorityQueue.offer(8);
        priorityQueue.offer(6);
        priorityQueue.offer(5);
        priorityQueue.offer(7);

        priorityQueue.forEach(v -> System.out.print(v)); // 357658
        System.out.println();

        System.out.println(priorityQueue.peek()); // 3
        System.out.println(priorityQueue.element()); //3


        System.out.println(priorityQueue.poll()); //3
        System.out.println(priorityQueue.remove()); //5

        System.out.println(priorityQueue.poll());  //5
        System.out.println(priorityQueue.poll());  //6

    }
}
