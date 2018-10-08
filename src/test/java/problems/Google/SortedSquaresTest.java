package problems.Google;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSquaresTest {

    SortedSquares sortedSquares;
    int [] inputArray1 = new int[] {1, 2, 3, 4, 5};
    int [] inputArray2 = new int[] {-5, -4, 1, 2, 3, 6};
    int [] inputArray3 = new int[] {-10, -1, 2, 5};
    int [] expectedArray1 = new int[] {1, 4, 9, 16, 25};
    int [] expectedArray2 = new int[] {1, 4, 9, 16, 25, 36};
    int [] expectedArray3 = new int[] {1, 4, 25, 100};


    @Before
    public void setUp() throws Exception {
        sortedSquares = new SortedSquares();
    }

    @Test
    public void sortSolution2() {
        assertArrayEquals(expectedArray1, sortedSquares.sortSolution2(inputArray1));
        assertArrayEquals(expectedArray2, sortedSquares.sortSolution2(inputArray2));
        assertArrayEquals(expectedArray3, sortedSquares.sortSolution2(inputArray3));
    }

    @Test
    public void sortSolution3() {
        assertArrayEquals(expectedArray1, sortedSquares.sortSolution3(inputArray1));
        assertArrayEquals(expectedArray2, sortedSquares.sortSolution3(inputArray2));
        assertArrayEquals(expectedArray3, sortedSquares.sortSolution3(inputArray3));
    }
}