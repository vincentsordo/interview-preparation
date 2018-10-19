package problems.InterviewCake;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {
    PalindromePermutation palindromePermutation;

    @Before
    public void setUp() {
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    public void hasPalindromePermutation() {
        assertTrue(palindromePermutation.hasPalindromePermutation("civic"));
        assertFalse(palindromePermutation.hasPalindromePermutation("civil"));
    }
}