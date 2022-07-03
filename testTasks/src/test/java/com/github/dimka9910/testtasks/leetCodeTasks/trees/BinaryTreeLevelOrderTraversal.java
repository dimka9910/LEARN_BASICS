package com.github.dimka9910.testtasks.leetCodeTasks.trees;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();


        LinkedList<Integer> list1 = (LinkedList<Integer>) list.get(0);
        recursion(list, 1, root);
        return list;
    }


    public void recursion(List<List<Integer>> list, int level, TreeNode root){
        if (root == null) return;
        if (list.size() < level)
            list.add(new LinkedList<Integer>());
        list.get(level - 1).add(root.val);
        recursion(list, ++level, root.left);
        recursion(list, level, root.right);
    }
}
