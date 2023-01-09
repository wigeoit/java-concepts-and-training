package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
    Link: https://leetcode.com/problems/binary-tree-preorder-traversal/

    Given the root of a binary tree, return the preorder traversal of its nodes' values.

    Example 1:
        Input: root = [1,null,2,3]
        Output: [1,2,3]

    Example 2:
        Input: root = []
        Output: []

    Example 3:
        Input: root = [1]
        Output: [1]
*/

public class BinaryTreePreorderTraversal {
    private List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        preorderTraversalByNode(root);
        return result;
    }
    private void preorderTraversalByNode(TreeNode node) {
        if (node == null) {
            return;
        }
        result.add(node.val);
        preorderTraversalByNode(node.left);
        preorderTraversalByNode(node.right);
    }
}
