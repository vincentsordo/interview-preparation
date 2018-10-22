package problems.GeeksForGeeks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackBoundedTest {
    KnapsackBounded knapsack;
    int [] weights;
    int [] values;



    @Before
    public void setUp() throws Exception {
        knapsack = new KnapsackBounded();
        weights = new int [] {10, 20, 30};
        values = new int [] {60, 100, 120};
    }

    @Test
    public void getMaxValue() {
        assertEquals(220, knapsack.getMaxValue(50, weights, values, 3));
    }

    @Test
    public void getMaxValueDP() {
        assertEquals(220, knapsack.getMaxValueDP(50, weights, values, 3));
    }
}