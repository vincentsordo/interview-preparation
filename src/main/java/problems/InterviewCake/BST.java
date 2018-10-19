package problems.InterviewCake;

/**
 * Binary Search Tree
 */
public class BST {

    /**
     * Write a method to check that a binary tree is a valid binary search tree.
     * O(n) time and O(n)O(n) space.
     * @param root
     * @return
     */
    public boolean isValid(BinaryTreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValid(BinaryTreeNode node, int lowerBound, int upperBound) {
        if (node == null) return true;
        if (node.value <= lowerBound || node.value >= upperBound) return false;

        return isValid(node.left, lowerBound, node.value) &&
                isValid(node.right, node.value, upperBound);
    }

    /**
     * Write a method to find the 2nd largest element in a binary search tree.
     * @param root
     * @return
     */
    public int getSecondLargestValue(BinaryTreeNode root) {
        BinaryTreeNode secondLargestNode = null;

        while(root.right != null) {
            secondLargestNode = root;
            root = root.right;
        }

        if (root.left != null) {
            return root.left.value;
        } else if (secondLargestNode != null){
            return secondLargestNode.value;
        } else {
            throw new IllegalArgumentException("Invalid BST tree");
        }
    }

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }
}
