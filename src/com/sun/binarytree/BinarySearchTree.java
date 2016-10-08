package com.sun.binarytree;

/**
 * 二叉查找树中插入节点(lintcode-85)
 * Created by Chris on 2016/10/8.
 */

public class BinarySearchTree {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    //递归
     public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null) {
            root = node;
            return root;
        }
        if(node.val > root.val)
            root.right = insertNode(root.right, node);
        else
            root.left = insertNode(root.left, node);

        return root;
    }

    //非递归
    public TreeNode insertNode2(TreeNode root, TreeNode node) {
        // write your code here
        if(root == null) {
            root = node;
            return root;
        }
        TreeNode temp = root;
        while(temp!= null) {
            if(node.val > temp.val) {
                if (temp.right == null) {
                    temp.right = node;
                    return root;
                }
                temp = temp.right;
            }
            else {
                if (temp.left == null) {
                    temp.left = node;
                    return root;
                }
                temp = temp.left;
            }
        }
        return root;
    }
}