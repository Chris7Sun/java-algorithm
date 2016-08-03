package com.sun.binarytree;

/**
 * Created by Chris on 2016/7/25.
 */

import java.util.ArrayList;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class BTPreorderTra {
    /**
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        list.add(root.val);
        if(root.left != null)
            list.addAll(preorderTraversal(root.left));
        if(root.right != null)
            list.addAll(preorderTraversal(root.right));
        return list;
    }
    public static void main(String[] args){

    }

}
class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}