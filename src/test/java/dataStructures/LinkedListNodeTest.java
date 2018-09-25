package dataStructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListNodeTest {

    private LinkedListNode root;

    @Before
    public void init() {
        root = new LinkedListNode(0);
        root.next = new LinkedListNode(1);
        root.next.next = new LinkedListNode(2);
        root.next.next.next = new LinkedListNode(3);
        root.next.next.next.next = new LinkedListNode(4);
    }

    @Test
    public void testGetIthItemInLinkedListSuccess() {
        LinkedListNode result = root.getIthItemInLinkedList(root, 3);
        assertEquals(result.val, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIthItemInLinkedListNegativeIndex() {
        LinkedListNode result = root.getIthItemInLinkedList(root, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetIthItemInLinkedListIndexLargerThanSize() {
        LinkedListNode result = root.getIthItemInLinkedList(root, 10);
    }


}