package com.github.dimka9910.testtasks.leetCodeTasks.trees;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length);
    }


    public TreeNode convert(int[] nums, int leftInc, int rightExcl){
        if (leftInc == rightExcl)
            return null;

        int mid = leftInc + rightExcl >> 1;
        return new TreeNode(nums[mid],
                convert(nums, leftInc,  mid),
                convert(nums, ++mid, rightExcl));
    }
}
