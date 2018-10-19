package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {
    BST bst;

    @Before
    public void setUp() {
        bst = new BST();
    }

    @Test
    public void isValid() {
        BST.BinaryTreeNode root = new BST.BinaryTreeNode(2);
        root.left = new BST.BinaryTreeNode(1);
        root.right = new BST.BinaryTreeNode(3);
        root.left.left = new BST.BinaryTreeNode(0);
        assertTrue(bst.isValid(root));
    }
}