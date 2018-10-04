package problems.LeetCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {
    MaxProfit maxProfit;

    @Before
    public void setUp() {
        maxProfit = new MaxProfit();
    }

    @Test
    public void maxProfit() {
        assertEquals(5, maxProfit.maxProfit(new int[] {7,1,5,3,6,4}));
    }
}