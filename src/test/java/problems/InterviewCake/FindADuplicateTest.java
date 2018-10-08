package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindADuplicateTest {

    FindADuplicate findADuplicate;

    @Before
    public void setUp() {
        findADuplicate = new FindADuplicate();
    }

    @Test
    public void findDuplicate() {
        assertEquals(1, findADuplicate.findDuplicate(new int[] {1, 2, 3, 1, 3, 6, 6}));
        assertEquals(1, findADuplicate.findDuplicate(new int[] {1,2,3,4,5,6,7,1}));
        assertEquals(-1, findADuplicate.findDuplicate(new int[] {0,1,2,3,4,5,6,7}));
    }
}