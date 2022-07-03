package com.github.dimka9910.testtasks.IMPORTANT_BASICS;

import org.junit.Test;

import java.util.*;

public class CollectionTests {

    @Test
    public void name() {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,4));
        arrayList.get(0);

        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        linkedList.add(6); // addLast;
        linkedList.addFirst(0);
        //--
        linkedList.peekFirst(); // peek - getFirst - 0
        linkedList.pollFirst(); // poll
        //--
        linkedList.peekLast(); //6
        linkedList.pollLast();


        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
        pq.add(1);
        pq.add(4);
        pq.add(0);




    }



}
