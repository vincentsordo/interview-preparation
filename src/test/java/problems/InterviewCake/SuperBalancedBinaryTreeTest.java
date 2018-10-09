package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperBalancedBinaryTreeTest {

    private SuperBalancedBinaryTree superBalancedBinaryTree;
    private SuperBalancedBinaryTree.BinaryTreeNode binaryTreeNode;

    @Before
    public void setUp() {
        superBalancedBinaryTree = new SuperBalancedBinaryTree();
        binaryTreeNode = new SuperBalancedBinaryTree.BinaryTreeNode(1);
        binaryTreeNode.left = new SuperBalancedBinaryTree.BinaryTreeNode(2);
        binaryTreeNode.right = new SuperBalancedBinaryTree.BinaryTreeNode(3);
        binaryTreeNode.left.left = new SuperBalancedBinaryTree.BinaryTreeNode(4);
    }

    @Test
    public void isSuperBalanced() {
        assertTrue(superBalancedBinaryTree.isBalanced(binaryTreeNode));
        binaryTreeNode.left.left.left = new SuperBalancedBinaryTree.BinaryTreeNode(5);
        assertFalse(superBalancedBinaryTree.isBalanced(binaryTreeNode));
    }
}