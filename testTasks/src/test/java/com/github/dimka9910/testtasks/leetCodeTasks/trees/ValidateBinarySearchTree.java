package com.github.dimka9910.testtasks.leetCodeTasks.trees;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.TreeNode;

public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return recursion(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean recursion(TreeNode root, int min, int max){
        return (root.val <= max) &&
                (root.val >= min ) &&

                (root.right == null ||
                        (root.right.val > root.val &&  recursion(root.right, root.val + 1, max))) &&

                (root.left  == null ||
                        (root.left.val < root.val &&   recursion(root.left, min, root.val - 1)));
    }


    // ALSO POSSIBLE
    boolean solve(TreeNode root, long max, long min){
        if(root == null )return true;

        if(root.val >= max || root.val <= min)return false;

        return solve(root.left, root.val, min) && solve(root.right,max, root.val);
    }
}
