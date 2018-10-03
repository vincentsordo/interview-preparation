package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedScoresTest {
    SortedScores sortedScores;

    @Before
    public void init() {
        sortedScores = new SortedScores();
    }

    @Test
    public void test() {
        int[] unsortedScores = {37, 89, 41, 65, 91, 53};
        assertArrayEquals(sortedScores.sort(unsortedScores, 100), new int[] {91, 89, 65, 53, 41, 37});
    }
}