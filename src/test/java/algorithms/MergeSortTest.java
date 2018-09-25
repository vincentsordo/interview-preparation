package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort ms;

    private final static int[] unsortedIntArray = {9,8,7,6,5,4,3,2,1};
    private final static int[] sortedIntArray = {1,2,3,4,5,6,7,8,9};

    @Before
    public void init() {
        ms = new MergeSort();
    }

    @Test
    public void testSortedArray() {
        assertArrayEquals(ms.mergeSort(unsortedIntArray), sortedIntArray);
    }
}