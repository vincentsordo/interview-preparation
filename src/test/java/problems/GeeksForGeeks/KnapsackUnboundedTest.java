package problems.GeeksForGeeks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackUnboundedTest {
    KnapsackUnbounded knapsack;

    @Before
    public void setUp() throws Exception {
        knapsack = new KnapsackUnbounded();
    }

    @Test
    public void getMaxValue() {
        assertEquals(300, knapsack.getMaxValue(100, new int[] {5,10,15}, new int[] {10,30,20}, 3));
    }
}