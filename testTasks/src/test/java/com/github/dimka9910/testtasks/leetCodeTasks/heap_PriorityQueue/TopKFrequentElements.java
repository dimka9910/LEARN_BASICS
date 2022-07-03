package com.github.dimka9910.testtasks.leetCodeTasks.heap_PriorityQueue;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    @Test
    public void name() {

    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i]  = pq.poll();
        }
        return res;
    }
    
}
