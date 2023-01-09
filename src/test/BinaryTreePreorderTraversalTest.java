package test;

import leetcode.BinaryTreePreorderTraversal;
import leetcode.util.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreePreorderTraversalTest {
    BinaryTreePreorderTraversal test = new BinaryTreePreorderTraversal();

    @Test
    void nullRootReturnsEmptyList(){
        TreeNode root = null;
        List<Integer> expectedResult = new ArrayList<>();
        assertTrue(expectedResult.equals(test.preorderTraversal(root)));
    }

    @Test
    void nullValueInsideTreeShouldNotBeEvaluated(){
        TreeNode t3 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2, t3, null);
        TreeNode root = new TreeNode(1, null, t2);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(3);
        assertTrue(expectedResult.equals(test.preorderTraversal(root)));
    }

    @Test
    void onlyRootValueReturnsValue(){
        TreeNode root = new TreeNode(1);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        assertTrue(expectedResult.equals(test.preorderTraversal(root)));
    }
}