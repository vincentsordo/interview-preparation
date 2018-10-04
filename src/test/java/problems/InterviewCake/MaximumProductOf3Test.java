package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductOf3Test {
    private MaximumProductOf3 maximumProductOf3;

    @Before
    public void init() {
        maximumProductOf3 = new MaximumProductOf3();
    }

    @Test
    public void testMaximumProduct() {
        int [] listOfInts = new int[] {-10, -10, 1, 3, 2};
        assertEquals(maximumProductOf3.maximumProduct(listOfInts), 300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaximumProductInvalidArgument() {
       int [] listOfInts = new int[] {1,2};
       maximumProductOf3.maximumProduct(listOfInts);
    }
}