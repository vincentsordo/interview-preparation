package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountingSortTest {

    private CountingSort countingSort = new CountingSort();
    private int[] unsortedArray;


    @Before
    public void init() {
        countingSort = new CountingSort();
        unsortedArray = new int[] {9, 1, 8, 2, 7, 3, 6, 4, 5, 5, 4, 6, 3, 7, 2, 8, 1, 9};
    }

    @Test
    public void testCountingSort() {
        assertArrayEquals(countingSort.sort(unsortedArray, 9), new int[] {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9});
    }

}