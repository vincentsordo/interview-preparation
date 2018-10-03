package problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAStringInPlaceTest {
    private ReverseAStringInPlace reverseAStringInPlace;

    @Before
    public void init() {
        reverseAStringInPlace = new ReverseAStringInPlace();
    }

    @Test
    public void testReverse() {
        String abc = "abc";
        String cba = "cba";

        char [] characters1 = abc.toCharArray();
        char [] reversedCharacters1 = cba.toCharArray();
        reverseAStringInPlace.reverse(characters1);
        assertArrayEquals(characters1, reversedCharacters1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseInvalidArgument() {
        reverseAStringInPlace.reverse(null);
    }

    @Test
    public void testReverseEmptyArray() {
        char [] testArray = new char[] {};
        reverseAStringInPlace.reverse(testArray);
        assertArrayEquals(testArray, new char[]{});
    }
}