package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private BinarySearch bs;

    private static int[] intArray = {-1, 0, 1, 2};

    @Before
    public void init() {
        bs = new BinarySearch();
    }

    @Test
    public void testTargetFound() {
        assertTrue(bs.binarySearch(1, intArray));
    }

    @Test
    public void testTargetNotFound() {
        assertFalse(bs.binarySearch(10, intArray));
    }
}