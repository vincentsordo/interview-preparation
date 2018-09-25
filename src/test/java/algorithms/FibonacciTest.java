package algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @Before
    public void init() {
        fibonacci = new Fibonacci();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRecursiveFibonacci() {
        // this call will throw an IllegalArgumentException
        fibonacci.fibRecursive(-10);
        assertEquals(fibonacci.fibRecursive(0), 0);
        assertEquals(fibonacci.fibRecursive(1), 1);
        assertEquals(fibonacci.fibRecursive(5), 5);
        assertEquals(fibonacci.fibRecursive(10), 55);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMemoizationFibonacci() {
        // this call will throw an IllegalArgumentException
        fibonacci.fibMemoization(-10);
        assertEquals(fibonacci.fibMemoization(0), 0);
        assertEquals(fibonacci.fibMemoization(1), 1);
        assertEquals(fibonacci.fibMemoization(5), 5);
        assertEquals(fibonacci.fibMemoization(10), 55);
    }

}