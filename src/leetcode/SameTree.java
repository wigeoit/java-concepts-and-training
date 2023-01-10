package leetcode;

import leetcode.util.TreeNode;

/*
    Link: https://leetcode.com/problems/same-tree

    Given the roots of two binary trees p and q, write a function to check if they are the same or not.

    Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

    Example 1:
        Input: p = [1,2,3], q = [1,2,3]
        Output: true

    Example 2:
        Input: p = [1,2], q = [1,null,2]
        Output: false

    Example 3:
        Input: p = [1,2,1], q = [1,1,2]
        Output: false

 */

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return (p == null && q == null) ? true : false;
        }
        if(p.val != q.val){
            return false;
        }
        boolean leftCheck = isSameTree(p.left, q.left);
        if(!leftCheck){
            return false;
        }
        boolean rightCheck = isSameTree(p.right, q.right);
        if(!rightCheck){
            return false;
        }
        return true;
    }
}
