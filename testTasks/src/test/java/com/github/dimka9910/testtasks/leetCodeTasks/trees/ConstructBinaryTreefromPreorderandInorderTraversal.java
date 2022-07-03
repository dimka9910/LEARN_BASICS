package com.github.dimka9910.testtasks.leetCodeTasks.trees;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++)
            placeOnPos(map, preorder[i], root);

        return root;
    }

    public void placeOnPos(Map<Integer, Integer> map, int num, TreeNode root){
        if (map.get(num) < map.get(root.val)){
            if (root.left == null)
                root.left = new TreeNode(num);
            else
                placeOnPos(map, num, root.left);
        } else {
            if (root.right == null)
                root.right = new TreeNode(num);
            else
                placeOnPos(map, num, root.right);
        }
    }


    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        return fun(preorder, inorder, 99999, new int[]{0,0});
    }

    public TreeNode fun(int[] preorder, int[] inorder, int stop, int[] index) {
        if (index[0]>=preorder.length) return null;
        if (inorder[index[1]] == stop) {
            index[1]++;
            return null;
        }
        TreeNode node = new TreeNode(preorder[index[0]++]);
        node.left = fun(preorder, inorder, node.val, index);
        node.right = fun(preorder, inorder, stop, index);
        return node;
    }

}
