package com.github.dimka9910.testtasks.leetCodeTasks.intTasks;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IntegertoRoman {

    @Test
    void name() {


        System.out.println(intToRoman(1994));
    }

    public String intToRoman(int num) {

        char[] letters = new char[]{'I','V','X','L','C','D','M'};
        Map<Character, byte[]> map = new HashMap<>();
        map.put('0', new byte[]{});
        map.put('1', new byte[]{1});
        map.put('2', new byte[]{1,1});
        map.put('3', new byte[]{1,1,1});
        map.put('4', new byte[]{1, 2});
        map.put('5', new byte[]{2});
        map.put('6', new byte[]{2, 1});
        map.put('7', new byte[]{2, 1, 1});
        map.put('8', new byte[]{2, 1, 1, 1});
        map.put('9', new byte[]{1, 3});

        char[] numberArray = ("" + num).toCharArray();

        LinkedList<Byte> linkedList = new LinkedList<>();
        int i = numberArray.length*2 - 3;
        for(Character numberEl: numberArray){
            byte[] values = map.get(numberEl);
            for(byte b: values){
                linkedList.addLast((byte) (b + i));
            }
            i -= 2;
        }
        char[] res = new char[linkedList.size()];
        i = 0;
        for (Byte element: linkedList){
            res[i] = letters[element];
            i++;
        }
        return new String(res);
    }


}
