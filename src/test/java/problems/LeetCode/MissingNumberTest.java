package problems.LeetCode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MissingNumberTest {

    MissingNumber missingNumber;

    @Before
    public void setUp() {
        missingNumber = new MissingNumber();
    }

    @Test
    public void missingNumber() {
        assertEquals(2, missingNumber.missingNumber(new int[] {3, 0, 1}));
        assertEquals(8, missingNumber.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}