package dataStructures;

public class LinkedListNode {
    public int val;
    public LinkedListNode next;

    public LinkedListNode(int val) {
        this.val = val;
    }

    public LinkedListNode getIthItemInLinkedList(LinkedListNode head, int i) {

        if (i < 0) {
            throw new IllegalArgumentException(String.format("i can't be negative: %d", i));
        }

        LinkedListNode currentNode = head;
        int currentPosition = 0;

        while (currentNode != null) {

            if (currentPosition == i) {
                // found it!
                return currentNode;
            }

            // move on to the next node
            currentNode = currentNode.next;
            currentPosition++;
        }

        throw new IllegalArgumentException(String.format("List has fewer than i + 1 (%d) nodes", i + 1));
    }
}
