package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopScoresTest {
    private TopScores topScores;

    @Before
    public void setUp() {
        topScores = new TopScores();
    }

    @Test
    public void sortScores() {
        assertArrayEquals(new int[] {91, 89, 65, 53, 41, 37}, topScores.sortScores(new int [] {37, 89, 41, 65, 91, 53}, 100));
    }
}