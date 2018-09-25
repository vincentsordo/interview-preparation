package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {


    private Map<Integer, Integer> memoizeMap = new HashMap<>();

    /**
     * Returns the fibonacci number at the n'th elements.
     * If the number passed to fibonacci is negative this method
     * will throw an IllegalArgumentException
     *
     * @param n
     * @return
     */
    public int fibRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");
        }
        if (n == 0 || n == 1) {
            return n;
        }

        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    /**
     * Memoization ensures that a method doesn't run for the same inputs
     * more than once by keeping a record of the results for the given
     * inputs (usually in a hash map). We save a bunch of calls by checking
     * the map before computing the value.
     * @param n
     * @return
     */
    public int fibMemoization(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "Index was negative. No such thing as a negative index in a series.");

            // base cases
        } else if (n == 0 || n == 1) {
            return n;
        }

        // see if we've already calculated this
        if (memoizeMap.containsKey(n)) {
            return memoizeMap.get(n);
        }

        int result = fibMemoization(n - 1) + fibMemoization(n - 2);

        // memoize
        memoizeMap.put(n, result);

        return result;
    }
}
