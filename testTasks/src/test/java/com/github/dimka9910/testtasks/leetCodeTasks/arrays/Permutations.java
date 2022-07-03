package com.github.dimka9910.testtasks.leetCodeTasks.arrays;

import org.junit.Test;

import java.util.*;

public class Permutations {
    @Test
    public void name() {

        System.out.println(permute(new int[]{1,2,3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = recurse(nums, new ArrayList<>(), new ArrayList<>());
        return new ArrayList<>(new HashSet<>(list));
    }

    public List<List<Integer>> recurse(int[] nums, List<Integer> resList, List<Integer> usedPositions){
        List<List<Integer>> list = new ArrayList<>();
        if (usedPositions.size() == nums.length){
            return Collections.singletonList(resList);
        }
        for (int i = 0; i < nums.length; i++){
            if (!usedPositions.contains(i)){
                List<Integer> newList = new ArrayList<>(resList);
                newList.add(nums[i]);

                List<Integer> newUsed = new ArrayList<>(usedPositions);
                newUsed.add(i);
                list.addAll(recurse(nums, newList, newUsed));
            }
        }
        return list;
    }
}
