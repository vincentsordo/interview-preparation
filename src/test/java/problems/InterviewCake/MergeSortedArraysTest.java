package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArraysTest {
    MergeSortedArrays mergeSortedArrays;

    @Before
    public void init() {
        mergeSortedArrays = new MergeSortedArrays();
    }

    @Test
    public void testMerge() {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15, 16, 17, 18, 20};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
        int [] mergedArray = mergeSortedArrays.merge(myArray, alicesArray);
        assertArrayEquals(mergedArray, new int[] {1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20});
    }
}