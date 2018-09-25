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

    @Test
    public void testFibonacci() {
        assertEquals(fibonacci.fib(-10), -1);
        assertEquals(fibonacci.fib(0), 0);
        assertEquals(fibonacci.fib(1), 1);
        assertEquals(fibonacci.fib(5), 5);
        assertEquals(fibonacci.fib(10), 55);
    }

}