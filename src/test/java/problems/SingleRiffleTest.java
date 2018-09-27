package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleRiffleTest {
    private SingleRiffle singleRiffle;
    private int [] isSingleRiffleShuffledDeck;
    private int [] isSingleRiffleHalf1;
    private int [] isSingleRiffleHalf2;
    private int [] isNotSingleRiffleShuffledDeck;
    private int [] isNotSingleRiffleHalf1;
    private int [] isNotSingleRiffleHalf2;

    @Before
    public void init() {
        singleRiffle = new SingleRiffle();
        isSingleRiffleShuffledDeck = new int[] {1,2,3,4,5,6,7,8,9,10};
        isSingleRiffleHalf1 = new int[] {1,2,3,4,5,6};
        isSingleRiffleHalf2 = new int[] {7,8,9,10};

        isNotSingleRiffleShuffledDeck = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
        isNotSingleRiffleHalf1 = new int[] {1,2,3,4,5,6};
        isNotSingleRiffleHalf2 = new int[] {7,8,9,10,12};
    }

    @Test
    public void testIsSingleRiffleOption1() {
        assertTrue(singleRiffle.isSingleRiffleOption1(isSingleRiffleHalf1, isSingleRiffleHalf2, isSingleRiffleShuffledDeck));
        assertFalse(singleRiffle.isSingleRiffleOption1(isNotSingleRiffleHalf1, isNotSingleRiffleHalf2, isNotSingleRiffleShuffledDeck));
    }

    @Test
    public void testIsSingleRiffleOption2() {
        assertTrue(singleRiffle.isSingleRiffleOption2(isSingleRiffleHalf1, isSingleRiffleHalf2, isSingleRiffleShuffledDeck, 0, 0, 0));
        assertFalse(singleRiffle.isSingleRiffleOption2(isNotSingleRiffleHalf1, isNotSingleRiffleHalf2, isNotSingleRiffleShuffledDeck, 0, 0, 0));
    }

    @Test
    public void testIsSingleRiffleOption3() {
        assertTrue(singleRiffle.isSingleRiffleOption3(isSingleRiffleHalf1, isSingleRiffleHalf2, isSingleRiffleShuffledDeck));
        assertFalse(singleRiffle.isSingleRiffleOption3(isNotSingleRiffleHalf1, isNotSingleRiffleHalf2, isNotSingleRiffleShuffledDeck));
    }
}