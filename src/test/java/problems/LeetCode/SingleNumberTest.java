package problems.LeetCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    private SingleNumber singleNumber;

    @Before
    public void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void singleNumber() {
        assertEquals(1, singleNumber.singleNumber(new int[] {2,2,1}));
        assertEquals(4, singleNumber.singleNumber(new int[] {4,1,2,1,2}));
    }
}