package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTTest {
    BST bst;
    BST.BinaryTreeNode bst1;
    BST.BinaryTreeNode bst2;

    @Before
    public void setUp() {
        bst = new BST();
        bst1 = new BST.BinaryTreeNode(2);
        bst1.left = new BST.BinaryTreeNode(1);
        bst1.right = new BST.BinaryTreeNode(3);
        bst1.left.left = new BST.BinaryTreeNode(0);

        bst2 = new BST.BinaryTreeNode(5);
        bst2.left = new BST.BinaryTreeNode(4);
        bst2.right = new BST.BinaryTreeNode(9);
        bst2.right.left = new BST.BinaryTreeNode(7);
    }

    @Test
    public void isValid() {
        assertTrue(bst.isValid(bst1));
    }

    @Test
    public void getSecondLargestValue() {
        assertEquals(2, bst.getSecondLargestValue(bst1));
        assertEquals(7, bst.getSecondLargestValue(bst2));
    }
}