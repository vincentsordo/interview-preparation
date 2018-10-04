package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetMaxStockProfitTest {
    private GetMaxStockProfit getMaxStockProfit;

    @Before
    public void init() {
        getMaxStockProfit = new GetMaxStockProfit();
    }

    @Test
    public void testGetMaxProfit() {
        int[] stockPrices1 = new int[] {10, 7, 5, 8, 11, 9};
        assertEquals(getMaxStockProfit.getMaxProfit(stockPrices1), 6);
        int[] stockPrices2 = new int[] {10,9,8,7,6,5,4};
        assertEquals(getMaxStockProfit.getMaxProfit(stockPrices2), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxProfitInvalidArgument() {
        int[] stockPrices = new int[] {10, 7, -1, 8, 11, 9};
        getMaxStockProfit.getMaxProfit(stockPrices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxProfitEmptyArray() {
        int[] stockPrices = new int[] {};
        getMaxStockProfit.getMaxProfit(stockPrices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetMaxProfitNullArray() {
        getMaxStockProfit.getMaxProfit(null);
    }
}