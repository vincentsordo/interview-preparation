package problems.InterviewCake;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Write a method to see if a binary tree ↴ is "superbalanced"
 * (a new tree property we just made up).
 *
 * A tree is "superbalanced" if the difference between the depths
 * of any two leaf nodes ↴ is no greater than one.
 */
public class SuperBalancedBinaryTree {

    /**
     *          1   - 1
     *        2   3 - 2
     *      4  4 6  - 3
     *     8  9     - 4
     *   10         - 5
     *
     *   1 - 2 and 3 in queue
     *   2 - 3, 4, 4 in queue
     *   3 - 4, 4, 6 in queue
     *   4 -
     *
     * @return
     */
    public boolean isBalanced(BinaryTreeNode root) {
        if (root == null) return true;

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);

        return Math.abs(leftHeight - rightHeight) <= 1;
    }

    private int dfs(BinaryTreeNode currentNode) {
        // we have found a leaf
        if (currentNode == null) {
            return 0;
        } else {
            return 1 + Math.max(dfs(currentNode.left), dfs(currentNode.right));
        }
    }

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }
    }
}
