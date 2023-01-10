package test;

import leetcode.SameTree;
import leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SameTreeTest {
    SameTree test = new SameTree();

    @Test
    void treesAreSameWithOutNull(){
        TreeNode p3 = new TreeNode(3);
        TreeNode p2 = new TreeNode(2);
        TreeNode p = new TreeNode(1, p2, p3);

        TreeNode q3 = new TreeNode(3);
        TreeNode q2 = new TreeNode(2);
        TreeNode q = new TreeNode(1, q2, q3);

        assertTrue(test.isSameTree(p, q));
    }

    @Test
    void treesAreSameWithNull(){
        TreeNode p3 = new TreeNode(3);
        TreeNode p2 = new TreeNode(2, p3, null);
        TreeNode p = new TreeNode(1, null, p2);

        TreeNode q3 = new TreeNode(3);
        TreeNode q2 = new TreeNode(2, q3, null);
        TreeNode q = new TreeNode(1, null, q2);

        assertTrue(test.isSameTree(p, q));
    }

    @Test
    void treesAreDifferentWithNull(){
        TreeNode p3 = new TreeNode(3);
        TreeNode p = new TreeNode(1, null, p3);

        TreeNode q3 = new TreeNode(3);
        TreeNode q2 = new TreeNode(2);
        TreeNode q = new TreeNode(1, q2, q3);

        assertFalse(test.isSameTree(p, q));
    }
    @Test
    void treesAreDifferentWithOutNull(){
        TreeNode p3 = new TreeNode(3);
        TreeNode p2 = new TreeNode(4);
        TreeNode p = new TreeNode(1, p2, p3);

        TreeNode q3 = new TreeNode(3);
        TreeNode q2 = new TreeNode(2);
        TreeNode q = new TreeNode(1, q2, q3);

        assertFalse(test.isSameTree(p, q));
    }

}