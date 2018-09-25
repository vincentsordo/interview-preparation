package algorithms;

public class Fibonacci {
    /**
     * Returns the fibonacci number at the n'th elements.
     * If the number passed to fibonacci is negative this method
     * will return -1.
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
