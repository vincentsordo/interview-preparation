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

    }

    @Test
    public void findDuplicateWithModification() {
        assertEquals(1, findADuplicate.findDuplicateWithModification(new int[] {1, 2, 3, 1, 3, 6, 6}));
        assertEquals(1, findADuplicate.findDuplicateWithModification(new int[] {1,2,3,4,5,6,7,1}));
        assertEquals(-1, findADuplicate.findDuplicateWithModification(new int[] {0,1,2,3,4,5,6,7}));
    }

    @Test
    public void findDuplicateWithoutModification() {
        assertEquals(1, findADuplicate.findDuplicateWithoutModification(new int[] {1, 2, 3, 4, 5, 6, 1, 7}));
        assertEquals(1, findADuplicate.findDuplicateWithoutModification(new int[] {1,2,3,4,5,6,7,1}));
    }
}