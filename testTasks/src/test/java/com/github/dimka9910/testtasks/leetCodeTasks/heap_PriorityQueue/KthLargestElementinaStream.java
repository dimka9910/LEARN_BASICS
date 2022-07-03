package com.github.dimka9910.testtasks.leetCodeTasks.heap_PriorityQueue;

import org.junit.Test;

import java.util.*;

public class KthLargestElementinaStream {

    @Test
    public void name() {

        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
        kthLargest.add(3);   // return 4
        kthLargest.add(5);   // return 5
        kthLargest.add(10);  // return 5
        kthLargest.add(9);   // return 8
        kthLargest.add(4);   // return 8
    }
}

class KthLargest {

    PriorityQueue<Integer> priorityQueue;
    int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        priorityQueue = new PriorityQueue<>(k + 1);

        for (int num : nums) {
            priorityQueue.offer(num);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
    }

    public int add(int val) {
        priorityQueue.offer(val);
        if (priorityQueue.size() > k) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
